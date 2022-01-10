package graphicsEngine.data;

import graphicsEngine.data.colors.ButtonColors;

import java.awt.Color;

/**
 * Color palette class.
 */
public class Palette {
    public Color backgroundColor;

    public Color panelColor_dark, panelColor_light;
    public Color textColor;

    public ButtonColors buttonColors;

    /**
     * Creates a color palette with default values.
     */
    protected Palette() {
        backgroundColor = Color.black;

        panelColor_dark = Color.darkGray;
        panelColor_light = Color.lightGray;
        textColor = Color.black;

        buttonColors = defaultButtonColors();
    }

    /**
     * Creates default button colors.
     *
     * @return Button colors.
     */
    private ButtonColors defaultButtonColors() {
        return new ButtonColors(
                Color.lightGray, Color.darkGray,
                Color.black, Color.yellow,
                Color.black);
    }
}