package graphicsEngineOld.engine.data.colors;

import java.util.Objects;
import java.awt.*;

import com.google.inject.internal.Nullable;

//TODO: add javadoc
public class PanelColors {
    private static final Color
            DEFAULT_LIGHT = Color.lightGray,
            DEFAULT_DARK = Color.darkGray;

    public Color light, dark;

    //TODO: add javadoc
    public PanelColors(@Nullable Color light, @Nullable Color dark) {
        setLight(light);
        setDark(dark);
    }

    //TODO: add javadoc
    public void setLight(@Nullable Color color) {
        this.light = Objects.requireNonNullElse(color, DEFAULT_LIGHT);
    }

    //TODO: add javadoc
    public void setDark(@Nullable Color color) {
        this.dark = Objects.requireNonNullElse(color, DEFAULT_DARK);
    }
}