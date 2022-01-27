package graphicsEngine.utilities.simpleParts;

import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple border with some color.
 */
public class Border extends ColoredSimplePart {

    /**
     * Creates a border.
     *
     * @param color Color. (null = transparent)
     */
    public Border(@Nullable Color color) {
        super(color);
    }

    /**
     * Draws border.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        super.draw(g, location, size);
        drawBorders(g);
    }

    /**
     * Draws a rectangle with specified color.
     *
     * @param g Graphics to use.
     */
    private void drawBorders(@NotNull Graphics g) {
        g.setColor(getColor());
        g.drawRect(location[0], location[1], size[0], size[1]);
    }
}