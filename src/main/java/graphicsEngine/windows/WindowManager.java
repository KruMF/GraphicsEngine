package graphicsEngine.windows;

import java.util.ArrayList;

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
    }

    private int getWindowIndex(@Nullable String windowKey) throws NullPointerException {
        if (windowKey != null && !windowKey.equals("")) {
            for (int i = 0; i < windows.size(); i++) {
                if (windows.get(i).getWindowKey().equals(windowKey)) {
                    return i;
                }
            }
        }
        throw new NullPointerException();
    }

    //TODO: add javadoc
    public @Nullable WindowUpdater getWindow(@Nullable String windowKey) {
        try {
            int index = getWindowIndex(windowKey);
            return windows.get(index);
        } catch (NullPointerException e) {
            return null; //returns null if no such window found
        }
    }

    //TODO: add javadoc
    public void endWindow(String windowKey) {
        try {
            int index = getWindowIndex(windowKey);
            WindowUpdater window = getWindow(windowKey);
            if (window == null) {
                throw new NullPointerException();
            }

            window.end();
            windows.remove(index);
        } catch (NullPointerException ignored) {}
    }

    //TODO: add javadoc
    public void end() {
        for (WindowUpdater window : windows) {
            window.end();
        }
    }
}