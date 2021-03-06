package graphicsEngineOld.parts.simpleParts;

import java.util.Objects;
import java.awt.Graphics;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple drawable part with updatable size and location.
 */
public abstract class SimplePart implements DrawablePart {
    public int[] location;
    public int[] size;
    public boolean[] fixedSize;

    /**
     * Creates a stretchable part.
     */
    public SimplePart() {
        relocate(new int[] {0, 0});
        fixedSize = new boolean[] {false, false};
        size = new int[] {0, 0};
    }

    /**
     * Creates a part with fixable size in either or both directions.
     *
     * @param size      Preferred size (accepts null)
     * @param fixedSize Directions for fixed size (null -> non-fixed)
     */
    public SimplePart(@Nullable int[] size, @Nullable boolean[] fixedSize) {
        relocate(new int[] {0, 0});
        this.fixedSize = Objects.requireNonNullElse(
                fixedSize,
                new boolean[] {false, false});
        this.size = Objects.requireNonNullElse(
                size,
                new int[] {0, 0});
    }

    /**
     * Draws this part.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        relocate(location);
        resize(size);
    }

    /**
     * Relocates part to final position for drawing.
     *
     * @param location New location. (Null - unchanged)
     */
    @Override
    public void relocate(@Nullable int[] location) {
        if (validateCoordinates(location)) {
            this.location = location;
        }
    }

    /**
     * Resizes part to provided size if not fixed in corresponding direction.
     *
     * @param size New size. (Null - unchanged)
     */
    @Override
    public void resize(@Nullable int[] size) {
        if (validateCoordinates(size)) {
            if (!fixedSize[0]) {
                this.size[0] = size[0];
            }
            if (!fixedSize[1]) {
                this.size[1] = size[1];
            }
        }
    }

    /**
     * Manual resize of the part. Intended for fixed parts.
     *
     * @param size New size. (Null - doesn't resize)
     */
    @Override
    public void manualResize(@Nullable int[] size) {
        if (validateCoordinates(size)) {
            this.size = size;
        }
    }

    /**
     * Validates if provided coordinates are valid 2D integer array.
     *
     * @param x Array of integers to check.
     *
     * @return True - if valid, false - if null or incorrect size.
     */
    private boolean validateCoordinates(@Nullable int[] x) {
        return (x != null) && (x.length == 2);
    }
}