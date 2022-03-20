package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Table;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.Utilities;

import java.awt.Graphics;

/**
 * Helper class for handling output data for rotor.
 *
 * TODO: update javadoc
 */
public class Output extends Utilities {
    public static final int[] TABLE_LOCATION = new int[] {300, 50};

    public static Table table = new Table.ParticularTable(TABLE_LOCATION);

    // add other output types here

    public static void drawTable(Graphics g, int[] location) {
        table.draw(g, location);
    }
}