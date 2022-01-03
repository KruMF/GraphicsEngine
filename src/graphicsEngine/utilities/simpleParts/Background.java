package graphicsEngine.utilities.simpleParts;

import java.awt.*;

public class Background extends DrawablePart {
    public Color color;

    public Background(int[] _size, Color _color) {
        super(_size);
        color = _color;
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size) {
        super.draw(g, _location, _size);
        fillBackground(g);
    }

    /**
     * Fills a rectangle with specified color.
     * Fills transparent, if color is null.
     * @param g Graphics to use.
     */
    private void fillBackground(Graphics g) {
        if (color != null) {
            g.setColor(color);
        } else {
            g.setColor(new Color(0,0,0,0));
        }

        g.fillRect(location[0], location[1], size[0], size[1]);
    }
}