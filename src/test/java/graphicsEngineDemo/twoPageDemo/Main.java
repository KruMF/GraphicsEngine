package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

/**
 * Copy-pasted from simplest demo
 * TODO: finish this
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            graphics.newWindow(new Window());
        }};
    }

    private static class Window extends AbstractWindow {
        public Window() {
            super(config());
        }

        /**
         * Hardcoded configuration of a new Window object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Two page demo";
            int[]
                    size = new int[] {600, 400},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {
            //TODO: add pages here; maybe use MultiPageWindow instead of AbstractWindow
        }
    }
}