package graphicsEngine.utilities.simpleParts;

import java.awt.*;

public abstract class SimplePart extends DrawablePart {
    public Background background;
    public Border border;

    public SimplePart(
            int[] _size,
            Color backgroundColor, Color borderColor) {
        super(_size);
        background = new Background(_size, backgroundColor);
        border = new Border(_size, borderColor);
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size) {
        super.draw(g, _location, _size);
        simpleDesign(g);
    }

    private void simpleDesign(Graphics g) {
        background.draw(g, location, size);
        border.draw(g, location, size);
    }
}