package swingBetaDemo.graphics.viewWinow.mainPanels;

import graphicsEngineSwingBeta.PanelColors;

import javax.swing.*;
import java.awt.*;

public class RightSidePanel extends JPanel {
    private static final int[] TEXT_LOCATION = new int[] {5, 20};
    private static final String TEXT = "Right side panel";

    private PanelColors colors;

    public RightSidePanel(int width, PanelColors colors) {
        setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        this.colors = colors;
        setBackground(this.colors.background);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    private void drawText(Graphics g) {
        g.setColor(colors.text);
        g.drawString(TEXT, TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}