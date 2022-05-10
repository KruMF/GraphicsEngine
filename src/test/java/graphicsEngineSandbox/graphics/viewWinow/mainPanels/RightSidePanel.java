package graphicsEngineSandbox.graphics.viewWinow.mainPanels;

import graphicsEngine.PanelColors;
import graphicsEngine.parts.SimplePanel;

import java.awt.*;

public class RightSidePanel extends SimplePanel {
    private static final int[] TEXT_LOCATION = new int[] {5, 20};
    private static final String TEXT = "Right side panel";

    public RightSidePanel(int width, PanelColors colors) {
        super(colors, false);
        setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    private void drawText(Graphics g) {
        g.setColor(getPanelColors().text);
        g.drawString(TEXT, TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}