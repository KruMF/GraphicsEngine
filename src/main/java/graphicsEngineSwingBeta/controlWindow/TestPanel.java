package graphicsEngineSwingBeta.controlWindow;

import javax.swing.*;
import java.awt.*;

//
public class TestPanel extends JPanel {
    //

    public TestPanel() {
        setBackground(Color.black);
        //setBounds(0,0, 100, Integer.MAX_VALUE);
        setMaximumSize(new Dimension(150, 150));
        setMinimumSize(new Dimension(100, 100));
        add(new MyButton());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        myGraphics(g);
    }

    private void myGraphics(Graphics g) {
        int[] size = new int[] {getWidth(), getHeight()};
        drawInsetBounds(g, size, 20);
    }

    private void drawInsetBounds(Graphics g, int[] size, int inset) {
        g.setColor(Color.red);
        g.drawRect(
                inset,
                inset,
                size[0] - inset * 2,
                size[1] - inset * 2);
    }
}