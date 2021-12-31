package graphicsEngine.utilities;

import java.awt.Graphics;
import java.util.ArrayList;

public class GraphicsHelper {

    private static final int rowHeight = 20, textOffsetFromBottom = 5;

    /**
     * Method for calculating vertical size of rows printed.
     * @param count Number of rows.
     * @return Height.
     */
    public static int rowsTotalHeight(int count){
        return count * rowHeight;
    }

    /**
     * Prints an array of strings vertically aligned.
     * @param g Graphics to use.
     * @param rowNumber Number of the starting row (starts at 0).
     * @param rows Array of strings to print.
     * @param location Starting XY location.
     * @return Number of rows printed.
     */
    public static int drawStrings_VA(
            Graphics g,
            int rowNumber, String[] rows,
            int[] location){
        for (String row : rows){
            rowNumber++;
            int drawY = location[1] + (rowNumber) * rowHeight - textOffsetFromBottom;
            g.drawString(row, location[0], drawY);
        }
        return rowNumber;
    }

    /**
     * Draws and fills a table from specified parameters.
     * @param g Graphics to use.
     * @param header Rows of text for table header.
     * @param columnData Titles and separations for columns.
     * @param rows Array of data rows.
     * @param location Starting location for whole table.
     * @return Total row count (including header and column titles).
     */
    public static int drawTable(
            Graphics g,
            String[] header, ArrayList<Column> columnData, ArrayList<String[]> rows,
            int[] location){
        int rowNumber = drawStrings_VA(
                g, 0,
                header,
                location);
        int rowNumberMax = rowNumber;

        //checks every column
        int columnX = location[0];
        for (int i = 0; i < columnData.size(); i++){
            //title row
            columnX += columnData.get(i).separation;
            int rowNumberTemp = drawStrings_VA(
                    g, rowNumber,
                    new String[]{columnData.get(i).title},
                    new int[]{columnX, location[1]});

            //data rows
            rowNumberTemp = drawStrings_VA(
                    g, rowNumberTemp,
                    rows.get(i),
                    new int[]{columnX, location[1]});

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

        public Column(String _title, int _separation){
            title = _title;
            separation = _separation;
        }
    }
}