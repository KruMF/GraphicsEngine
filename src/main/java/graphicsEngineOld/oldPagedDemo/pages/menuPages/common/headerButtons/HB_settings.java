package graphicsEngineOld.oldPagedDemo.pages.menuPages.common.headerButtons;

import graphicsEngineOld.engine.GraphicsManager;
import graphicsEngineOld.parts.interactive.buttons.Button;

import graphicsEngineOld.oldPagedDemo.pages.menuPages.settingsPage.SettingsPage;

import com.google.inject.internal.Nullable;

/**
 * Header button for switching to settings page.
 */
public class HB_settings extends Button {

    /**
     * Constructor for the button.
     *
     * @param size Size of the button. (Null - stretchable)
     */
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