package graphicsEngine.demo.simple.common;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.utilities.input.InputChecker;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class CommonKeyboardActions extends InputChecker {

    //TODO: add javadoc
    CommonKeyboardActions() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void keyboardActions(@NotNull String keyText) {
        switch (keyText) {
            case "0" -> GraphicsManager.pages.activePage = 0;
            case "1" -> GraphicsManager.pages.activePage = 1;
            case "2" -> GraphicsManager.pages.activePage = 2;
            case "3", "4", "5", "6", "7", "8", "9" -> System.out.println("Page " + keyText + " does not exist");
            default -> super.keyboardActions(keyText);
        }
    }
}