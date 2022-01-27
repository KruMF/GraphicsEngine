package graphicsEngine.utilities.input;

import graphicsEngine.data.windowParameters.WindowParameters;
import graphicsEngine.ExitManager;
import graphicsEngine.utilities.input.listeners.ListenerAdder;

import javax.swing.JFrame;

/**
 * Input manager for managing input.
 */
public class InputManager {
    public InputData inputData;

    /**
     * Creates new input manager with default listeners.
     *
     * @param window           Window to add listeners to.
     * @param windowParameters Window parameters.
     * @param exitManager      Exit manager to call upon exit.
     */
    public InputManager(JFrame window, WindowParameters windowParameters, ExitManager exitManager) {
        inputData = new InputData();
        new ListenerAdder(window, windowParameters, inputData, exitManager);
    }
}