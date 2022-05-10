package graphicsEngineSandbox.graphics;

import graphicsEngine.AbstractGraphicsAdapter;
import graphicsEngine.windows.WindowManager;

import graphicsEngineSandbox.graphics.controlWindow.ControlWindow;
import graphicsEngineSandbox.graphics.viewWinow.ViewWindow;

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