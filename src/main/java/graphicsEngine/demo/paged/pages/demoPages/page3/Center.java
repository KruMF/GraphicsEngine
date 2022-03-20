package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Output;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class Center extends SimplePart {
    private static final int[] TEXT_STARTING_LOCATION = new int[] {300, 50};
    private static final int COLUMN_COUNT = 3;
    private static final int[] TEXT_COLUMN_WIDTHS = new int[] {300, 300};

    private static int[][] textColumnLocations;

    static {
        textColumnLocations = new int[COLUMN_COUNT][];
        int xOffset = 0;
        for (int i = 0; i < COLUMN_COUNT; i++) {
            if (i > 0) {
                xOffset += TEXT_COLUMN_WIDTHS[i - 1];
            }
            textColumnLocations[i] = new int[] {
                    TEXT_STARTING_LOCATION[0] + xOffset,
                    TEXT_STARTING_LOCATION[1]
            };
        }
    }

    //TODO: add javadoc
    protected Center() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        drawPageMessage(g);
        drawRotorInfo(g);

        //draw other stuff here
    }

    private void drawPageMessage(Graphics g) {
        g.setColor(Color.green);
        GraphicsHelper.drawStringCentered(g, "This is the demo page 3",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});
    }

    private void drawRotorInfo(Graphics g) {
        g.setColor(Color.orange);
        for (int i = 0; i < COLUMN_COUNT; i ++) {
            drawColumn(g, i);
        }
    }

    private void drawColumn(Graphics g, int columnIndex) {
        if (columnIndex < COLUMN_COUNT) {
            String[] output = switch (columnIndex) {
                case 0 -> Output.firstColumnStringArray();
                case 1 -> Output.secondColumnStringArray();
                case 2 -> Output.thirdColumnStringArray();
                default -> new String[] {};
            };

            GraphicsHelper.drawStrings_VA(
                    g, 0, output, new int[] {
                            textColumnLocations[columnIndex][0] + this.location[0],
                            textColumnLocations[columnIndex][1] + this.location[1]
                    });
        }
    }
}