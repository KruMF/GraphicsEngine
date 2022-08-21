package graphicsEngine.windows;

import java.util.ArrayList;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//a class for containing windows and their updaters
//TODO: add javadocs
public class WindowManager {
    public ArrayList<WindowUpdater> windows;

    public WindowManager() {
        windows = new ArrayList<>();
    }

    //TODO: add javadoc
    public void newWindow(@NotNull WindowUpdater window) {
        int i = windows.size();
        windows.add(window);
        windows.get(i).start();
        //getWindow(window.getWindowKey()).start(); //may produce nullPointerException
    }

    //TODO: add javadoc
    public @Nullable WindowUpdater getWindow(@Nullable String windowKey) {
        if (windowKey != null && !windowKey.equals("")) {
            for (WindowUpdater window : windows) {
                if (window.getWindowKey().equals(windowKey)) {
                    return window;
                }
            }
        }
        return null;
    }

    //TODO: add javadoc
    public void end() {
        for (WindowUpdater window : windows) {
            window.end();
        }
    }
}