package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.GraphicsAdapter;

/**
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

}