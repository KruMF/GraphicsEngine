package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractHeader extends HorizontalPanel {
    //TODO: add javadoc
    public AbstractHeader(@Nullable PanelColors panelColors,
                          int height) {
        super(panelColors, height);
    }
}