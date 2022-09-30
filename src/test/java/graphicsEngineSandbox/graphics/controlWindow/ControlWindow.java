package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.panels.StaticPanel;
import graphicsEngineSandbox.graphics.controlWindow.leftPanel.LeftPanel;

import java.awt.*;

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
        setLayout(new BorderLayout());
        add(
                new Footer(
                        new SimpleColorScheme(Color.gray, null),
                        null),
                BorderLayout.SOUTH);
        add(
                new LeftPanel(
                        new SimpleColorScheme(Color.lightGray, null),
                        null),
                BorderLayout.WEST);
        add(
                new CentralPanel(),
                BorderLayout.CENTER);
    }

    private static class CentralPanel extends StaticPanel {
        private static final Color BACKGROUND = new Color(110, 120, 40);

        protected CentralPanel() {
            super(null,
                    new SimpleColorScheme(BACKGROUND, null),
                    null);
        }
    }
}