package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;

import org.jetbrains.annotations.NotNull;

/**
 * A simple window; has only contents.
 */
public abstract class SimpleWindow extends AbstractWindow {
    /**
     * Creates a new SimpleWindow with specified configuration.
     *
     * @param windowManager A WindowManager object
     * @param config        Window configuration.
     */
    public SimpleWindow(@NotNull WindowManager windowManager,
                        @NotNull WindowConfig config) {
        super(windowManager, config);
    }
}