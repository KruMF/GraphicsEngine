package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import com.google.inject.internal.Nullable;

public class Section1 extends AbstractSection {
    public static final int HEIGHT = 150;

    public Section1(@Nullable PanelColors panelColors) {
        super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);

        Utilities.BorderInterface.setBorderState(
                this,
                true,
                Color.cyan);
    }

    @Override
    public void addParts(JPanel p) {
        //
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.magenta);
        g.drawString("sub1", 5, 20);
    }
}