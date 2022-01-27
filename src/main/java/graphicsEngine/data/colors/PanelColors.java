package graphicsEngine.data.colors;

import java.awt.*;
import java.util.Objects;

//TODO: add javadoc
public class PanelColors {
    private static final Color
            DEFAULT_LIGHT = Color.lightGray,
            DEFAULT_DARK = Color.darkGray;

    public Color light, dark;

    public PanelColors(Color light, Color dark) {
        setLight(light);
        setDark(dark);
    }

    public void setLight(Color color) {
        this.light = Objects.requireNonNullElse(color, DEFAULT_LIGHT);
    }

    public void setDark(Color color) {
        this.dark = Objects.requireNonNullElse(color, DEFAULT_DARK);
    }
}