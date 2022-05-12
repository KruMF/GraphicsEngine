package graphicsEngine.panels;

import graphicsEngine.Utilities;

import javax.swing.*;
import java.util.Objects;

import com.google.inject.internal.Nullable;

public abstract class SimplePanel extends JPanel {
    private PanelColors colors;

    protected SimplePanel(@Nullable PanelColors panelColors, boolean border) {
        super();
        setPanelColors(panelColors);
        resetBackground();
        setBorderState(border);
    }

    public final void setPanelColors(@Nullable PanelColors colors) {
        this.colors = Objects.requireNonNullElse(colors, new PanelColors());
    }

    public final PanelColors getPanelColors() {
        return colors;
    }

    public void resetBackground() {
        setBackground(colors.background);
    }

    public void setBorderState(boolean state) {
        Utilities.BorderInterface.setBorderState(
                this,
                state,
                getPanelColors().border);
    }
}