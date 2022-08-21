package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import org.jetbrains.annotations.Nullable;

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
            add(new Page1(null));
            //TODO: add pages here; maybe use MultiPageWindow instead of AbstractWindow
        }
    }

    private static class CommonHeader extends AbstractHeader {
        private static final int HEIGHT = 50;

        protected CommonHeader(@Nullable PanelColors panelColors) {
            super(panelColors, HEIGHT);
        }

        @Override
        public void addParts() {}
    }

    private static class CommonFooter extends AbstractFooter {
        private static final int HEIGHT = 100;

        protected CommonFooter(@Nullable PanelColors panelColors) {
            super(panelColors, HEIGHT);
        }

        @Override
        public void addParts() {}
    }

    private static abstract class AbstractCommonPage extends HeaderAndFooterPage {
        protected AbstractCommonPage(@Nullable PanelColors panelColors) {
            super(new CommonHeader(panelColors),new CommonFooter(panelColors));
        }
    }

    private static class Page1 extends AbstractCommonPage {
        protected Page1(@Nullable PanelColors panelColors) {
            super(panelColors);
        }

        @Override
        public void addParts() {}

        @Override
        public String getPageKey() {
            return "page1";
        }
    }
}