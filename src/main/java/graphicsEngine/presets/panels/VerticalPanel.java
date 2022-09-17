package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class VerticalPanel extends StaticPanel {
    //TODO: add javadoc
    public VerticalPanel(@Nullable PanelColors panelColors, int width) {
        super(new Dimension(width, Integer.MAX_VALUE), panelColors, false);
        addParts();
    }
}