package graphicsEngine.utilities.simpleParts;

import java.awt.Graphics;

public interface DrawablePart {

    /**
     * Draws this part.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    void draw(Graphics g, int[] location, int[] size);

    /**
     * A helper method for relocating part.
     *
     * @param location New location for drawing.
     */
    void relocate(int[] location);

    /**
     * A helper method for resizing part.
     *
     * @param size New maximum size for drawing.
     */
    void resize(int[] size);

    /**
     * Manual resize of the part. Intended for fixed parts.
     *
     * @param size New size for drawing.
     */
    void manualResize(int[] size);
}