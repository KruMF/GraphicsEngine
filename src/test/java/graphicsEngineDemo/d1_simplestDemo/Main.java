package graphicsEngineDemo.d1_simplestDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.SimpleWindow;

import org.jetbrains.annotations.NotNull;

/**
 * Simplest possible use of the GraphicsEngine.
 * Everything contained in just one class.
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
        /**
         * Creates the window.
         */
        public Window() {
            super(new WindowConfig());
            setDefaultCloseOperation(EXIT_ON_CLOSE); // Not necessary; added for easier use.
        }

        /**
         * Gets the key of the window.
         * Intended for multi-window cases.
         *
         * @return The key of this window.
         */
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