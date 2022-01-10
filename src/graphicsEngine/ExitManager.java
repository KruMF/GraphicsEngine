package graphicsEngine;

public class ExitManager {
    private static final String EXIT_MESSAGE = ": Closing.";
    private final String graphicsEngineName;

    ExitManager(String graphicsEngineName) {
        this.graphicsEngineName = graphicsEngineName;
    }

    public void close() {
        System.out.println(graphicsEngineName + EXIT_MESSAGE);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}