package graphicsEngine.panels;

import java.util.Objects;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

interface BorderInterface {
    Color DEFAULT_BORDER_COLOR = Color.red;
    boolean DEFAULT_BORDER_STATE = false;

    static void setComponentBorderState(@NotNull JComponent component,
                                        @Nullable Color color,
                                        boolean state) {
        if (state) {
            component.setBorder(new LineBorder(Objects.requireNonNullElse(
                    color,
                    DEFAULT_BORDER_COLOR)));
        } else {
            component.setBorder(null);
        }
    }
}