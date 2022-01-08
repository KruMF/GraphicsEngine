package graphicsEngine.data;

import graphicsEngine.data.colors.ButtonColors;

import java.awt.Color;

// TODO: add javadoc
public class Palette {
    public Color backgroundColor;

    public Color panelColor_dark, panelColor_light;
    public Color textColor;

    public ButtonColors buttonColors;

    // TODO: add javadoc
    protected Palette() {
        backgroundColor = Color.black;

        panelColor_dark = Color.darkGray;
        panelColor_light = Color.lightGray;
        textColor = Color.black;

        buttonColors = defaultButtonColors();
    }

    // TODO: add javadoc
    private ButtonColors defaultButtonColors() {
        return new ButtonColors(
                Color.lightGray, Color.darkGray,
                Color.black, Color.yellow,
                Color.black);
    }
}