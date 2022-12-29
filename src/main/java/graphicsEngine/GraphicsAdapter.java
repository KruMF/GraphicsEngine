package graphicsEngine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowUpdater;

/**
 * A graphics adapter class.
 * Intended for allowing not to use the GraphicsManager directly.
 * Reference this to use the GraphicsEngine.
 * TODO: check redundancy; originally meant for security; fix javadocs
 */
public class GraphicsAdapter extends WindowManager {
    /**
     * Starts a new blank graphics adapter.
     */
    public GraphicsAdapter() {
        super();
    }

    /**
     * Adds a new window to this graphics adapter.
     *
     * @param window A corresponding WindowUpdater object.
     */
    @Override
    public final void newWindow(@NotNull WindowUpdater window) {
        super.newWindow(window);
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
    @Override
    public final @Nullable WindowUpdater getWindow(@Nullable String windowKey) {
        return super.getWindow(windowKey);
    }

    /**
     * Ends all windows.
     */
    @Override
    public final void end() {
        printLine("Graphics ending.");
        super.end();
    }
}