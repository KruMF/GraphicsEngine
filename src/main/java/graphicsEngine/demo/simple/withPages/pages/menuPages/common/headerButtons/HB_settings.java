package graphicsEngine.demo.simple.withPages.pages.menuPages.common.headerButtons;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.utilities.buttons.Button;

import graphicsEngine.demo.simple.withPages.pages.menuPages.settingsPage.SettingsPage;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class HB_settings extends Button {

    //TODO: add javadoc
    public HB_settings(@Nullable int[] size) {
        super(size, new boolean[] {true, false},
                "Settings",
                new int[] {0, 0});
    }

    /**
     * Button-specific action upon activation.
     */
    @Override
    public void action() {
        GraphicsManager.pages.setActivePage(SettingsPage.PAGE_KEY);
    }
}