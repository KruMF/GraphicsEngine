package graphicsEngineDemo.d4_multiAdapterDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SimpleWindow;

import org.jetbrains.annotations.NotNull;

/**
 * GraphicsEngine demo demonstrating the capability to simultaneously run multiple graphics adapters.
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
            newWindow(new WindowUpdater(new SimpleWindow1()));
        }};
        adapter2 = new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new SimpleWindow2()));
            newWindow(new WindowUpdater(new PagedWindow()));
        }};
    }

    private static class SimpleWindow1 extends SimpleWindow {
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
                    size = new int[] {300, 200},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
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

    private static class SimpleWindow2 extends SimpleWindow {
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
                    size = new int[] {300, 200},
                    location = new int[] {50, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DISPOSE_ON_CLOSE;
            return config;
        }

        @Override
        public @NotNull String getWindowKey() {
            return "simpleWindow";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }

    private static class PagedWindow extends SimpleWindow {
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
                    location = new int[] {400, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DISPOSE_ON_CLOSE;
            return config;
        }

        @Override
        public @NotNull String getWindowKey() {
            return "pagedWindow";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }
}