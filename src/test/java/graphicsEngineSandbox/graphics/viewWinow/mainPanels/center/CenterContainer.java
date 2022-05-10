package graphicsEngineSandbox.graphics.viewWinow.mainPanels.center;

import graphicsEngine.PanelColors;
import graphicsEngine.parts.SimplePanel;

import java.awt.*;
import javax.swing.*;

public class CenterContainer extends SimplePanel {
    public CenterContainer(PanelColors panelColors) {
        super(panelColors, false);
        setLayout(new BorderLayout(0,0));
        add(new CentralSquare(), BorderLayout.WEST);
        add(
                new JPanel() {
                    {
                        setOpaque(false);
                        //setBackground(centerBackground);
                    }

                    @Override
                    public Dimension getPreferredSize() {
                        Dimension parentSize = getParent().getSize();

                        if (parentSize.width >= parentSize.height) {
                            return new Dimension(Integer.MAX_VALUE, 0);
                        } else {
                            return new Dimension(Integer.MAX_VALUE, parentSize.height - parentSize.width);
                        }
                    }
                },
                BorderLayout.SOUTH);
    }
}