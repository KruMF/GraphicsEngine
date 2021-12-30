package graphicsEngine.utilities.input;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.pages.Page;

public class InputCheck {

    public InputCheck() {
    }

    public void check(InputManager input, Page page) {
        keyboardActions(input);
        buttonCheck(input, page);
    }

    private void keyboardActions(InputManager input) {
        for (int key : input.inputData.keys) {
            String keyText = java.awt.event.KeyEvent.getKeyText(key);

            switch (keyText) {
                case "0" -> GraphicsManager.pages.activePage = 0;
                case "1" -> GraphicsManager.pages.activePage = 1;
                case "2", "3", "4", "5", "6", "7", "8", "9" -> System.out.println("Page " + keyText + " does not exist");
                default -> System.out.println("Key " + keyText + " pressed");
            }
        }
    }

    private void buttonCheck(InputManager input, Page page) {
        page.panelManager.buttonInteractionCheck();
        page.panelManager.buttonActionCheck();
    }
}