package graphicsEngineSandbox.graphics.viewWinow;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.windowTypes.SimpleWindow;
import graphicsEngineSandbox.graphics.viewWinow.mainPanels.LeftSidePanel;
import graphicsEngineSandbox.graphics.viewWinow.mainPanels.RightSidePanel;
import graphicsEngineSandbox.graphics.viewWinow.mainPanels.center.CenterContainer;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public class ViewWindow extends SimpleWindow {
    private static final int[] WINDOW_MINIMUM_SIZE = new int[] {700, 400};

    public ViewWindow(@NotNull WindowManager windowManager) {
        super(windowManager, config(), null);
        //TODO: maybe rework? could use something like setMinimumSize(getSize())
        int[] correctedMinimumSize = AbstractWindow.correctWindowsSizeError(WINDOW_MINIMUM_SIZE);
        setMinimumSize(new Dimension(correctedMinimumSize[0], correctedMinimumSize[1]));
    }

    private static WindowConfig config() {
        return new WindowConfig(
                "View Window",
                WINDOW_MINIMUM_SIZE,
                new int[] {25, 350});
    }

    @Override
    public @NotNull String getWindowKey() {
        return "viewWindow";
    }

    @Override
    public void addParts() {
        SimpleColorScheme
                panelColors = new SimpleColorScheme(Color.gray, null),
                centerColors = new SimpleColorScheme(Color.cyan, Color.yellow);

        add(new LeftSidePanel(150, panelColors), BorderLayout.WEST);
        add(new RightSidePanel(150, panelColors), BorderLayout.EAST);
        add(new CenterContainer(centerColors), BorderLayout.CENTER);
    }
}