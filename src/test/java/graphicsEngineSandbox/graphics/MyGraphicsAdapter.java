package graphicsEngineSandbox.graphics;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowManager;

import graphicsEngineSandbox.graphics.controlWindow.ControlWindow;
import graphicsEngineSandbox.graphics.viewWinow.ViewWindow;

// TODO: add javadoc
public class MyGraphicsAdapter extends GraphicsAdapter {
    // TODO: add javadoc
    public MyGraphicsAdapter() {
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