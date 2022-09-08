package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngineDemo.d5_featurePreview.common.CommonHeaderButtons;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectButtons;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;

import java.awt.event.ActionEvent;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class ButtonActions {
    //TODO: add javadoc
    public static boolean headerButtonActions(@NotNull ActionEvent e,
                                              @NotNull WindowUtilities window) {
        switch (e.getActionCommand()) {
            case CommonHeaderButtons.Button_Start.ACTION_COMMAND ->
                    window.setActivePage(StartingPage.getStaticPageKey());
            case CommonHeaderButtons.Button_Settings.ACTION_COMMAND ->
                    window.setActivePage(SettingsPage.getStaticPageKey());
            case CommonHeaderButtons.Button_DemoSelect.ACTION_COMMAND ->
                    window.setActivePage(DemoSelectPage.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }

    //TODO: add javadoc
    public static boolean demoSelectButtonActions(@NotNull ActionEvent e,
                                                  @NotNull WindowUtilities window) {
        switch (e.getActionCommand()) {
            case DemoSelectButtons.Button_Page1.ACTION_COMMAND ->
                    window.setActivePage(Page1.getStaticPageKey());
            case DemoSelectButtons.Button_Page2.ACTION_COMMAND ->
                    window.setActivePage(Page2.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }
}