package swingBetaDemo.graphics;

import graphicsEngineSwingBeta.AbstractGraphicsAdapter;
import graphicsEngineSwingBeta.windowManager.WindowManager;
import swingBetaDemo.graphics.controlWindow.ControlWindow;
import swingBetaDemo.graphics.viewWinow.ViewWindow;

public class GraphicsAdapter extends AbstractGraphicsAdapter {

    public GraphicsAdapter() {
        super();
        newControlWindow();
        newViewWindow();
    }

    private void newControlWindow() {
        graphics.newWindow(new WindowManager(new ControlWindow()));
    }

    public void newViewWindow() {
        graphics.newWindow(new WindowManager(new ViewWindow()));
    }
}