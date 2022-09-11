package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;

/**
 * GraphicsEngine demo demonstrating the use of overlays.
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
}