package graphicsEngineDemo.simplestDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.SimpleWindow;

import org.jetbrains.annotations.NotNull;

/**
 * Simplest possible use of the GraphicsEngine.
 * Everything contained in just one class.
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
    private static class Window extends SimpleWindow {
        public Window() {
            super(new WindowConfig());
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