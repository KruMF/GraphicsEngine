package graphicsEngine.utilities.input;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.input.listeners.ListenerAdder;

public class InputManager {
    public InputData inputData;

    public InputManager() {
        inputData = new InputData();
        new ListenerAdder(
                GraphicsManager.graphics.window,
                inputData,
                false);
    }
}