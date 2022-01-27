package graphicsEngine;

// TODO: add javadoc
public class ExitManager {
    private static final String EXIT_MESSAGE = ": Closing.";

    /**
     * Creates an ExitManager object.
     */
    public ExitManager() {}

    // TODO: add javadoc
    public void close() {
        System.out.println(GraphicsManager.GRAPHICS_ENGINE_NAME + EXIT_MESSAGE);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}