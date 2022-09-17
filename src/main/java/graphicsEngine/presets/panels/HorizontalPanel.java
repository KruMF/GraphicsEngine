package graphicsEngine.presets.panels;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class HorizontalPanel extends StaticPanel {
    //TODO: add javadoc
    public HorizontalPanel(@Nullable PanelColors panelColors, int height) {
        super(new Dimension(Integer.MAX_VALUE, height), panelColors, false);
    }
}