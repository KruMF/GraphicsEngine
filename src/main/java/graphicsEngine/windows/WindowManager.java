package graphicsEngine.windows;

import DelayCalculator.DelayOptions;
import ThreadAbstraction.AbstractUpdater;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

//TODO:add javadocs
public class WindowManager extends AbstractUpdater {
    private AbstractWindow window;

    public WindowManager(@NotNull AbstractWindow window) {
        super();
        setWindow(window);
    }

    public WindowManager(@NotNull AbstractWindow window, long delay) {
        super(delay);
        setWindow(window);
    }

    public WindowManager(@NotNull AbstractWindow window, @Nullable DelayOptions delayOptions) {
        super(delayOptions);
        setWindow(window);
    }

    private void setWindow(AbstractWindow window) {
        this.window = window;
    }

    @Override
    public void update() {
        window.repaint();
    }

    @Override
    public void finish() {
        window.dispose();
    }
}