package graphicsEngineOld.utilities.input.listeners;

import graphicsEngineOld.utilities.input.InputData;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.jetbrains.annotations.NotNull;

/**
 * Keyboard listener adder class.
 */
class KeyboardListenerAdder {

    /**
     * Creates a keyboard listener adder.
     *
     * @param window    Window to add listeners to.
     * @param inputData Input data to modify.
     */
    KeyboardListenerAdder(@NotNull JFrame window, @NotNull InputData inputData) {
        addKeyListener(window, inputData);
    }

    /**
     * Adds keyboard listeners to the window.
     *
     * @param window    Window to add listeners to.
     * @param inputData Input data to modify.
     */
    private void addKeyListener(@NotNull JFrame window, @NotNull InputData inputData) {
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (!keyAlreadyPressedCheck(inputData.keys, key)) {
                    inputData.keys = addNewKey(inputData.keys, key);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (inputData.keys.length > 1) {
                    int key = e.getKeyCode();
                    inputData.keys = removeKey(inputData.keys, key);
                } else {
                    inputData.keys = new int[] {};
                }
            }
        });
    }

    /**
     * Checks if key has already been pressed.
     *
     * @param keyArray Array of pressed keys.
     * @param key      Key to check.
     *
     * @return True if key already pressed, false if not.
     */
    private boolean keyAlreadyPressedCheck(int[] keyArray, int key) {
        for (int i : keyArray) {
            if (key == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds new key to the array of pressed keys.
     *
     * @param keyArray Array of pressed keys.
     * @param key      Key to add.
     *
     * @return New array of pressed keys.
     */
    private int[] addNewKey(int[] keyArray, int key) {
        int[] newArray = new int[keyArray.length + 1];
        System.arraycopy(
                keyArray, 0,
                newArray, 0, keyArray.length);
        newArray[keyArray.length] = key;
        return newArray;
    }

    /**
     * Removes a key from the array of pressed keys.
     *
     * @param keyArray Array of pressed keys.
     * @param key      Key to remove.
     *
     * @return New array of pressed keys.
     */
    private int[] removeKey(int[] keyArray, int key) {
        int[] newArray = new int[keyArray.length - 1];
        for (int i = 0, j = 0; i < keyArray.length; i++) {
            if (key != keyArray[i]) {
                newArray[j] = keyArray[i];
                j++;
            }
        }
        return newArray;
    }
}