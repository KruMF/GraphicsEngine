package graphicsEngineOld.utilities;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.*;
import java.awt.font.TextLayout;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Helper class for graphics.
 *
 * TODO: fix javadoc
 */
public class TextAligner {
    private static final int ROW_HEIGHT = 20, TEXT_OFFSET_FROM_BOTTOM = 5;

    //TODO: add javadoc
    public static void drawStringCentered(@NotNull Graphics g, @NotNull String string,
                                          int[] location) {
        drawStringCentered(g, string, location, null);
    }

    //TODO: add javadoc
    public static void drawStringCentered(@NotNull Graphics g, @NotNull String string,
                                          int[] location, @Nullable boolean[] centering) {
        Font font = g.getFont();
        FontMetrics fm = g.getFontMetrics();
        TextLayout textLayout = new TextLayout(string, font, fm.getFontRenderContext());

        boolean[] actualCentering = new boolean[] {true, true};

        if (centering != null) {
            actualCentering[0] = Objects.requireNonNullElse(centering[0], true);
            actualCentering[1] = Objects.requireNonNullElse(centering[1], true);
        }

        int dx = (int) (textLayout.getBounds().getWidth() / 2),
                height = fm.getAscent() + fm.getDescent(),
                dy = height / 2 + fm.getAscent(),
                x = location[0] - getOffset(dx, actualCentering[0]),
                y = location[1] - getOffset(dy, actualCentering[1]);

        g.drawString(string, x, y);
    }

    private static int getOffset(int delta, boolean offset) {
        if (offset) {
            return delta;
        } else {
            return 0;
        }
    }

    /**
     * Method for calculating vertical size of rows printed.
     *
     * @param count Number of rows.
     *
     * @return Height.
     *
     * TODO: needs rework
     */
    public static int rowsTotalHeight(int count) {
        return count * ROW_HEIGHT;
    }

    /**
     * Prints an array of strings vertically aligned.
     *
     * @param g         Graphics to use.
     * @param rowNumber Number of the starting row (starts at 0).
     * @param rows      Array of strings to print.
     * @param location  Starting XY location.
     *
     * @return Number of rows printed.
     *
     * TODO: needs rework
     */
    public static int drawStrings_VA(@NotNull Graphics g,
                                     int rowNumber, @NotNull String[] rows,
                                     int[] location) {
        for (String row : rows) {
            rowNumber++;
            int drawY = location[1] + (rowNumber) * ROW_HEIGHT - TEXT_OFFSET_FROM_BOTTOM;
            g.drawString(row, location[0], drawY);
        }
        return rowNumber;
    }

    /**
     * Draws and fills a table from specified parameters.
     *
     * @param g          Graphics to use.
     * @param header     Rows of text for table header.
     * @param columnData Titles and separations for columns.
     * @param rows       Array of data rows.
     * @param location   Starting location for whole table.
     *
     * @return Total row count (including header and column titles).
     *
     * TODO: needs rework
     */
    public static int drawTable(@NotNull Graphics g,
                                @NotNull String[] header,
                                @NotNull ArrayList<Column> columnData,
                                @NotNull ArrayList<String[]> rows,
                                int[] location) {
        int rowNumber = drawStrings_VA(
                g, 0,
                header,
                location);
        int rowNumberMax = rowNumber;

        //checks every column
        int columnX = location[0];
        for (int i = 0; i < columnData.size(); i++) {
            //title row
            columnX += columnData.get(i).separation;
            int rowNumberTemp = drawStrings_VA(
                    g, rowNumber,
                    new String[] {columnData.get(i).title},
                    new int[] {columnX, location[1]});

            //data rows
            rowNumberTemp = drawStrings_VA(
                    g, rowNumberTemp,
                    rows.get(i),
                    new int[] {columnX, location[1]});

            rowNumberMax = Math.max(rowNumberMax, rowNumberTemp);
        }
        return rowNumberMax;
    }

    /**
     * Column information class for printing a table.
     */
    public static class Column {
        public String title;
        public int separation;

        public Column(@NotNull String title, int separation){
            this.title = title;
            this.separation = separation;
        }
    }
}