package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyboardListenerAdder {
    KeyboardListenerAdder(JFrame window, InputData inputData){
        addKeyListener(window, inputData);
    }

    private void addKeyListener(JFrame window, InputData inputData){
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                boolean newKey = true;

                for (int i = 0; i < inputData.keys.length; i++) { //pârbauda vai piespiestâ poga ir jauna
                    if (key == inputData.keys[i]) {
                        newKey = false;
                        break;
                    }
                }

                if (newKey) {
                    int[] keysTemp = new int[inputData.keys.length + 1];

                    for (int i = 0; i < inputData.keys.length; i++) {
                        keysTemp[i] = inputData.keys[i];
                    }
                    keysTemp[inputData.keys.length] = key;

                    inputData.keys = keysTemp;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (inputData.keys.length > 1) {
                    int key = e.getKeyCode();
                    int[] keysTemp = new int[inputData.keys.length - 1];

                    for (int i = 0, j = 0; i < inputData.keys.length; i++) {
                        if (key != inputData.keys[i]) {
                            keysTemp[j] = inputData.keys[i];
                            j++;
                        }
                    }

                    inputData.keys = keysTemp;
                } else inputData.keys = new int[] {};
            }
        });
    }
}