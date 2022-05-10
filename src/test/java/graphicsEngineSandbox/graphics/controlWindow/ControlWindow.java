package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.panels.PanelColors;
import graphicsEngineSandbox.graphics.controlWindow.leftPanel.LeftPanel;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import javax.swing.*;
import java.awt.*;

// TODO: add javadoc
public class ControlWindow extends AbstractWindow {

    public ControlWindow() {
        super(config());
    }

    private static WindowConfig config() {
        WindowConfig config = new WindowConfig(
                "Control Window",
                new int[] {400, 300},   //size
                new int[] {25, 25});    //location
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
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