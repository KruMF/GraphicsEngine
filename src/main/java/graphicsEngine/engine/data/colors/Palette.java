package graphicsEngine.engine.data.colors;

import java.util.Objects;
import java.awt.Color;

import com.google.inject.internal.Nullable;

/**
 * Color palette class.
 */
public class Palette {
    private static final Color
            BACKGROUND_DEFAULT = Color.black,
            TEXT_COLOR_DEFAULT = Color.white;

    public Color backgroundColor;

    public ButtonColors buttonColors;
    public PanelColors panelColors;

    public Color textColor;

    /**
     * Creates a color palette with specified parameters.
     *
     * @param buttonColors  A ButtonColors object. (Null - ButtonColors with default values)
     * @param panelColors   A PanelColors object. (Null - PanelColors with default values)
     * @param textColor     Main text color. (Null - default text color)
     */
    public Palette(@Nullable ButtonColors buttonColors, @Nullable PanelColors panelColors, @Nullable Color textColor) {
        setBackgroundColor(null);

        setButtonColors(buttonColors);
        setPanelColors(panelColors);

        setTextColor(textColor);
    }

    //TODO: add javadoc
    public void setBackgroundColor(@Nullable Color color) {
        this.backgroundColor = Objects.requireNonNullElse(color, BACKGROUND_DEFAULT);
    }

    //TODO: add javadoc
    public void setButtonColors(@Nullable ButtonColors buttonColors) {
        this.buttonColors = Objects.requireNonNullElse(
                buttonColors,
                new ButtonColors(
                        null, null,
                        null, null,
                        null));
    }

    //TODO: add javadoc
    public void setPanelColors(@Nullable PanelColors panelColors) {
        this.panelColors = Objects.requireNonNullElse(
                panelColors,
                new PanelColors(null, null));
    }

    //TODO: add javadoc
    public void setTextColor(@Nullable Color color) {
        this.textColor = Objects.requireNonNullElse(color, TEXT_COLOR_DEFAULT);
    }
}