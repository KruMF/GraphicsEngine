package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.awt.*;
import javax.swing.*;

//TODO: add javadocs
public class LeftPanel extends StaticPanel {
    static final int WIDTH = 150;

    public LeftPanel(PanelColors panelColors, boolean border) {
        super(new Dimension(WIDTH, Integer.MAX_VALUE), panelColors, border);
        addMembers();
    }

    private void addMembers() {
        setLayout(new BorderLayout(0, 0));
        add(
                new JPanel() {
                    {
                        setOpaque(false);
                        setPreferredSize(new Dimension(LeftPanel.WIDTH, getPreferredHeight()));
                        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
                        //setAlignmentX(Component.LEFT_ALIGNMENT);
                        PanelColors colors = getPanelColors();
                        add(new SubPanel1(colors, false));
                        add(new SubPanel1(colors, false));
                        add(new SubPanel2(colors, true));
                        add(new TextLabel(colors.border, true));
                    }
                },
                BorderLayout.NORTH);
    }

    private static int getPreferredHeight() {
        return SubPanel1.HEIGHT * 2
                + SubPanel2.HEIGHT
                + TextLabel.HEIGHT;
    }
}