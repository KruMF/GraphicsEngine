package graphicsEngine.demo.simple.withPages.pages.menuPages.demoSelectPage;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.simple.withPages.pages.menuPages.common.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the page for selecting demo type for the Simple Demo.
 */
public class DemoSelectPage extends CommonMenuPage {
    public static final String PAGE_KEY = "demoSelectPage";

    /**
     * Constructor for the demo select page.
     *
     * @param palette Color palette to use.
     */
    public DemoSelectPage(@NotNull Palette palette) {
        super(palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{add(new Center());}};
    }
}