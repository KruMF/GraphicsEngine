package graphicsEngineSandbox.graphics.viewWinow.mainPanels.center;

import graphicsEngine.PanelColors;
import graphicsEngine.parts.SimplePanel;

import java.awt.*;

public class CentralSquare extends SimplePanel {
    private static final int[] TEXT_LOCATION = new int[] {5, 20};
    private static final PanelColors COLORS;

    static {
        Color
                background = new Color(30, 30, 150),
                text = new Color(150, 150, 0),
                border = new Color(200,180,100);

        COLORS = new PanelColors(background, text, border);
    }

    public CentralSquare() {
        super(COLORS, false);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension maxSize = this.getParent().getSize();
        int a = Math.min(maxSize.width, maxSize.height);
        return new Dimension(a, a);
    }

    @Override
    public void setSize(Dimension d) {
        int a = Math.max(0, Math.min(d.width, d.height));
        super.setSize(new Dimension(a, a));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        myGraphics(g);
    }

    private void myGraphics(Graphics g) {
        PanelColors colors = getPanelColors();
        drawCircle(g, colors.border);
        drawDiagonals(g, colors.border);
        drawText(g, colors.text);
    }

    private void drawText(Graphics g, Color color) {
        g.setColor(color);
        g.drawString(
                "A square",
                TEXT_LOCATION[0], TEXT_LOCATION[1]);
        g.drawString(
                "This size: " + getWidth() + ", " + getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 30);
        g.drawString(
                "Parent size: " + getParent().getWidth() + ", " + getParent().getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 45);
        g.drawString(
                "Preferred size: " + getPreferredSize().getWidth() + ", " + getPreferredSize().getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 60);
    }

    private void drawDiagonals(Graphics g, Color color) {
        Dimension size = getSize();

        g.setColor(color);
        g.drawLine(0, 0, size.width, size.height);
        g.drawLine(0, size.height, size.width, 0);
    }

    private void drawCircle(Graphics g, Color color) {
        Dimension size = getSize();

        g.setColor(color);
        g.drawOval(0, 0, size.width, size.height);
    }
}