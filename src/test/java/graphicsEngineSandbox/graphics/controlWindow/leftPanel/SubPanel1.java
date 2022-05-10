package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.PanelColors;

import java.awt.*;

class SubPanel1 extends AbstractSubPanel {
    protected static final int HEIGHT = 30;
    private static final int[] TEXT_LOCATION = new int[]{5, 20};
    private static final String TEXT = "TextPanel 1";

    protected SubPanel1(PanelColors panelColors, boolean border) {
        super(
                new int[]{LeftPanel.WIDTH, HEIGHT},
                panelColors,
                border);
    }

    @Override
    protected final void drawText(Graphics g) {
        g.setColor(colors.text);
        g.drawString(TEXT, TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}