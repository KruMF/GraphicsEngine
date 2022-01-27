package graphicsEngine.utilities.simpleParts;

import java.awt.*;

/**
 * A simple background with some color.
 */
public class Background extends ColoredSimplePart {

    /**
     * Creates a background.
     *
     * @param color Color. (null = transparent)
     */
    public Background(Color color) {
        super(color);
    }

    /**
     * Draws background.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        fillBackground(g);
    }

    /**
     * Fills a rectangle with specified color.
     *
     * @param g Graphics to use.
     */
    private void fillBackground(Graphics g) {
        g.setColor(getColor());
        g.fillRect(location[0], location[1], size[0], size[1]);
    }
}