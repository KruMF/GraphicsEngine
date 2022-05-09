package graphicsEngineDemo.threaded.graphics.viewWinow.mainPanels;

import javax.swing.*;
import java.awt.*;

public class FillerPanel extends JPanel {
    public FillerPanel(int[] preferredSize, Color background) {
        setPreferredSize(new Dimension(preferredSize[0], preferredSize[1]));
        setBackground(background);
    }
}