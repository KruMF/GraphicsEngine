package graphicsEngine;

public class ExitManager {
    String exitMessage;

    ExitManager() {
        exitMessage = "GraphicsEngine: Closing.";
    }

    public void close() {
        System.out.println(exitMessage);
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}