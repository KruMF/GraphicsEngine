package graphicsEngineDemo.d5_featurePreview;

import graphicsEngine.GraphicsAdapter;

import graphicsEngine.windows.WindowUpdater;

//TODO: add javadoc
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
}