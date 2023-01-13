package graphicsEngineDemo.d5_featurePreview;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;

import graphicsEngineDemo.d5_featurePreview.window.Window;

/**
 * A general demo for previewing various features and capabilities of the Graphics Engine.
 * See <b><code>ReadMe.md<code/></b> for more info.
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