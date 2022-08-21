package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.*;

import org.jetbrains.annotations.Nullable;

abstract class HorizontalPanel extends SimplePanel {
    protected HorizontalPanel(@Nullable PanelColors panelColors, int height) {
        super(panelColors, false);
        setPreferredSize(new Dimension(
                Integer.MAX_VALUE,
                height));
        addParts();
    }

    public abstract void addParts();
}