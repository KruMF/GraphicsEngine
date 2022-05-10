package graphicsEngineOld.oldPagedDemo.pages.menuPages.startingPage;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.simpleParts.SimplePart;

import graphicsEngineOld.oldPagedDemo.pages.menuPages.common.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the starting page of the Simple Demo.
 */
public class StartingPage extends CommonMenuPage {
    public static final String PAGE_KEY = "startingPage";

    /**
     * Constructor for the starting page.
     *
     * @param palette Color palette to use.
     */
    public StartingPage(@NotNull Palette palette) {
        super(null, palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}