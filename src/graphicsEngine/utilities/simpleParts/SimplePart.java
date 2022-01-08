package graphicsEngine.utilities.simpleParts;

import java.awt.*;
import java.util.Objects;

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
    public SimplePart(int[] size, boolean[] fixedSize) {
        relocate(new int[] {0, 0});
        this.fixedSize = Objects.requireNonNullElse(
                fixedSize,
                new boolean[] {false, false});
        this.size = Objects.requireNonNullElse(
                size,
                new int[] {0, 0});
    }

    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        relocate(location);
        resize(size);
    }

    @Override
    public void relocate(int[] location) {
        if (location != null && location.length == 2) {
            this.location = location;
        }
    }

    @Override
    public void resize(int[] size) {
        if (size != null && size.length == 2) {
            if (!fixedSize[0]) {
                this.size[0] = size[0];
            }
            if (!fixedSize[1]) {
                this.size[1] = size[1];
            }
        }
    }

    public void manualResize(int[] size) {
        if (size != null && size.length == 2) {
            this.size = size;
        }
    }
}