package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;

import org.jetbrains.annotations.Nullable;

public abstract class AbstractHeader extends HorizontalPanel {
    public AbstractHeader(@Nullable PanelColors panelColors,
                          int height) {
        super(panelColors, height);
    }
}