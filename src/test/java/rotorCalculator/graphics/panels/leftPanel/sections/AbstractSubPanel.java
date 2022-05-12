package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;

import java.awt.*;

import com.google.inject.internal.Nullable;

abstract class AbstractSubPanel extends SimplePanel {
    private static final boolean DRAW_BACKGROUND = false;

    protected AbstractSubPanel(int[] size, @Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(size[0], size[1]));
        //setAlignmentX(Component.LEFT_ALIGNMENT);
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

    public abstract void addParts();
}