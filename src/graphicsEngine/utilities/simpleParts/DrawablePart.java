package graphicsEngine.utilities.simpleParts;

import java.awt.Graphics;

public interface DrawablePart {
    void draw(Graphics g, int[] location, int[] size);
    void relocate(int[] location);
    void resize(int[] size);
    void manualResize(int[] size);
}