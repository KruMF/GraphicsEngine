package swingBetaDemo.graphics.viewWinow.mainPanels.center;

import javax.swing.*;
import java.awt.*;

public class CentralSquare extends JPanel {
    private static final int[] TEXT_LOCATION = new int[] {5, 20};
    //private boolean square = true;

    public CentralSquare(/*int[] preferredSize, */Color background) {
        //setPreferredSize(new Dimension(preferredSize[0], preferredSize[1]));
        //setPreferredSize(new Dimension(300, 300));
        //setMaximumSize(new Dimension(150, 150));
        setBackground(background);
    }

    @Override
    public Dimension getPreferredSize() {
        //return super.getPreferredSize();

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
        drawCircle(g, Color.yellow);
        drawDiagonals(g, Color.yellow);
        drawText(g, Color.white);
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