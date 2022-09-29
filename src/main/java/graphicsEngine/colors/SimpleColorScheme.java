package graphicsEngine.colors;

import java.util.Objects;
import java.awt.Color;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class SimpleColorScheme extends AbstractColorScheme {
    private static final Color DEFAULT_SECONDARY_COLOR = Color.white;
    private Color secondaryColor;

    //TODO: add javadoc
    //default colors
    public SimpleColorScheme() {
        this(null, null);
    }

    //TODO: add javadoc
    //custom colors
    public SimpleColorScheme(@Nullable Color base,
                             @Nullable Color secondary) {
        super(base);
        setSecondaryColor(secondary);
    }

    //TODO: add javadoc
    public void setSecondaryColor(@Nullable Color color) {
        secondaryColor = Objects.requireNonNullElse(color, DEFAULT_SECONDARY_COLOR);
    }

    //TODO: add javadoc
    public @NotNull Color getSecondaryColor() {
        return secondaryColor;
    }
}