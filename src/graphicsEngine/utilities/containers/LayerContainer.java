package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;

/**
 * A container containing simple parts that draws them as layers on top of one another.
 */
public class LayerContainer extends GenericContainer {

    /**
     * Creates a layer container.
     *
     * @param size      Size of the container.
     * @param fixedSize Size fixation by axis.
     * @param parts     Parts to contain.
     */
    public LayerContainer(int[] size, boolean[] fixedSize, ArrayList<DrawablePart> parts) {
        super(size, fixedSize, parts);
    }

    /**
     * Draws contained parts as layers.
     *
     * @param g Graphics to use.
     */
    @Override
    public void drawParts(Graphics g) {
        for (DrawablePart part : parts) {
            if (part != null) {
                part.draw(g, location, size);
            }
        }
    }
}