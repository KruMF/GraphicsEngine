package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.simpleParts.SimplePart;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

// TODO: add javadoc
public class Logo extends SimplePart {
    private static final double PROPORTIONS = 0.8;
    private static final Color
            BACKGROUND_COLOR = Color.red,
            CIRCLE_COLOR = Color.white;

    public Logo(int[] size, boolean[] fixedSize) {
        super(size, fixedSize);
    }

    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size){
        super.draw(g, location, size);
        drawLogo(g);
    }

    private void drawLogo(Graphics g){
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(this.location[0], this.location[1], this.size[0], this.size[1]);

        g.setColor(CIRCLE_COLOR);

        // calculates diameter
        double size = Math.min(this.size[0], this.size[1]) * PROPORTIONS;
        // calculates final position of circle
        int[] location = new int[] {
                (int) (this.location[0] + (double) this.size[0] / 2 - size / 2),
                (int) (this.location[1] + (double) this.size[1] / 2 - size / 2)
        };

        g.fillOval(location[0], location[1], (int) size, (int) size);
    }
}