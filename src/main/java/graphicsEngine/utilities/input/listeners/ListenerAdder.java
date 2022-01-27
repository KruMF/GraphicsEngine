package graphicsEngine.utilities.input.listeners;

import graphicsEngine.data.windowParameters.WindowParameters;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.ExitManager;

import javax.swing.JFrame;

/**
 * Default window, keyboard and mouse listener adder for input.
 * Extendable for extra listeners.
 */
public class ListenerAdder {

    /**
     * Creates a default ListenerAdder with default listeners.
     *
     * @param window           Window to add listeners to.
     * @param windowParameters Window parameters.
     * @param inputData        Input data.
     * @param exitManager      Exit manager to call upon exit.
     */
    public ListenerAdder(JFrame window, WindowParameters windowParameters,
                         InputData inputData, ExitManager exitManager) {
        defaultListeners(window, windowParameters, inputData, exitManager);
        addExtraListeners();
    }

    /**
     * Adds default listeners.
     *
     * @param window           Window to add listeners to.
     * @param windowParameters Window parameters.
     * @param inputData        Input data.
     * @param exitManager      Exit manager to call upon exit.
     */
    private void defaultListeners(JFrame window, WindowParameters windowParameters,
                                  InputData inputData, ExitManager exitManager) {
        new WindowListenerAdder(window, windowParameters, inputData, exitManager);
        new KeyboardListenerAdder(window, inputData);
        new MouseListenerAdder(window, inputData);
    }

    /**
     * Placeholder for adding new listeners (joysticks, controllers, etc)
     */
    @SuppressWarnings("EmptyMethod")
    public void addExtraListeners() {}
}