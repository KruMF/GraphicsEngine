package graphicsEngine.parts.simpleParts;

import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple part with a color assigned to it.
 */
public abstract class ColoredSimplePart extends SimplePart {
    // default color for transparent
    private static final Color DEFAULT_COLOR = new Color(0, 0, 0, 0);

    // custom default color
    public static Color defaultColor;

    // actual color
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
        this.color = Objects.requireNonNullElse(color, getDefaultColor());
    }

    // TODO: add javadoc
    public void resetColor() {
        this.color = getDefaultColor();
    }

    private static Color getDefaultColor() {
        return Objects.requireNonNullElse(defaultColor, DEFAULT_COLOR);
    }

    /**
     * Gets the color of the part.
     *
     * @return Color of the part.
     */
    public Color getColor() {
        return color;
    }

    // TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        g.setColor(color);
    }
}