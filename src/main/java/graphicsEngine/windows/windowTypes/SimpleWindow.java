package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import org.jetbrains.annotations.NotNull;

/**
 * A simple window; has only contents.
 */
public abstract class SimpleWindow extends AbstractWindow {
    /**
     * Creates a new SimpleWindow with specified configuration.
     *
     * @param config Window configuration.
     */
    public SimpleWindow(@NotNull WindowConfig config) {
        super(config);
    }
}