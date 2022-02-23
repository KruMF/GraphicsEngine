package graphicsEngine.demo.simple.withPages.pages.menuPages.settingsPage;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.simple.withPages.pages.menuPages.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the settings page for the Simple Demo.
 */
public class SettingsPage extends CommonMenuPage {

    /**
     * Constructor for the settings page.
     *
     * @param palette Color palette to use.
     */
    public SettingsPage(@NotNull Palette palette) {
        super(palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{add(new Center());}};
    }
}