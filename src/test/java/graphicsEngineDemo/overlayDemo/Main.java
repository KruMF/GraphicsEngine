package graphicsEngineDemo.overlayDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SinglePageWindow;

import org.jetbrains.annotations.NotNull;

/**
 * TODO: finish this and add javadocs
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window()));
        }};
    }

    /**
     * The window to display.
     */
    private static class Window extends SinglePageWindow {
        public Window() {
            super(new WindowConfig(), null);
        }

        @Override
        public @NotNull String getWindowKey() {
            return "window";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }
}