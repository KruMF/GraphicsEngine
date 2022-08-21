package graphicsEngineDemo.multiAdapterDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

/**
 * TODO: finish this and add javadocs
 */
public class Main {

    private static GraphicsAdapter adapter1;
    private static GraphicsAdapter adapter2;

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        adapter1 = new GraphicsAdapter() {{
            graphics.newWindow(new SimpleWindow1());
        }};
        adapter2 = new GraphicsAdapter() {{
            graphics.newWindow(new SimpleWindow2());
            graphics.newWindow(new PagedWindow());
        }};
    }

    private static class SimpleWindow1 extends AbstractWindow {
        public SimpleWindow1() {
            super(config());
        }

        /**
         * Hardcoded configuration of a new SimpleWindow1 object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 1 - Simple window 1";
            int[]
                    size = new int[] {200, 200},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }

    private static class SimpleWindow2 extends AbstractWindow {
        public SimpleWindow2() {
            super(config());
        }

        /**
         * Hardcoded configuration of a new SimpleWindow2 object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 2 - Simple window 2";
            int[]
                    size = new int[] {200, 200},
                    location = new int[] {50, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DO_NOTHING_ON_CLOSE;
            return config;
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }

    private static class PagedWindow extends AbstractWindow {
        public PagedWindow() {
            super(config());
        }

        /**
         * Hardcoded configuration of a new PagedWindow object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 2 - Paged window";
            int[]
                    size = new int[] {600, 400},
                    location = new int[] {300, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DO_NOTHING_ON_CLOSE;
            return config;
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }
}