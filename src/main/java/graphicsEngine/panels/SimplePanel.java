package graphicsEngine.panels;

import graphicsEngine.colors.SimpleColorScheme;

import java.util.Objects;
import java.awt.Dimension;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class SimplePanel extends JPanel {
    private @NotNull SimpleColorScheme colors = new SimpleColorScheme();
    private @NotNull BorderProperties borderProperties = new BorderProperties();

    //custom size and border state
    //TODO: add javadoc
    protected SimplePanel(@Nullable Dimension sizeLimits,
                          @Nullable SimpleColorScheme colors,
                          @Nullable BorderProperties borderProperties) {
        super();
        setSizeLimits(sizeLimits); // null - auto-stretching
        setPanelColors(colors); // null - default colors
        setBorderProperties(borderProperties); // null - default border, with default state
        addParts();
    }

    private void setSizeLimits(@Nullable Dimension size) {
        setPreferredSize(size);
    }

    //TODO: add javadoc
    public final void setPanelColors(@Nullable SimpleColorScheme colors) {
        this.colors = Objects.requireNonNullElse(colors, new SimpleColorScheme());
        resetBackground();
    }

    //TODO: add javadoc
    public final @NotNull SimpleColorScheme getPanelColors() {
        return colors;
    }

    //TODO: add javadoc
    public void resetBackground() {
        setBackground(colors.getBaseColor());
    }

    private void setBorderProperties(BorderProperties properties) {
        borderProperties = Objects.requireNonNullElse(
                properties,
                new BorderProperties());
        setComponentBorderState();
    }

    //TODO: add javadoc
    public void setBorderState(boolean state) {
        borderProperties.setBorderState(state);
        setComponentBorderState();
    }

    //TODO: add javadoc
    public void toggleBorderState() {
        borderProperties.toggleBorderState();
        setComponentBorderState();
    }

    private void setComponentBorderState() {
        BorderInterface.setComponentBorderState(
                this,
                borderProperties.getBorderColor(),
                borderProperties.getBorderState());
    }

    //TODO: add javadoc
    public abstract void addParts();
}