package graphicsEngineSwingBeta;

import graphicsEngineSwingBeta.controlWindow.ControlWindow;
import graphicsEngineSwingBeta.viewWinow.ViewWindow;
import graphicsEngineSwingBeta.windowManager.WindowManager;

import java.util.ArrayList;

import static graphicsEngineSwingBeta.Utilities.printLine;

//a class for containing graphics
//TODO: add javadocs
public class GraphicsManager {
    private static final long DEFAULT_WINDOW_REFRESH_DELAY = 20L;

    public ArrayList<WindowManager> windows;

    public GraphicsManager() {
        windows = new ArrayList<>();

        windows.add(new WindowManager(new ControlWindow(), DEFAULT_WINDOW_REFRESH_DELAY));
        windows.get(0).start();

        newViewWindow();
    }

    public void newViewWindow() {
        int i = windows.size();
        windows.add(new WindowManager(new ViewWindow(), DEFAULT_WINDOW_REFRESH_DELAY));
        windows.get(i).start();
    }

    public void end() {
        printLine("Graphics ending.");
        endAllWindows();
    }

    private void endAllWindows() {
        for (WindowManager window : windows) {
            window.end();
        }
    }
}