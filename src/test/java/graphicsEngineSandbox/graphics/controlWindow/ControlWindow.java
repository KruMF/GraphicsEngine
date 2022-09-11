package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.panels.PanelColors;
import graphicsEngineSandbox.graphics.controlWindow.leftPanel.LeftPanel;

import java.awt.*;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public class ControlWindow extends AbstractWindow {

    public ControlWindow(@NotNull WindowManager windowManager) {
        super(windowManager, config(), null);
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
    public @NotNull String getWindowKey() {
        return "controlWindow";
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