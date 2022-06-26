package graphicsEngineOld.parts.containers;

import graphicsEngineOld.parts.simpleParts.DrawablePart;

import java.util.ArrayList;
import java.awt.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

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
    public LayerContainer(@Nullable int[] size, @Nullable boolean[] fixedSize,
                          @Nullable ArrayList<DrawablePart> parts) {
        super(size, fixedSize, parts);
    }

    /**
     * Draws contained parts as layers.
     *
     * @param g Graphics to use.
     */
    @Override
    public void drawParts(@NotNull Graphics g) {
        for (DrawablePart part : parts) {
            if (part != null) {
                part.draw(g, location, size);
            }
        }
    }
}