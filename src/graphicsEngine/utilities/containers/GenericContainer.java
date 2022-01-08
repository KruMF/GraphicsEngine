package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.buttons.Button;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;
import java.util.ArrayList;

public abstract class GenericContainer extends SimplePart implements ButtonContainer {
    public ArrayList<DrawablePart> parts;

    /**
     * Creates a part container with specified alignment.
     *
     * @param size      Size of the container.
     * @param fixedSize Size fixation by axis.
     * @param parts     Parts to contain.
     */
    public GenericContainer(int[] size, boolean[] fixedSize,
                            ArrayList<DrawablePart> parts) {
        super(size, fixedSize);
        this.parts = parts;
    }

    /**
     * Draws the part container.
     *
     * @param g        Graphics to use.
     * @param location Starting location.
     * @param size     Container size.
     */
    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        if (parts != null){
            drawParts(g);
        }
    }

    /**
     * Draws contained parts.
     * Must be overriden.
     *
     * @param g Graphics to use
     */
    public void drawParts(Graphics g) {}

    @Override
    public void buttonInteractionCheck(InputData input) {
        if (parts != null) {
            for (DrawablePart part : parts) {
                if (part instanceof Button) {
                    ((Button) part).interactionCheck(input);
                } else if (part instanceof GenericContainer) {
                    ((GenericContainer) part).buttonInteractionCheck(input);
                }
            }
        }
    }

    @Override
    public void buttonActionCheck() {
        if (parts != null) {
            for (DrawablePart part : parts) {
                if (part instanceof Button) {
                    ((Button) part).actionCheck();
                } else if (part instanceof GenericContainer) {
                    ((GenericContainer) part).buttonActionCheck();
                }
            }
        }
    }
}