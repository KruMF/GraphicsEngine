package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;
import java.awt.*;
import java.util.Objects;

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
    public PartContainer(int[] size, boolean[] fixedSize,
                         ArrayList<DrawablePart> parts, AlignmentType alignment) {
        super(size, fixedSize, parts);
        this.alignment = Objects.requireNonNullElse(alignment, AlignmentType.TOP);
    }

    /**
     * Draws parts in reverse order.
     *
     * @param g Graphics to use.
     */
    @Override
    public void drawParts(Graphics g) {
        RemainderHelper remainingSize = new RemainderHelper(RemainderHelper.getInitialSize(this));
        RemainderHelper drawingLocation = new RemainderHelper(RemainderHelper.getInitialLocation(this));

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

    private void drawSinglePart(Graphics g, SimplePart part,
                                RemainderHelper remainingSize, RemainderHelper drawLocation){
        int[] partLocation;
        int[] partSize;
        int sizeDifference;
        switch (alignment) {
            case LEFT: {
                part.resize(new int[] {remainingSize.x, size[1]}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[0];

                partLocation = new int[] {
                        location[0] + drawLocation.x,
                        location[1]};
                break;
            }
            case RIGHT: {
                part.resize(new int[] {remainingSize.x, size[1]}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[0];

                partLocation = new int[] {
                        location[0] + size[0] - drawLocation.x - sizeDifference,
                        location[1]};
                break;
            }
            case BOTTOM: {
                part.resize(new int[] {size[0], remainingSize.x}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[1];

                partLocation = new int[] {
                        location[0],
                        location[1] + size[1] - drawLocation.x - sizeDifference};
                break;
            }
            case TOP:
            default: { // TOP alignment by default
                part.resize(new int[] {size[0], remainingSize.x}); // stretches if possible
                partSize = part.size;
                sizeDifference = partSize[1];

                partLocation = new int[] {
                        location[0],
                        location[1] + drawLocation.x};
                break;
            }
        }
        remainingSize.modify(sizeDifference);
        drawLocation.modify(sizeDifference);
        part.draw(g, partLocation, partSize);
    }

    private static class RemainderHelper {
        int x;

        RemainderHelper(int x) {
            this.x = x;
        }

        void modify(int delta) {
            x += delta;
        }

        boolean checkRemaining(){
            return x > 0;
        }

        static int getInitialSize(PartContainer container) {
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

        static int getInitialLocation(PartContainer container) {
            switch (container.alignment) {
                case LEFT : {
                    return container.location[0];
                }
                case RIGHT : {
                    return container.location[0] + getInitialSize(container);
                }
                case BOTTOM : {
                    return container.location[1] + getInitialSize(container);
                }
                case TOP : {}
                default : {
                    return container.location[1];
                }
            }
        }
    }
}