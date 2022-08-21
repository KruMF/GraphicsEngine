package graphicsEngine.windows;

import DelayCalculator.DelayOptions;
import ThreadAbstraction.AbstractUpdater;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO:add javadocs
public class WindowUpdater extends AbstractUpdater {
    private AbstractWindow window;

    //default delayOptions
    public WindowUpdater(@NotNull AbstractWindow window) {
        super();
        setWindow(window);
    }

    //delay in milliseconds
    public WindowUpdater(@NotNull AbstractWindow window, long delay) {
        super(delay);
        setWindow(window);
    }

    //custom delayOptions
    public WindowUpdater(@NotNull AbstractWindow window, @Nullable DelayOptions delayOptions) {
        super(delayOptions);
        setWindow(window);
    }

    private void setWindow(@NotNull AbstractWindow window) {
        this.window = window;
    }

    public final String getWindowKey() {
        return window.getWindowKey();
    }

    @Override
    public final void update() {
        window.repaint();
    }

    @Override
    public void finish() {
        window.dispose();
    }
}