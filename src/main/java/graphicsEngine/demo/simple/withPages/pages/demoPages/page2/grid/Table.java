package graphicsEngine.demo.simple.withPages.pages.demoPages.page2.grid;

import java.util.ArrayList;
import java.awt.*;

public class Table {
    private static final int
            COLUMN_COUNT = 5,
            ROW_COUNT = 5;
    private static final Color GRID_COLOR = Color.white;

    private ArrayList<ArrayList<Cell>> table;

    public Table() {
        table = defaultTable();
    }

    private static ArrayList<ArrayList<Cell>> defaultTable() {
        return new ArrayList<>() {{
            for (int i = 0; i < COLUMN_COUNT; i++) {
                add(new ArrayList<>() {{
                    for (int j = 0; j < ROW_COUNT; j++) {
                        add(new Cell());
                    }
                }});
            }
        }};
    }

    /**
     * Randomizes cell values.
     */
    public void randomizeCellValues() {
        //check every column
        for (int i = 0; i < table.size(); i++) {
            ArrayList<Cell> column = table.get(i);

            //check every row
            for (int j = 0; j < column.size(); j++) {
                Cell cell = column.get(j);

                cell.setRandomValue();
            }
        }
    }

    public void draw(Graphics g, int[] location, int[] size) {
        drawCells(g, location, size);
        drawGrid(g, location, size);
    }

    private void drawCells(Graphics g, int[] location, int[] size) {
        double[] cell_size = new double[] {
                (double) size[0] / COLUMN_COUNT,
                (double) size[1] / ROW_COUNT};

        //check every column
        for (int i = 0; i < table.size(); i++) {
            ArrayList<Cell> column = table.get(i);

            //check every row
            for (int j = 0; j < column.size(); j++) {
                Cell cell = column.get(j);

                cell.draw(g,
                        new int[] {
                                location[0] + (int) (i * cell_size[0]),
                                location[1] + (int) (j * cell_size[1])},
                        new int[] {
                                (int) cell_size[0],
                                (int) cell_size[1]});
            }
        }
    }

    private void drawGrid(Graphics g, int[] location, int[] size) {
        g.setColor(GRID_COLOR);

        drawHorizontalLines(g, location, size);
        drawVerticalLines(g, location, size);
    }

    private void drawVerticalLines(Graphics g, int[] location, int[] size) {
        double column_width = (double) size[0] / COLUMN_COUNT;
        for (int i = 0; i <= COLUMN_COUNT; i++) {
            int x = location[0] + (int) (i * column_width);

            g.drawLine(
                    x, location[1],
                    x, location[1] + size[1]);
        }
    }

    private void drawHorizontalLines(Graphics g, int[] location, int[] size) {
        double row_height = (double) size[1] / ROW_COUNT;
        for (int i = 0; i <= ROW_COUNT; i++) {
            int y = location[1] + (int) (i * row_height);

            g.drawLine(
                    location[0], y,
                    location[0] + size[0], y);
        }
    }
}