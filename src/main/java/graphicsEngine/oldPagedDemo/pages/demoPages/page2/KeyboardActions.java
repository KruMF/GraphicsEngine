package graphicsEngine.oldPagedDemo.pages.demoPages.page2;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.parts.pages.PageManager;

import graphicsEngine.oldPagedDemo.common.BlankKeyboardActions;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class KeyboardActions extends BlankKeyboardActions {

    //TODO: add javadoc
    KeyboardActions() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void keyboardActions(@NotNull String keyText) {
        PageManager pages = GraphicsManager.pages;
        switch (keyText) {
            case "Space" -> Center.table.randomizeCellValues();
            default -> super.keyboardActions(keyText);
        }
    }
}