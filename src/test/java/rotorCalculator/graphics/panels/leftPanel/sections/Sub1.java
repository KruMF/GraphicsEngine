package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;

import rotorCalculator.graphics.panels.leftPanel.Column1;

import javax.swing.border.LineBorder;
import java.awt.*;

import com.google.inject.internal.Nullable;

public class Sub1 extends AbstractSubPanel {
    public static final int HEIGHT = 150;

    public Sub1(@Nullable PanelColors panelColors) {
        super(new int[] {Column1.WIDTH, HEIGHT}, panelColors, true);
        setBorder(new LineBorder(Color.cyan));
    }

    @Override
    public void addParts() {
        //setLayout(new BorderLayout(0, 0));
        /*add(
                new JPanel() {
                    {
                        //
                    }
                },
                BorderLayout.WEST);
        */
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.magenta);
        g.drawString("sub1", 5, 20);
    }
}