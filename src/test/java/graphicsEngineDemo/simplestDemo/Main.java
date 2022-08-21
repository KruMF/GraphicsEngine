package graphicsEngineDemo.simplestDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;

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
    private static class Window extends AbstractWindow {
        public Window() {
            super(new WindowConfig());
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }
}