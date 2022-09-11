package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class VerticalPanel extends SimplePanel {
    //TODO: add javadoc
    public VerticalPanel(@Nullable PanelColors panelColors, int width) {
        super(panelColors, false);
        setPreferredSize(new Dimension(
                width,
                Integer.MAX_VALUE));
        addParts();
    }

    //TODO: add javadoc
    public abstract void addParts();
}