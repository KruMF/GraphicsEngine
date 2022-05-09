package graphicsEngine.oldPagedDemo.pages.demoPages.page3.sidePanel;

import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.containers.AlignmentType;
import graphicsEngine.parts.containers.PartContainer;
import graphicsEngine.parts.interactive.buttons.Button;

import java.util.ArrayList;

/**
 * TODO: needs rework and javadoc
 */
public class ButtonGrid extends PartContainer {
    private static final int DEFAULT_BUTTON_COUNT_HORIZONTALLY = 5;

    /**
     * Creates a grid of buttons.
     *
     * @param buttons Buttons for the grid.
     * @param buttonHeight Button height in pixels.
     * @param maxButtonCountHorizontally Maximum number of buttons per row.
     */
    public ButtonGrid(ArrayList<Button> buttons,
                      int buttonHeight, int maxButtonCountHorizontally) {
        super(
                getGridSize(buttons.size(), buttonHeight, maxButtonCountHorizontally),
                new boolean[] {false, true},
                generateRows(buttons, maxButtonCountHorizontally), AlignmentType.TOP);
    }

    private static int getRowCount(int buttonCount, int maxButtonCountHorizontally) {
        return (int) Math.ceil((double) buttonCount / maxButtonCountHorizontally);
    }

    private static int[] getGridSize(int buttonCount, int buttonHeight, int maxButtonCountHorizontally) {
        return new int[] {
                0,
                getRowCount(buttonCount, maxButtonCountHorizontally) * buttonHeight};
    }

    private static double[] getButtonSize(int buttonHeight, int panelWidth, int maxButtonCountHorizontally) {
        return new double[] {

        };
    }

    private static ArrayList<DrawablePart> generateRows(ArrayList<Button> buttons, int maxButtonCountHorizontally) {
        ArrayList<DrawablePart> returnable = new ArrayList<>();
        ArrayList<Button> currentRow = new ArrayList<>();

        int[] buttonSize = null;//getButtonSize();

        for (int i = 0; i < buttons.size(); i++) {
            currentRow.add(buttons.get(i));

            if (currentRow.size() >= maxButtonCountHorizontally) {
                returnable.add(generateSingleRow(buttons, maxButtonCountHorizontally));
                currentRow = new ArrayList<>();
            }
        }

        return returnable;
    }

    private static ButtonRow generateSingleRow(ArrayList<Button> buttons, int maxButtonCountHorizontally) {
        return new ButtonRow(null/*buttons*/, null/*buttonSize*/, maxButtonCountHorizontally);
    }

    // TODO: needs rework
    public static class ButtonRow extends PartContainer {

        /**
         * Creates a row of buttons.
         *
         * @param buttons    Buttons for this row
         * @param buttonSize Size of a single button
         * @param maxButtonCountHorizontally
         */
        public ButtonRow(ArrayList<DrawablePart> buttons,
                         int[] buttonSize, int maxButtonCountHorizontally) {
            super(
                    new int[] {
                            buttonSize[0] * maxButtonCountHorizontally,
                            buttonSize[1]},
                    new boolean[] {false, true},
                    buttons, AlignmentType.LEFT);
        }
    }
}