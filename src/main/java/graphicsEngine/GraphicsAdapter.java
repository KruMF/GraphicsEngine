package graphicsEngine;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowUpdater;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

/**
 * A graphics adapter class.
 * Intended for allowing not to use the GraphicsManager directly.
 * Reference this to use the GraphicsEngine.
 * TODO: check redundancy; originally meant for security; fix javadocs
 */
public class GraphicsAdapter extends WindowManager {
    public GraphicsAdapter() {
        super();
    }

    @Override
    public final void newWindow(@NotNull WindowUpdater window) {
        super.newWindow(window);
    }

    @Override
    public final @Nullable WindowUpdater getWindow(@Nullable String windowKey) {
        return super.getWindow(windowKey);
    }

    @Override
    public final void end() {
        printLine("Graphics ending.");
        super.end();
    }
}