package graphicsEngine.utilities.input;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.ExitManager;
import graphicsEngine.utilities.input.listeners.ListenerAdder;

import javax.swing.JFrame;

// TODO: add javadoc
public class InputManager {
    public InputData inputData;

    // TODO: add javadoc
    public InputManager(JFrame window, WindowParameters windowParameters, ExitManager exitManager) {
        inputData = new InputData();
        new ListenerAdder(window, windowParameters, inputData, exitManager, false);
    }
}