package graphicsEngine.demo.simple.withPages.common;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.utilities.pages.PageManager;

import graphicsEngine.demo.simple.withPages.pages.menuPages.startingPage.StartingPage;
import graphicsEngine.demo.simple.withPages.pages.menuPages.settingsPage.SettingsPage;
import graphicsEngine.demo.simple.withPages.pages.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngine.demo.simple.withPages.pages.demoPages.page1.Page_1;
import graphicsEngine.demo.simple.withPages.pages.demoPages.page2.Page_2;

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
        PageManager pages = GraphicsManager.pages;
        switch (keyText) {
            case "1" -> pages.setActivePage(Page_1.PAGE_KEY);
            case "2" -> pages.setActivePage(Page_2.PAGE_KEY);

            case "8" -> pages.setActivePage(DemoSelectPage.PAGE_KEY);
            case "9" -> pages.setActivePage(SettingsPage.PAGE_KEY);
            case "0" -> pages.setActivePage(StartingPage.PAGE_KEY);

            case "3", "4", "5", "6", "7" -> System.out.println("Page " + keyText + " does not exist");
            default -> super.keyboardActions(keyText);
        }
    }
}