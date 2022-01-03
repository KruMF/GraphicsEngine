package graphicsEngine.utilities.simpleParts;

import java.awt.*;

public class Border extends DrawablePart {
    public Color color;

    public Border(int[] _size, Color _color) {
        super(_size);
        color = _color;
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size) {
        super.draw(g, _location, _size);
        drawBorders(g);
    }

    /**
     * Draws a rectangle with specified color.
     * Draws transparent, if color is null.
     * @param g Graphics to use.
     */
    private void drawBorders(Graphics g) {
        if (color != null) {
            g.setColor(color);
        } else {
            g.setColor(new Color(0,0,0,0));
        }

        g.drawRect(location[0], location[1], size[0], size[1]);
    }
}