package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractFooter extends HorizontalPanel {
    //TODO: add javadoc
    public AbstractFooter(@Nullable PanelColors panelColors,
                          int height) {
        super(panelColors, height);
    }
}