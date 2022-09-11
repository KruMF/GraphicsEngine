package graphicsEngine.panels;

import java.util.Objects;
import java.awt.Color;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class PanelColors {
    //TODO: make private and use getters
    public Color background, text, border;

    private static final Color
            DEFAULT_COLOR_BACKGROUND = new Color(204, 204, 204),//Color.lightGray,
            DEFAULT_COLOR_TEXT = Color.darkGray,
            DEFAULT_COLOR_BORDER = Color.red;

    //TODO: add javadoc
    public PanelColors() {
        this(null, null, null);
    }

    //TODO: add javadoc
    public PanelColors(@Nullable Color background,
                       @Nullable Color text,
                       @Nullable Color border) {
        this.background = Objects.requireNonNullElse(background, DEFAULT_COLOR_BACKGROUND);
        this.text = Objects.requireNonNullElse(text, DEFAULT_COLOR_TEXT);
        this.border = Objects.requireNonNullElse(border, DEFAULT_COLOR_BORDER);
    }
}