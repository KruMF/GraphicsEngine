package graphicsEngine.parts.containers;

import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.simpleParts.SimplePart;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A part container for containing simple parts and aligning them in specified way.
 */
public class PartContainer extends GenericContainer {
    public AlignmentType alignment;

    /**
     * Creates a part container with specified alignment.
     *
     * @param size      Size of the container. (Accepts null)
     * @param fixedSize Size fixation by axis. (Null - non-fixed)
     * @param parts     Parts to contain. (Accepts null)
     * @param alignment Alignment to use. (By default aligned to top)
     */
    public PartContainer(@Nullable int[] size, @Nullable boolean[] fixedSize,
                         @Nullable ArrayList<DrawablePart> parts, @Nullable AlignmentType alignment) {
        super(size, fixedSize, parts);
        this.alignment = Objects.requireNonNullElse(alignment, AlignmentType.TOP);
    }

    /**
     * Draws contained parts one after another.
     *
     * @param g Graphics to use.
     */
    @Override
    public void drawParts(@NotNull Graphics g) {
        RemainderHelper remainingSize = new RemainderHelper(RemainderHelper.getInitialSize(this));
        RemainderHelper drawingLocation = new RemainderHelper(0);

        for (DrawablePart drawablePart : parts) {
            if (!remainingSize.checkRemaining()) {
                break;
            }

            SimplePart part = (SimplePart) drawablePart;
            if (part != null) {
                drawSinglePart(g, part, remainingSize, drawingLocation);
            }
        }
    }

    /**
     * Draws a single contained part.
     *
     * @param g             Graphics to use.
     * @param part          Part to draw.
     * @param remainingSize Remaining size for drawing.
     * @param drawLocation  Location offset from containers location.
     */
    private void drawSinglePart(@NotNull Graphics g, @NotNull SimplePart part,
                                @NotNull RemainderHelper remainingSize,
                                @NotNull RemainderHelper drawLocation) {
        int[] partLocation;
        int[] partSize;
        int sizeDifference;
        switch (alignment) {
            case LEFT : {
                part.resize(new int[] {remainingSize.x, size[1]}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[0];

                partLocation = new int[] {
                        location[0] + drawLocation.x,
                        location[1]};
                break;
            }
            case RIGHT : {
                part.resize(new int[] {remainingSize.x, size[1]}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[0];

                partLocation = new int[] {
                        location[0] + size[0] - drawLocation.x - sizeDifference,
                        location[1]};
                break;
            }
            case BOTTOM : {
                part.resize(new int[] {size[0], remainingSize.x}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[1];

                partLocation = new int[] {
                        location[0],
                        location[1] + size[1] - drawLocation.x - sizeDifference};
                break;
            }
            case TOP : {}
            default : { // TOP alignment by default
                part.resize(new int[] {size[0], remainingSize.x}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[1];

                partLocation = new int[] {
                        location[0],
                        location[1] + drawLocation.x};
            }
        }
        remainingSize.modify((-1) * sizeDifference);
        drawLocation.modify(sizeDifference);
        part.draw(g, partLocation, partSize);
    }

    /**
     * A helper class for calculating remainders
     *
     * TODO: update javadoc
     */
    private static class RemainderHelper {
        int x;

        RemainderHelper(int x) {
            this.x = x;
        }

        void modify(int delta) {
            x += delta;
        }

        boolean checkRemaining() {
            return x > 0;
        }

        static int getInitialSize(@NotNull PartContainer container) {
            switch (container.alignment) {
                case LEFT, RIGHT : {
                    return container.size[0];
                }
                case TOP, BOTTOM : {}
                default : {
                    return container.size[1];
                }
            }
        }
    }
}