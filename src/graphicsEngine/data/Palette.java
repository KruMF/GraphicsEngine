package graphicsEngine.data;

import graphicsEngine.data.colors.ButtonColors;

import java.awt.Color;

public class Palette {
    public Color backgroundColor;

    public Color panelColor_dark, panelColor_light;
    public Color textColor;

    public ButtonColors buttonColors;

    protected Palette() {
        backgroundColor = Color.black;

        panelColor_dark = Color.darkGray;
        panelColor_light = Color.lightGray;
        textColor = Color.black;

        buttonColors = defaultButtonColors();
    }

    private ButtonColors defaultButtonColors() {
        return new ButtonColors(
                Color.lightGray, Color.darkGray,
                Color.black, Color.yellow,
                Color.black);
    }
}