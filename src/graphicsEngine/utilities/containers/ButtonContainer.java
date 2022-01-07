package graphicsEngine.utilities.containers;

import graphicsEngine.utilities.input.InputData;

/**
 * Interface for checking button interactions and actions.
 */
public interface ButtonContainer {
    void buttonInteractionCheck(InputData input);
    void buttonActionCheck();
}