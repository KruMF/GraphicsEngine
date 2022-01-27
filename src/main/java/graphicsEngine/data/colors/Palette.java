package graphicsEngine.data.colors;

import java.awt.Color;
import java.util.Objects;

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
    public Palette(ButtonColors buttonColors, PanelColors panelColors, Color textColor) {
        setBackgroundColor(null);

        setButtonColors(buttonColors);
        setPanelColors(panelColors);

        setTextColor(textColor);
    }

    public void setBackgroundColor(Color color) {
        this.backgroundColor = Objects.requireNonNullElse(color, BACKGROUND_DEFAULT);
    }

    public void setButtonColors(ButtonColors buttonColors) {
        this.buttonColors = Objects.requireNonNullElse(
                buttonColors,
                new ButtonColors(
                        null, null,
                        null, null,
                        null));
    }

    public void setPanelColors(PanelColors panelColors) {
        this.panelColors = Objects.requireNonNullElse(
                panelColors,
                new PanelColors(null, null));
    }

    public void setTextColor(Color color) {
        this.textColor = Objects.requireNonNullElse(color, TEXT_COLOR_DEFAULT);
    }
}