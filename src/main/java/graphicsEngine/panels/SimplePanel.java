package graphicsEngine.panels;

import graphicsEngine.Utilities;

import java.util.Objects;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class SimplePanel extends JPanel {
    private PanelColors colors;

    //TODO: add javadoc
    protected SimplePanel(@Nullable PanelColors panelColors, boolean border) {
        super();
        setPanelColors(panelColors);
        resetBackground();
        setBorderState(border);
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
}