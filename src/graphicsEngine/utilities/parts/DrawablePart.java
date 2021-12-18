package graphicsEngine.utilities.parts;

import java.awt.*;

public interface DrawablePart {

    void draw(Graphics g, int[] location, int[] size);

    void relocate(int[] location);

    void resize(int[] size);

}