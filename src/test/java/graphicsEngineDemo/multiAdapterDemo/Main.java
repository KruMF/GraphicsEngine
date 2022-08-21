package graphicsEngineDemo.multiAdapterDemo;

import graphicsEngine.AbstractGraphicsAdapter;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

/**
 * TODO: finish this and add javadocs
 */
public class Main {

    private static AbstractGraphicsAdapter adapter1;
    private static AbstractGraphicsAdapter adapter2;

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        adapter1 = new AbstractGraphicsAdapter() {{
            graphics.newWindow(new SimpleWindow1());
        }};
        adapter2 = new AbstractGraphicsAdapter() {{
            graphics.newWindow(new SimpleWindow2());
            graphics.newWindow(new PagedWindow());
        }};
    }

    private static class SimpleWindow1 extends AbstractWindow {
        public SimpleWindow1() {
            super(new WindowConfig());
        }

        @Override
        public void addParts() {}
    }

    private static class SimpleWindow2 extends AbstractWindow {
        public SimpleWindow2() {
            super(new WindowConfig());
        }

        @Override
        public void addParts() {}
    }

    private static class PagedWindow extends AbstractWindow {
        public PagedWindow() {
            super(new WindowConfig());
        }

        @Override
        public void addParts() {}
    }
}