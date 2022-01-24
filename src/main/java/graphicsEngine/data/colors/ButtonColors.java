package graphicsEngine.data.colors;

import java.awt.Color;

/**
 * Class for button colors.
 */
public class ButtonColors {
    public Color bodyColor, bodyColor_active;
    public Color borderColor, borderColor_active;
    public Color textColor;

    /**
     * Sets colors for buttons.
     *
     * @param body          Body color for inactive buttons.
     * @param body_active   Body color for active buttons.
     * @param border        Border color for inactive buttons.
     * @param border_active Border color for active buttons.
     * @param text          Text color.
     */
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