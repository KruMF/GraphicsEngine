package graphicsEngine.colors;

import java.awt.Color;

import org.jetbrains.annotations.NotNull;

public class ColorUtilities {
    public static final @NotNull Color
            DEFAULT_COLOR_TRANSPARENT = new Color(0, 0, 0, 0),
            DEFAULT_COLOR_OPAQUE = Color.black;

    protected static final boolean DEFAULT_OPACITY = true;

    public static @NotNull Color defaultColorByOpacity(boolean opaque) {
        if (opaque) {
            return ColorUtilities.DEFAULT_COLOR_OPAQUE;
        } else {
            return ColorUtilities.DEFAULT_COLOR_TRANSPARENT;
        }
    }

    protected static @NotNull Color defaultColorForUnknownOpacity() {
        return defaultColorByOpacity(DEFAULT_OPACITY);
    }
}