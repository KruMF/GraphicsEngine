package graphicsEngine.data.colors;

import java.awt.Color;
import java.util.Objects;

import com.google.inject.internal.Nullable;

/**
 * Class for button colors.
 */
public class ButtonColors {
    private static final Color
            BODY_DEFAULT = Color.lightGray,
            BODY_ACTIVE_DEFAULT = Color.darkGray,

            BORDER_DEFAULT = Color.black,
            BORDER_ACTIVE_DEFAULT = Color.yellow,

            TEXT_DEFAULT = Color.black;

    public Color
            bodyColor,
            bodyColor_active,

            borderColor,
            borderColor_active,

            textColor;

    /**
     * Sets colors for buttons.
     *
     * @param body          Body color for inactive buttons.
     * @param body_active   Body color for active buttons.
     * @param border        Border color for inactive buttons.
     * @param border_active Border color for active buttons.
     * @param text          Text color.
     */
    public ButtonColors(@Nullable Color body, @Nullable Color body_active,
                        @Nullable Color border, @Nullable Color border_active,
                        @Nullable Color text) {
        setBodyColors(body, body_active);
        setBorderColors(border, border_active);
        setTextColor(text);
    }

    //TODO: add javadoc
    public void setBodyColors(@Nullable Color body, @Nullable Color body_active) {
        bodyColor = Objects.requireNonNullElse(body, BODY_DEFAULT);
        bodyColor_active = Objects.requireNonNullElse(body_active, BODY_ACTIVE_DEFAULT);
    }

    //TODO: add javadoc
    public void setBorderColors(@Nullable Color border, @Nullable Color border_active) {
        borderColor = Objects.requireNonNullElse(border, BORDER_DEFAULT);
        borderColor_active = Objects.requireNonNullElse(border_active, BORDER_ACTIVE_DEFAULT);
    }

    //TODO: add javadoc
    public void setTextColor(@Nullable Color color) {
        textColor = Objects.requireNonNullElse(color, TEXT_DEFAULT);
    }
}