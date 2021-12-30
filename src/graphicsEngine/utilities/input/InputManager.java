package graphicsEngine.utilities.input;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.utilities.input.listeners.ListenerAdder;

import javax.swing.JFrame;

public class InputManager {
    public InputData inputData;

    public InputManager(JFrame window, WindowParameters windowParameters) {
        inputData = new InputData();
        new ListenerAdder(
                window, windowParameters,
                inputData,
                false);
    }
}