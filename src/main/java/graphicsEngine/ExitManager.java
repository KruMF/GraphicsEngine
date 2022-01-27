package graphicsEngine;

/**
 * Exit manager for managing exit.
 */
public class ExitManager {
    private static final String EXIT_MESSAGE = ": Closing.";

    /**
     * Creates an ExitManager object.
     */
    public ExitManager() {}

    /**
     * Graphics engine closing operation to be called upon externally or by window listener.
     * Override and call super.close() to close any other threads upon closing graphics engine.
     */
    public void close() {
        System.out.println(GraphicsManager.GRAPHICS_ENGINE_NAME + EXIT_MESSAGE);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}