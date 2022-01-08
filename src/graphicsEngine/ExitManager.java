package graphicsEngine;

public class ExitManager {
    private static final String exitMessage = ": Closing.";
    private final String graphicsEngineName;

    ExitManager(String graphicsEngineName) {
        this.graphicsEngineName = graphicsEngineName;
    }

    public void close() {
        System.out.println(graphicsEngineName + exitMessage);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}