package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;

import java.util.List;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A simple window; has only contents.
 */
public abstract class SimpleWindow extends AbstractWindow {
    /**
     * Creates a new SimpleWindow with specified configuration.
     * Adds known action listeners to this window.
     *
     * @param windowManager      A WindowManager object.
     * @param config             Window configuration.
     * @param actionListenerList List of action listeners to add to this window.
     */
    public SimpleWindow(@NotNull WindowManager windowManager,
                        @NotNull WindowConfig config,
                        @Nullable List<ActionListener> actionListenerList) {
        super(windowManager, config, actionListenerList);
    }
}