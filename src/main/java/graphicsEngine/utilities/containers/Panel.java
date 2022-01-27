package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;

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
    public Panel(@Nullable int[] size, @Nullable boolean[] fixedSize,
                 @Nullable Color background, @Nullable Color border,
                 @Nullable ArrayList<DrawablePart> panelParts, @Nullable AlignmentType alignment) {
        super(size, fixedSize, new ArrayList<>());

        parts.add(new Background(background));
        parts.add(new Border(border));

        parts.add(partContainer(panelParts, alignment));
    }

    private static PartContainer partContainer(@Nullable ArrayList<DrawablePart> panelParts,
                                               @Nullable AlignmentType alignment) {
        return new PartContainer(
                null, null,
                panelParts,
                Objects.requireNonNullElse(alignment, AlignmentType.TOP));
    }

    /**
     * Sets the background color of the panel.
     *
     * @param color New color.
     */
    @SuppressWarnings("unused")
    public void setBackgroundColor(@Nullable Color color) {
        ((Background) parts.get(0)).setColor(color);
    }

    /**
     * Sets the border color of the panel.
     *
     * @param color New color.
     */
    @SuppressWarnings("unused")
    public void setBorderColor(@Nullable Color color) {
        ((Border) parts.get(1)).setColor(color);
    }
}