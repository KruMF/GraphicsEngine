package graphicsEngineDemo.threaded.simple.graphics;

import graphicsEngineSwingBeta.AbstractGraphicsAdapter;
import graphicsEngineSwingBeta.windows.WindowManager;

import graphicsEngineDemo.threaded.simple.graphics.controlWindow.ControlWindow;
import graphicsEngineDemo.threaded.simple.graphics.viewWinow.ViewWindow;

// TODO: add javadoc
public class GraphicsAdapter extends AbstractGraphicsAdapter {
    // TODO: add javadoc
    public GraphicsAdapter() {
        super();
        newControlWindow();
        newViewWindow();
    }

    private void newControlWindow() {
        graphics.newWindow(new WindowManager(new ControlWindow()));
    }

    // TODO: add javadoc
    public void newViewWindow() {
        graphics.newWindow(new WindowManager(new ViewWindow()));
    }
}