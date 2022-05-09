package swingBetaDemo.graphics;

import graphicsEngineSwingBeta.AbstractGraphicsAdapter;
import graphicsEngineSwingBeta.windowManager.WindowManager;
import swingBetaDemo.graphics.controlWindow.ControlWindow;
import swingBetaDemo.graphics.viewWinow.ViewWindow;

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