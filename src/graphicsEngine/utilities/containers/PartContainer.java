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
     * @param size      Size of the container.
     * @param fixedSize Size fixation by axis.
     * @param parts     Parts to contain.
     * @param alignment Alignment to use.
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
        LocationAndSize temporaryLocationAndSize = getInitialRemainder();

        for (int i = parts.size() - 1; i >= 0; i--) {
            if (temporaryLocationAndSize.size <= 0 ){
                break;
            }

            SimplePart part = (SimplePart) parts.get(i);
            if (part != null) {
                switch (alignment) {
                    case LEFT, RIGHT : {
                        temporaryLocationAndSize.modify(alignment, part.size[0]);
                        part.draw(g,
                                temporaryLocationAndSize.location,
                                new int[] {part.size[0], size[1]});
                        break;
                    }
                    case TOP, BOTTOM : {}
                    default : { // TOP alignment by default
                        temporaryLocationAndSize.modify(alignment, part.size[1]);
                        part.draw(g,
                                temporaryLocationAndSize.location,
                                new int[] {size[0], part.size[1]});
                    }
                }
            }
        }
    }

    /**
     * A helper class for aligning parts.
     */
    private static class LocationAndSize {
        int[] location;
        int size;

        LocationAndSize(int[] location, int size) {
            this.location = location;
            this.size = size;
        }

        void modify(AlignmentType alignment, int amount) {
            switch (alignment) {
                case BOTTOM : {
                    location = new int[] {
                            location[0],
                            location[1] - amount
                    };
                    break;
                }
                case LEFT : {
                    location = new int[] {
                            location[0] + amount,
                            location[1]
                    };
                    break;
                }
                case RIGHT : {
                    location = new int[] {
                            location[0] - amount,
                            location[1]
                    };
                    break;
                }
                case TOP : {} // default alignment type
                default : {
                    location = new int[] {
                            location[0],
                            location[1] + amount
                    };
                    break;
                }
            }

            size -= amount;
        }
    }

    private LocationAndSize getInitialRemainder() {
        switch (alignment) {
            case BOTTOM : {
                return new LocationAndSize(
                        new int[] {
                                location[0],
                                location[1] + size[1]},
                        size[1]);
            }
            case LEFT : {
                return new LocationAndSize(
                        location,
                        size[0]);
            }
            case RIGHT : {
                return new LocationAndSize(
                        new int[] {
                                location[0] + size[0],
                                location[1]},
                        size[0]);
            }
            case TOP : {} // default alignment type
            default : {
                return new LocationAndSize(
                        location,
                        size[1]);
            }
        }
    }
}