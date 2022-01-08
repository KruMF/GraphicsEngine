package graphicsEngine.data.colors;

import java.awt.Color;

// TODO: add javadoc
public class ButtonColors {
    public Color bodyColor, bodyColor_active;
    public Color borderColor, borderColor_active;
    public Color textColor;

    // TODO: add javadoc
    public ButtonColors(Color body, Color body_active,
                        Color border, Color border_active,
                        Color text) {
        bodyColor = body;
        bodyColor_active = body_active;

        borderColor = border;
        borderColor_active = border_active;

        textColor = text;
    }
}