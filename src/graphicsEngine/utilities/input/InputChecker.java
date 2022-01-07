package graphicsEngine.utilities.input;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.containers.GenericContainer;

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
    public void check(InputManager input, GenericContainer container) {
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
        switch (keyText) {
            case "0" -> GraphicsManager.pages.activePage = 0;
            case "1" -> GraphicsManager.pages.activePage = 1;
            case "2", "3", "4", "5", "6", "7", "8", "9" ->
                    System.out.println("Page " + keyText + " does not exist");
            default -> System.out.println("Key " + keyText + " pressed");
        }
    }

    /**
     * Check button interaction and actions within a container.
     *
     * @param input     Input to check.
     * @param container Relevant container.
     */
    private void buttonCheck(InputManager input, GenericContainer container) {
        container.buttonInteractionCheck(input.inputData);
        container.buttonActionCheck();
    }
}