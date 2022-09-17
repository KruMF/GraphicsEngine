package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.awt.*;

abstract class AbstractSubPanel extends StaticPanel {
    protected AbstractSubPanel(int[] size, PanelColors panelColors, boolean border) {
        super(new Dimension(size[0], size[1]), panelColors, border);
        setOpaque(false);
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    @Override
    public final void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    protected abstract void drawText(Graphics g);
}