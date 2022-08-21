package graphicsEngineDemo.simplestDemo;

import graphicsEngine.AbstractGraphicsAdapter;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

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
        new AbstractGraphicsAdapter() {{
            graphics.newWindow(new Window());
        }};
    }

    /**
     * The window to display.
     */
    private static class Window extends AbstractWindow {
        public Window() {
            super(new WindowConfig());
        }

        @Override
        public void addParts() {}
    }
}