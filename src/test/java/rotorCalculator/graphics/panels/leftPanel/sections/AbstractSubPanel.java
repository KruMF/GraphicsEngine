package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.*;

import com.google.inject.internal.Nullable;

abstract class AbstractSubPanel extends SimplePanel {
    private static final boolean DRAW_BACKGROUND = false;

    protected AbstractSubPanel(int height, @Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(Integer.MAX_VALUE, height));
        addParts();
    }

    @Override
    public final void resetBackground() {
        if (DRAW_BACKGROUND) {
            setOpaque(true);
            super.resetBackground();
        } else {
            setOpaque(false);
        }
    }

    public void addParts() {}
}