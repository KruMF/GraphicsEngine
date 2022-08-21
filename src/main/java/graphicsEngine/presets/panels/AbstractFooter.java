package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;

import org.jetbrains.annotations.Nullable;

public abstract class AbstractFooter extends HorizontalPanel {
    public AbstractFooter(@Nullable PanelColors panelColors,
                          int height) {
        super(panelColors, height);
    }
}