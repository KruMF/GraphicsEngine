package graphicsEngine;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {
    private static final Color DEFAULT_BORDER_COLOR = Color.red;

    // TODO: add javadoc
    public interface BorderInterface {
        static void setBorderState(@NotNull JComponent component, boolean state, @Nullable Color color) {
            if (state) {
                component.setBorder(new LineBorder(Objects.requireNonNullElse(color, DEFAULT_BORDER_COLOR)));
            } else {
                component.setBorder(null);
            }
        }
    }
}