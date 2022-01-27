package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.input.InputData;

import org.jetbrains.annotations.NotNull;

/**
 * Interface for checking interactions and actions for contained buttons or containers.
 */
public interface ButtonContainer {

    /**
     * Check interaction of contained buttons or containers.
     *
     * @param input Input data to check.
     */
    void buttonInteractionCheck(@NotNull InputData input);

    /**
     * Check actions of contained buttons or containers.
     */
    void buttonActionCheck();
}