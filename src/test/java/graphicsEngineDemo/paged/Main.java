package graphicsEngineDemo.paged;

import graphicsEngine.AbstractGraphicsAdapter;
import graphicsEngine.windows.MultiPageWindow;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import static graphicsEngine.Utilities.printLine;

//TODO: finish this
public class Main {
    public static void main(String[] args) {
        printLine("Paged demo currently not available");
        new GraphicsAdapter();
    }

    private static class GraphicsAdapter extends AbstractGraphicsAdapter {
        protected GraphicsAdapter() {
            super();
            graphics.newWindow(new Window());
        }
    }

    private static class Window extends MultiPageWindow {
        protected Window() {
            super(config(), preparePages());
        }

        /**
         * Hardcoded configuration of a new Window object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Paged demo";
            int[]
                    size = new int[] {500, 500},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        private static List<AbstractPage> preparePages() {
            return new ArrayList<>() {{
                add(new Page1());
                add(new Page2());
            }};
        }
    }

    protected static class Page1 extends AbstractPage {
        protected Page1() {
            super(Color.green);
        }

        @Override
        public String getPageKey() {
            return "page1";
        }
    }

    protected static class Page2 extends AbstractPage {
        protected Page2() {
            super(Color.magenta);
        }

        @Override
        public String getPageKey() {
            return "page2";
        }
    }
}