package swingBetaDemo.graphics.controlWindow;

import graphicsEngineSwingBeta.PanelColors;
import swingBetaDemo.graphics.controlWindow.leftPanel.LeftPanel;
import graphicsEngineSwingBeta.windowManager.AbstractWindow;
import graphicsEngineSwingBeta.windowManager.WindowConfig;

import javax.swing.*;
import java.awt.*;

// TODO: add javadoc
public class ControlWindow extends AbstractWindow {

    public ControlWindow() {
        super(config());
    }

    private static WindowConfig config() {
        return new WindowConfig(
                "Control Window",
                new int[] {400, 300},   //size
                new int[] {25, 25});    //location
    }

    @Override
    public void addParts() {
        PanelColors panelColors = new PanelColors();

        setLayout(new BorderLayout());
        add(new Footer(panelColors, false), BorderLayout.SOUTH);
        add(new LeftPanel(panelColors, false), BorderLayout.WEST);
        add(new CentralPanel(), BorderLayout.CENTER);
    }

    private static class CentralPanel extends JPanel {
        private static final Color BACKGROUND = new Color(110, 120, 40);

        protected CentralPanel() {
            setBackground(BACKGROUND);
        }
    }
}