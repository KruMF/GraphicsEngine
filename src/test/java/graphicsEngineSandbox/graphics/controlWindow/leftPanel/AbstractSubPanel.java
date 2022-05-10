package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.PanelColors;
import graphicsEngine.parts.SimplePanel;

import java.awt.*;

abstract class AbstractSubPanel extends SimplePanel {
    protected AbstractSubPanel(int[] size, PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setOpaque(false);
        setPreferredSize(new Dimension(size[0], size[1]));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    @Override
    public final void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    protected abstract void drawText(Graphics g);
}