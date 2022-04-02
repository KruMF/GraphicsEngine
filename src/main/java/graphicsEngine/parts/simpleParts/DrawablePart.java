package graphicsEngine.parts.simpleParts;

import java.awt.Graphics;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Interface for a drawable part.
 */
public interface DrawablePart {

    /**
     * Draws this part.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
    void draw(@NotNull Graphics g,
              @Nullable int[] location, @Nullable int[] size);

    /**
     * A helper method for relocating part.
     *
     * @param location New location.
     */
    void relocate(@Nullable int[] location);

    /**
     * A helper method for resizing part.
     *
     * @param size New size.
     */
    void resize(@Nullable int[] size);

    /**
     * Manual resize of the part. Intended for fixed parts.
     *
     * @param size New size.
     */
    void manualResize(int[] size);
}