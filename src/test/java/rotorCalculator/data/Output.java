package rotorCalculator.data;

import rotorCalculator.data.output.Utilities;
import rotorCalculator.data.output.table.Table;

import java.awt.*;

/**
 * Helper class for handling output data for rotor.
 *
 * TODO: update javadoc
 */
public class Output extends Utilities {
    public static Table table = new Table.ParticularTable(null);

    // add other output types here

    public static void drawTable(Graphics g, int[] location) {
        table.draw(g, location);
    }
}