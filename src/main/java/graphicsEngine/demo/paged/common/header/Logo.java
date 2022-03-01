package graphicsEngine.demo.paged.common.header;

import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple logo object for paged demo.
 */
public class Logo extends SimplePart {
    protected static final double PROPORTIONS = (double) 16 / 9;
    private static final Color
            BACKGROUND_COLOR = Color.red,
            CIRCLE_COLOR = Color.white;

    /**
     * Constructor for the logo.
     *
     * @param size      Preferred size (accepts null).
     * @param fixedSize Directions for fixed size (null -> non-fixed).
     */
    public Logo(@Nullable int[] size, @Nullable boolean[] fixedSize) {
        super(size, fixedSize);
    }

    /**
     * Draws the logo.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        super.draw(g, location, size);
        drawLogo(g);
    }

    private void drawLogo(@NotNull Graphics g) {
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