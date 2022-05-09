package graphicsEngineDemo.threaded.graphics.viewWinow.mainPanels.center;

import javax.swing.*;
import java.awt.*;

public class CenterContainer extends JPanel {
    public CenterContainer(Color centerBackground, Color centerColor) {
        super();
        setBackground(centerBackground);
        setLayout(new BorderLayout(0,0));
        add(new CentralSquare(centerColor), BorderLayout.WEST);
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