package graphicsEngineOld.utilities.input;

import graphicsEngineOld.engine.data.windowParameters.WindowParameters;
import graphicsEngineOld.engine.ExitManager;
import graphicsEngineOld.utilities.input.listeners.ListenerAdder;

import javax.swing.JFrame;

import org.jetbrains.annotations.NotNull;

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
    public InputManager(@NotNull JFrame window, @NotNull WindowParameters windowParameters,
                        @NotNull ExitManager exitManager) {
        inputData = new InputData();
        new ListenerAdder(window, windowParameters, inputData, exitManager);
    }
}