package graphicsEngine.oldPagedDemo.pages.menuPages.settingsPage;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.parts.simpleParts.SimplePart;

import graphicsEngine.oldPagedDemo.pages.menuPages.common.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the settings page for the Simple Demo.
 */
public class SettingsPage extends CommonMenuPage {
    public static final String PAGE_KEY = "settingsPage";

    /**
     * Constructor for the settings page.
     *
     * @param palette Color palette to use.
     */
    public SettingsPage(@NotNull Palette palette) {
        super(null, palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}