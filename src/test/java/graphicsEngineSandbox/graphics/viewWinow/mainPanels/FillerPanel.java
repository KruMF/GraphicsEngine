package graphicsEngineSandbox.graphics.viewWinow.mainPanels;

import java.awt.*;
import javax.swing.*;

public class FillerPanel extends JPanel {
    public FillerPanel(int[] preferredSize, Color background) {
        setPreferredSize(new Dimension(preferredSize[0], preferredSize[1]));
        setBackground(background);
    }
}