package graphicsEngine.windows;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A utility class for containing windows and their updaters.
 * Meant to be extended by GraphicsAdapter.
 */
public abstract class WindowManager {
    private final ArrayList<WindowUpdater> windows;

    /**
     * Creates a new WindowManager, initially with no windows.
     */
    public WindowManager() {
        windows = new ArrayList<>();
    }

    /**
     * Use this to add new windows.
     *
     * @param window A corresponding WindowUpdater object.
     */
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

    /**
     * Gets a WindowUpdater object that contains a window with corresponding key.
     * If multiple windows with the same key exist, returns the first one.
     * Returns null, if provided key is null or no such window found.
     *
     * @param windowKey Key of the window.
     *
     * @return The specified WindowUpdater object.
     */
    public @Nullable WindowUpdater getWindow(@Nullable String windowKey) {
        try {
            int index = getWindowIndex(windowKey);
            return windows.get(index);
        } catch (NullPointerException e) {
            return null; //returns null if no such window found
        }
    }

    /**
     * Ends a specified window.
     *
     * @param windowKey Key of the window.
     */
    @SuppressWarnings("unused")
    public void endWindow(@Nullable String windowKey) {
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

    /**
     * Ends all windows.
     */
    public void end() {
        for (WindowUpdater window : windows) {
            window.end();
        }
    }
}