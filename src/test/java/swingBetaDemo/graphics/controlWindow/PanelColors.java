package swingBetaDemo.graphics.controlWindow;

import java.awt.*;

//TODO: elevate and add javadoc
public class PanelColors {
    public Color background, text, border;

    private static final Color
            DEFAULT_COLOR_BACKGROUND = Color.lightGray,
            DEFAULT_COLOR_TEXT = Color.darkGray,
            DEFAULT_COLOR_BORDER = Color.red;

    public PanelColors() {
        this(DEFAULT_COLOR_BACKGROUND, DEFAULT_COLOR_TEXT, DEFAULT_COLOR_BORDER);
    }

    public PanelColors(Color background, Color text, Color border) {
        this.background = background;
        this.text = text;
        this.border = border;
    }
}