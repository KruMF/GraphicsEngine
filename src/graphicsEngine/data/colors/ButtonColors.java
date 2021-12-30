package graphicsEngine.data.colors;

import java.awt.*;

public class ButtonColors {
    public Color bodyColor;
    public Color bodyColor_active;

    public Color borderColor;
    public Color borderColor_active;

    public Color textColor;

    public ButtonColors(
            Color body, Color body_active,
            Color border, Color border_active,
            Color text) {
        bodyColor = body;
        bodyColor_active = body_active;

        borderColor = border;
        borderColor_active = border_active;

        textColor = text;
    }
}