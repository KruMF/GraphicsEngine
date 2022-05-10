package graphicsEngineOld.parts.simpleParts;

import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple background with some color.
 */
public class Background extends ColoredSimplePart {

    /**
     * Creates a background.
     *
     * @param color Color. (null = transparent)
     */
    public Background(@Nullable Color color) {
        super(color);
    }

    /**
     * Draws background.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        super.draw(g, location, size);
        fillBackground(g);
    }

    /**
     * Fills a rectangle with specified color.
     *
     * @param g Graphics to use.
     */
    private void fillBackground(@NotNull Graphics g) {
        g.fillRect(location[0], location[1], size[0], size[1]);
    }
}