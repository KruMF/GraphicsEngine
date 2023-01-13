package graphicsEngineDemo.d1_simplestDemo;

import org.jetbrains.annotations.NotNull;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SimpleWindow;

/**
 * Simplest possible use of the GraphicsEngine.
 * Everything contained in just one class.
 * See <b><code>ReadMe.md<code/></b> for more info.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window(this)));
        }};
    }

    /**
     * The window to display.
     */
    private static class Window extends SimpleWindow {
        /**
         * Creates the window.
         *
         * @param windowManager A WindowManager object.
         */
        public Window(@NotNull WindowManager windowManager) {
            super(windowManager, new WindowConfig(), null);
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