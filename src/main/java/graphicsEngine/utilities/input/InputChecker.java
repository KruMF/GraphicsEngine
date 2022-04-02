package graphicsEngine.utilities.input;

import graphicsEngine.parts.containers.ButtonContainer;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

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
    public void check(@Nullable InputManager input, @Nullable ButtonContainer container) {
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
    private void keyboardActionCheck(@NotNull InputManager input) {
        for (int key : input.inputData.keys) {
            String keyText = java.awt.event.KeyEvent.getKeyText(key);
            keyboardActions(keyText);
        }
    }

    /**
     * Actions to be performed upon key pressing by key text.
     * Overridable for page-specific keyboard actions.
     *
     * @param keyText Text of the pressed key.
     */
    public void keyboardActions(@NotNull String keyText){
        System.out.println("Key " + keyText + " pressed. No actions set up.");
    }

    /**
     * Check button interaction and actions within a container.
     *
     * @param input     Input to check.
     * @param container Relevant container.
     */
    private void buttonCheck(@NotNull InputManager input, @NotNull ButtonContainer container) {
        container.buttonInteractionCheck(input.inputData);
        container.buttonActionCheck();
    }
}