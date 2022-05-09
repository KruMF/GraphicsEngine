package graphicsEngineSwingBeta;

import graphicsEngineSwingBeta.windows.AbstractWindow;
import graphicsEngineSwingBeta.windows.WindowManager;

import DelayCalculator.DelayOptions;
import java.util.ArrayList;

import static graphicsEngineSwingBeta.Utilities.printLine;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

//a class for containing graphics
//TODO: add javadocs
public class GraphicsManager {
    public ArrayList<WindowManager> windows;

    public GraphicsManager() {
        windows = new ArrayList<>();
    }

    @SuppressWarnings("unused")
    public final void newWindow(@NotNull WindowManager window) {
        int i = windows.size();
        windows.add(window);
        windows.get(i).start();
    }

    @SuppressWarnings("unused")
    public final void newWindow(@NotNull AbstractWindow window) {
        newWindow(new WindowManager(window));
    }

    @SuppressWarnings("unused")
    public final void newWindow(@NotNull AbstractWindow window, long delay) {
        newWindow(new WindowManager(window, delay));
    }

    @SuppressWarnings("unused")
    public final void newWindow(@NotNull AbstractWindow window, @Nullable DelayOptions delayOptions) {
        newWindow(new WindowManager(window, delayOptions));
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