package graphicsEngine.utilities.parts;

import graphicsEngine.GraphicsHelper;

import java.awt.*;

public abstract class SimplePart implements DrawablePart {

    public int[] location;
    public int[] size;

    public Color backgroundColor;
    public boolean background;

    public Color borderColor;
    public boolean borderN, borderE, borderS, borderW;

    public SimplePart(
            Color _backgroundColor, boolean _background,
            Color _borderColor,
            boolean _borderN, boolean _borderE, boolean _borderS, boolean _borderW,
            int[] _size) {
        backgroundColor = _backgroundColor;
        background = _background;

        borderColor = _borderColor;
        borderN = _borderN;
        borderE = _borderE;
        borderS = _borderS;
        borderW = _borderW;

        resize(_size);
        relocate(new int[]{0, 0});
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size) {
        resize(_size);
        relocate(_location);
        simpleDesign(g);
    }

    @Override
    public void resize(int[] _size) {
        size = _size;
    }

    @Override
    public void relocate(int[] _location) {
        location = _location;
    }

    private void simpleDesign(Graphics g) {
        if (background) GraphicsHelper.drawBackground(g, backgroundColor, location, size);
        drawBorders(g);
    }

    private void drawBorders(Graphics g) {
        if (borderColor != null) g.setColor(borderColor);

        if (borderN) g.drawLine(
                location[0],
                location[1],
                location[0] + size[0],
                location[1]);

        if (borderE) g.drawLine(
                location[0] + size[0],
                location[1],
                location[0] + size[0],
                location[1] + size[1]);

        if (borderS) g.drawLine(
                location[0],
                location[1] + size[1],
                location[0] + size[0],
                location[1] + size[1]);

        if (borderW) g.drawLine(
                location[0],
                location[1],
                location[0],
                location[1] + size[1]);
    }
}