package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyboardListenerAdder {
    KeyboardListenerAdder(JFrame window, InputData inputData) {
        addKeyListener(window, inputData);
    }

    private void addKeyListener(JFrame window, InputData inputData) {
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

    private boolean keyAlreadyPressedCheck(int[] keyArray, int key) {
        for (int i : keyArray) {
            if (key == i) {
                return true;
            }
        }
        return false;
    }

    private int[] addNewKey(int[] keyArray, int key) {
        int[] newArray = new int[keyArray.length + 1];
        System.arraycopy(
                keyArray, 0,
                newArray, 0, keyArray.length);
        newArray[keyArray.length] = key;
        return newArray;
    }

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