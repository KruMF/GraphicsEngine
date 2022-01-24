package graphicsEngine;

// TODO: add javadoc
public class ExitManager {
    private static final String EXIT_MESSAGE = ": Closing.";
    private final String graphicsEngineName;

    // TODO: add javadoc
    ExitManager(String graphicsEngineName) {
        this.graphicsEngineName = graphicsEngineName;
    }

    // TODO: add javadoc
    public void close() {
        System.out.println(graphicsEngineName + EXIT_MESSAGE);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}