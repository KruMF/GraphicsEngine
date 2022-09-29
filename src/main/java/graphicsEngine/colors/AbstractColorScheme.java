package graphicsEngine.colors;

import java.util.Objects;
import java.awt.Color;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractColorScheme {
    private Color baseColor;

    //TODO: add javadoc
    protected AbstractColorScheme() {
        this(ColorUtilities.DEFAULT_OPACITY);
    }

    //TODO: add javadoc
    protected AbstractColorScheme(boolean opaque) {
        this(ColorUtilities.defaultColorByOpacity(opaque));
    }

    //TODO: add javadoc
    protected AbstractColorScheme(@Nullable Color base) {
        setBaseColor(base);
    }

    //TODO: add javadoc
    public void setBaseColor(@Nullable Color color) {
        baseColor = nonNullBaseColor(color);
    }

    private static @NotNull Color nonNullBaseColor(@Nullable Color base) {
        return Objects.requireNonNullElse(
                base,
                ColorUtilities.defaultColorForUnknownOpacity());
    }

    //TODO: add javadoc
    public @NotNull Color getBaseColor() {
        return baseColor;
    }
}