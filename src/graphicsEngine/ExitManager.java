package graphicsEngine;

public class ExitManager {
    String exitMessage;

    ExitManager() {
        exitMessage = "GraphicsManager: Closing.";
    }

    public void close() {
        System.out.println(exitMessage);
        //data.windowParameters.updateWindowValues();
        //data.windowParameters.saveValues();
        GraphicsManager.graphics.window.dispose();
        GraphicsManager.running = false;
    }
}