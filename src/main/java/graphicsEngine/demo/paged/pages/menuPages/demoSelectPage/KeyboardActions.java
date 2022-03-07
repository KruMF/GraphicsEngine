package graphicsEngine.demo.paged.pages.menuPages.demoSelectPage;

import graphicsEngine.engine.GraphicsManager;

import graphicsEngine.demo.paged.common.BlankKeyboardActions;
import graphicsEngine.demo.paged.pages.demoPages.page1.Page_1;
import graphicsEngine.demo.paged.pages.demoPages.page2.Page_2;
import graphicsEngine.demo.paged.pages.demoPages.page3.Page_3;

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
        switch (keyText) {
            case "1" -> changePage(Page_1.PAGE_KEY);
            case "2" -> changePage(Page_2.PAGE_KEY);
            case "3" -> changePage(Page_3.PAGE_KEY);

            //add new demo pages here

            default -> super.keyboardActions(keyText);
        }
    }

    private void changePage(String key) {
        GraphicsManager.pages.setActivePage(key);
    }
}