package graphicsEngine.utilities.input.listeners;

import graphicsEngine.engine.data.windowParameters.WindowParameters;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.engine.ExitManager;

import javax.swing.JFrame;

import org.jetbrains.annotations.NotNull;

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
    public ListenerAdder(@NotNull JFrame window, @NotNull WindowParameters windowParameters,
                         @NotNull InputData inputData, @NotNull ExitManager exitManager) {
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
    private void defaultListeners(@NotNull JFrame window, @NotNull WindowParameters windowParameters,
                                  @NotNull InputData inputData, @NotNull ExitManager exitManager) {
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