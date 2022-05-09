package graphicsEngineDemo.threaded.graphics.viewWinow;

import graphicsEngineSwingBeta.PanelColors;
import graphicsEngineDemo.threaded.graphics.viewWinow.mainPanels.*;
import graphicsEngineDemo.threaded.graphics.viewWinow.mainPanels.center.CenterContainer;
import graphicsEngineSwingBeta.windows.AbstractWindow;
import graphicsEngineSwingBeta.windows.WindowConfig;

import java.awt.*;

// TODO: add javadoc
public class ViewWindow extends AbstractWindow {
    private static final int[]
            WINDOW_SIZE_ERROR_CORRECTION = new int[] {16, 39},
            WINDOW_MINIMUM_SIZE = new int[] {
                    700 + WINDOW_SIZE_ERROR_CORRECTION[0],
                    400 + WINDOW_SIZE_ERROR_CORRECTION[1]};

    public ViewWindow() {
        super(config());
        setMinimumSize(new Dimension(WINDOW_MINIMUM_SIZE[0], WINDOW_MINIMUM_SIZE[1]));
    }

    private static WindowConfig config() {
        return new WindowConfig("View Window", WINDOW_MINIMUM_SIZE, new int[] {25, 350});
    }

    @Override
    public void addParts() {
        PanelColors panelColors = new PanelColors();

        add(new LeftSidePanel(150, panelColors), BorderLayout.WEST);
        add(new RightSidePanel(150, panelColors), BorderLayout.EAST);
        add(new CenterContainer(Color.cyan, Color.blue), BorderLayout.CENTER);
    }

    private void addDemoPanel(int[] paneSize) {
        MyPanel panel = new MyPanel();
        panel.setPreferredSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        add(panel, BorderLayout.CENTER);
    }
}