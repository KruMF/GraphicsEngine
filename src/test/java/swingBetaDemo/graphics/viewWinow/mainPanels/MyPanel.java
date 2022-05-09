package swingBetaDemo.graphics.viewWinow.mainPanels;

import swingBetaDemo.data.Data;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setBackground(Color.black);
        //this.add(new MyButton());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        myGraphics(g);
    }

    private void myGraphics(Graphics g) {
        int[] size = new int[] {getWidth(), getHeight()};
        drawInsetBounds(g, size, 20);

        int x = Data.getX();
        drawMovingRectangle(g, x);
        drawX(g, x);
    }

    private void drawInsetBounds(Graphics g, int[] size, int inset) {
        g.setColor(Color.red);
        g.drawRect(
                inset,
                inset,
                size[0] - inset * 2,
                size[1] - inset * 2);
    }

    private void drawMovingRectangle(Graphics g, int x) {
        g.setColor(Color.orange);
        g.fillRect(50 + x * 2,50,100,100);
    }

    private void drawX(Graphics g, int x) {
        g.setColor(Color.gray);
        g.drawString("X: " + x, 100, 100);
    }
}