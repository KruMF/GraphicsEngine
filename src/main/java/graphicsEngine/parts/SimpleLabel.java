package graphicsEngine.parts;

import graphicsEngine.Utilities;

import java.util.Objects;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;

import org.jetbrains.annotations.Nullable;

//A simple JLabel with most commonly used functions
//TODO: add javadocs
public class SimpleLabel extends JLabel {
    private static final String DEFAULT_TEXT = "A label";
    private static final Color DEFAULT_COLOR = Color.black;

    //TODO: add javadoc
    public SimpleLabel(@Nullable String text, @Nullable Color textColor) {
        this(text, textColor, null);
    }

    //TODO: add javadoc
    public SimpleLabel(@Nullable String text,
                       @Nullable Color textColor,
                       @Nullable Color background) {
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setOpaque(false);
        setText(text);
        setTextColor(textColor);
        setBackground(background);
    }

    //TODO: add javadoc
    @Override
    public void setText(@Nullable String text) {
        super.setText(Objects.requireNonNullElse(text, DEFAULT_TEXT));
    }

    //TODO: add javadoc
    public void setTextColor(@Nullable Color color) {
        setForeground(Objects.requireNonNullElse(color, DEFAULT_COLOR));
    }

    //TODO: add javadoc
    @Override
    public void setBackground(@Nullable Color background) {
        super.setBackground(Objects.requireNonNullElse(background, Utilities.EMPTY_COLOR));
    }
}