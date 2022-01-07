package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;

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
     *
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

        //Draws parts in reverse order.
        /*
        for (int i = parts.size() - 1; i >= 0; i--) {
            DrawablePart part = parts.get(i);
            if (part != null) {
                part.draw(g, location, size);
            }
        }
         */
    }
}