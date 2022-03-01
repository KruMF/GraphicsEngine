package graphicsEngine.demo.simple.withPages.pages.menuPages.demoSelectPage;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.utilities.pages.PageManager;

import graphicsEngine.demo.simple.withPages.common.BlankKeyboardActions;
import graphicsEngine.demo.simple.withPages.pages.demoPages.page1.Page_1;
import graphicsEngine.demo.simple.withPages.pages.demoPages.page2.Page_2;

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
            case "1" -> pages.setActivePage(Page_1.PAGE_KEY);
            case "2" -> pages.setActivePage(Page_2.PAGE_KEY);

            //add new demo pages here

            default -> super.keyboardActions(keyText);
        }
    }
}