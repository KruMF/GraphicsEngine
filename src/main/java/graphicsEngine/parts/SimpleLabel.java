package graphicsEngine.parts;

import java.awt.*;
import javax.swing.*;

import java.util.Objects;

import com.google.inject.internal.Nullable;

//A simple JLabel with most commonly used functions
// TODO: add javadocs
public class SimpleLabel extends JLabel {
    private static final String DEFAULT_TEXT = "A label";
    private static final Color DEFAULT_COLOR = Color.black;

    public SimpleLabel(@Nullable String text, @Nullable Color textColor) {
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setOpaque(false);
        setText(stringNullCheck(text));
        setForeground(colorNullCheck(textColor));
    }

    private static String stringNullCheck(@Nullable String text) {
        return Objects.requireNonNullElse(text, DEFAULT_TEXT);
    }

    private static Color colorNullCheck(@Nullable Color color) {
        return Objects.requireNonNullElse(color, DEFAULT_COLOR);
    }
}