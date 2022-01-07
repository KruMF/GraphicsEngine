package graphicsEngine.utilities.simpleParts;

import java.awt.*;
import java.util.Objects;

public class Background extends SimplePart {
    public Color color;

    public Background(int[] size, boolean[] fixedSize, Color color) {
        super(size, fixedSize);
        this.color = Objects.requireNonNullElse(
                color,
                new Color(0, 0, 0, 0));
    }

    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        fillBackground(g);
    }

    /**
     * Fills a rectangle with specified color.
     * @param g Graphics to use.
     */
    private void fillBackground(Graphics g) {
        g.setColor(color);
        g.fillRect(location[0], location[1], size[0], size[1]);
    }
}