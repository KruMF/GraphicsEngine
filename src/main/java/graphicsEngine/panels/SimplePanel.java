package graphicsEngine.panels;

import graphicsEngine.Utilities;

import java.util.Objects;
import java.awt.Dimension;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class SimplePanel extends JPanel {
    private PanelColors colors;

    //TODO: add javadoc
    protected SimplePanel(@Nullable Dimension sizeLimits,
                          @Nullable PanelColors panelColors,
                          boolean drawBorder) {
        super();
        setSizeLimits(sizeLimits);
        setPanelColors(panelColors);
        resetBackground();
        setBorderState(drawBorder);
        addParts();
    }

    private void setSizeLimits(@Nullable Dimension size) {
        setPreferredSize(size);
    }

    //TODO: add javadoc
    public final void setPanelColors(@Nullable PanelColors colors) {
        this.colors = Objects.requireNonNullElse(colors, new PanelColors());
    }

    //TODO: add javadoc
    public final @NotNull PanelColors getPanelColors() {
        return colors;
    }

    //TODO: add javadoc
    public void resetBackground() {
        setBackground(colors.background);
    }

    //TODO: add javadoc
    public void setBorderState(boolean state) {
        Utilities.BorderInterface.setBorderState(
                this,
                state,
                getPanelColors().border);
    }

    //TODO: add javadoc
    public abstract void addParts();
}