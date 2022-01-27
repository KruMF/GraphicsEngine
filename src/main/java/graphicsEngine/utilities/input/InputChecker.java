package graphicsEngine.utilities.input;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.containers.ButtonContainer;

/**
 * A class for checking user input.
 * Intended to be added to a page.
 * Extendable for override.
 */
public class InputChecker {

    /**
     * A generic empty constructor.
     */
    public InputChecker() {}

    /**
     * Check input for a container.
     *
     * @param input     Input to check.
     * @param container Relevant container.
     */
    public void check(InputManager input, ButtonContainer container) {
        if (input != null) {
            keyboardActionCheck(input);
            if (container != null) {
                buttonCheck(input, container);
            }
        }
    }

    /**
     * Check each pressed key.
     *
     * @param input InputManager containing inputData with array of pressed keys.
     */
    private void keyboardActionCheck(InputManager input) {
        for (int key : input.inputData.keys) {
            String keyText = java.awt.event.KeyEvent.getKeyText(key);
            keyboardActions(keyText);
        }
    }

    /**
     * Actions to be performed upon key pressing by key text.
     * Overridable for page-specific keyboard actions.
     *
     * @param keyText Text of key pressed.
     */
    public void keyboardActions(String keyText){
        System.out.println("Key " + keyText + " pressed. No actions set up.");
    }

    /**
     * Check button interaction and actions within a container.
     *
     * @param input     Input to check.
     * @param container Relevant container.
     */
    private void buttonCheck(InputManager input, ButtonContainer container) {
        container.buttonInteractionCheck(input.inputData);
        container.buttonActionCheck();
    }
}