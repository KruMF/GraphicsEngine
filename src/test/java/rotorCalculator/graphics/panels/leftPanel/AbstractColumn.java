package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.*;

import com.google.inject.internal.Nullable;

abstract class AbstractColumn extends SimplePanel {
    protected AbstractColumn(int width, @Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        addParts();
    }

    public abstract void addParts();
}