package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A layer container with background and border pre-prepared.
 */
public class Panel extends LayerContainer {

    /**
     * Creates a simple panel.
     *
     * @param size       Size of the panel.
     * @param fixedSize  Size fixation status for either direction.
     * @param background Background color.
     * @param border     Border color.
     * @param panelParts ArrayList of containable parts. (Alignable)
     * @param alignment  Alignment type of containable parts. (Null - align to top)
     */
    public Panel(int[] size, boolean[] fixedSize,
                 Color background, Color border,
                 ArrayList<DrawablePart> panelParts, AlignmentType alignment) {
        super(size, fixedSize, new ArrayList<>());
        parts.add(new Background(background));
        parts.add(new Border(border));
        parts.add(new PartContainer(
                null, null,
                panelParts, Objects.requireNonNullElse(alignment, AlignmentType.TOP)));
    }
}