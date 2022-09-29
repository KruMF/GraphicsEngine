package graphicsEngine.panels;

import java.awt.Color;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BorderProperties implements BorderInterface {
    private @NotNull Color borderColor = DEFAULT_BORDER_COLOR;
    private boolean drawBorders = DEFAULT_BORDER_STATE;

    BorderProperties() {
        this(null, DEFAULT_BORDER_STATE);
    }

    BorderProperties(@Nullable Color color,
                     boolean drawBorders) {
        setBorderColor(color);
        setBorderState(drawBorders);
    }

    public void setBorderColor(@Nullable Color color) {
        borderColor = Objects.requireNonNullElse(color, DEFAULT_BORDER_COLOR);
    }

    public @NotNull Color getBorderColor() {
        return borderColor;
    }

    public void setBorderState(boolean drawBorders) {
        this.drawBorders = drawBorders;
    }

    public void toggleBorderState() {
        drawBorders = !drawBorders;
    }

    public boolean getBorderState() {
        return drawBorders;
    }
}