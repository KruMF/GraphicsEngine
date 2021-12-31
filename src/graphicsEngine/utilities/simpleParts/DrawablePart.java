package graphicsEngine.utilities.simpleParts;

import java.awt.Graphics;

public abstract class DrawablePart implements DrawablePartInterface {

    public int[] location;
    public int[] size;

    public DrawablePart(int[] _size) {
        relocate(new int[]{0, 0});
        resize(_size);
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size) {
        relocate(_location);
        resize(_size);
    }

    @Override
    public void relocate(int[] _location) {
        location = _location;
    }

    @Override
    public void resize(int[] _size) {
        size = _size;
    }
}