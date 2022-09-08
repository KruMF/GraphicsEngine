package graphicsEngine.windows;

import DelayCalculator.DelayOptions;
import ThreadAbstraction.AbstractUpdater;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A class for joining window and the thread that updates it.
 */
public class WindowUpdater extends AbstractUpdater {
    private AbstractWindow window;

    /**
     * Creates a window updater with default delay options.
     *
     * @param window A window to update.
     */
    public WindowUpdater(@NotNull AbstractWindow window) {
        super();
        setWindow(window);
    }

    /**
     * Creates a window updater with specified delay in milliseconds.
     *
     * @param window A window to update.
     * @param delay  Delay in milliseconds.
     */
    @SuppressWarnings("unused")
    public WindowUpdater(@NotNull AbstractWindow window,
                         long delay) {
        super(delay);
        setWindow(window);
    }

    /**
     * Creates a window updater with specified delay options.
     *
     * @param window       A window to update.
     * @param delayOptions Delay options.
     */
    @SuppressWarnings("unused")
    public WindowUpdater(@NotNull AbstractWindow window,
                         @Nullable DelayOptions delayOptions) {
        super(delayOptions);
        setWindow(window);
    }

    private void setWindow(@NotNull AbstractWindow window) {
        this.window = window;
    }

    /**
     * Gets the key of the contained window.
     *
     * @return The key of the window.
     */
    public final String getWindowKey() {
        return window.getWindowKey();
    }

    /**
     * Gets called when thread runs.
     */
    @Override
    public final void update() {
        window.repaint();
    }

    /**
     * Happens upon finishing thread.
     */
    @Override
    public void finish() {
        window.dispose();
    }
}