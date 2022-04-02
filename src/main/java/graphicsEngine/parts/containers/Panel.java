package graphicsEngine.parts.containers;

import graphicsEngine.parts.simpleParts.DrawablePart;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;

/**
 * A layer container with background and border pre-prepared.
 */
public class Panel extends ContentsBox {

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
        super(
                size, fixedSize,
                background, border,
                partContainer(panelParts, alignment));
    }

    private static PartContainer partContainer(@Nullable ArrayList<DrawablePart> panelParts,
                                               @Nullable AlignmentType alignment) {
        return new PartContainer(
                null, null,
                panelParts,
                Objects.requireNonNullElse(alignment, AlignmentType.TOP));
    }
}