package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class HorizontalPanel extends SimplePanel {
    //TODO: add javadoc
    public HorizontalPanel(@Nullable PanelColors panelColors, int height) {
        super(panelColors, false);
        setPreferredSize(new Dimension(
                Integer.MAX_VALUE,
                height));
        addParts();
    }

    //TODO: add javadoc
    public abstract void addParts();
}