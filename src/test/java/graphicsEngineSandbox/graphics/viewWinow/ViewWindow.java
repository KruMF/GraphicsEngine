package graphicsEngineSandbox.graphics.viewWinow;

import graphicsEngineSandbox.graphics.viewWinow.mainPanels.LeftSidePanel;
import graphicsEngineSandbox.graphics.viewWinow.mainPanels.RightSidePanel;
import graphicsEngine.PanelColors;
import graphicsEngineSandbox.graphics.viewWinow.mainPanels.center.CenterContainer;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import java.awt.*;

// TODO: add javadoc
public class ViewWindow extends AbstractWindow {
    private static final int[] WINDOW_MINIMUM_SIZE = new int[] {700, 400};

    public ViewWindow() {
        super(config());
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
    public void addParts() {
        PanelColors panelColors = new PanelColors();

        add(new LeftSidePanel(150, panelColors), BorderLayout.WEST);
        add(new RightSidePanel(150, panelColors), BorderLayout.EAST);


        add(new CenterContainer(new PanelColors(Color.cyan, Color.yellow, Color.yellow)), BorderLayout.CENTER);
    }
}