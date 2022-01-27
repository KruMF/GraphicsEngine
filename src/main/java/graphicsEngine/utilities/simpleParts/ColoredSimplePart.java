package graphicsEngine.utilities.simpleParts;

import java.awt.*;
import java.util.Objects;

import com.google.inject.internal.Nullable;

/**
 * A simple part with a color assigned to it.
 */
public abstract class ColoredSimplePart extends SimplePart {
    //default color for transparent
    private static final Color DEFAULT_COLOR = new Color(0, 0, 0, 0);

    //actual color
    private Color color;

    /**
     * Constructor that creates super and assigns color.
     *
     * @param color Color of the part.
     */
    public ColoredSimplePart(@Nullable Color color) {
        super();
        setColor(color);
    }

    /**
     * Sets the color of the part.
     *
     * @param color Color. (null = transparent)
     */
    public void setColor(@Nullable Color color) {
        this.color = Objects.requireNonNullElse(color, DEFAULT_COLOR);
    }

    /**
     * Gets the color of the part.
     *
     * @return Color of the part.
     */
    public Color getColor() {
        return color;
    }
}