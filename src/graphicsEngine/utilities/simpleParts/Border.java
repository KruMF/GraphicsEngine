package graphicsEngine.utilities.simpleParts;

import java.awt.*;
import java.util.Objects;

/**
 * A simple border with some color.
 */
public class Border extends SimplePart {
    public Color color;

    /**
     * Creates a border.
     *
     * @param color Color. (null = transparent)
     */
    public Border(Color color) {
        super();
        this.color = Objects.requireNonNullElse(
                color,
                new Color(0,0,0,0));
    }

    /**
     * Draws border.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        drawBorders(g);
    }

    /**
     * Draws a rectangle with specified color.
     *
     * @param g Graphics to use.
     */
    private void drawBorders(Graphics g) {
        g.setColor(color);
        g.drawRect(location[0], location[1], size[0], size[1]);
    }
}