package graphicsEngineOld.oldPagedDemo.pages.menuPages.demoSelectPage;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.simpleParts.SimplePart;

import graphicsEngineOld.oldPagedDemo.pages.menuPages.common.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the page for selecting oldPagedDemo type for the paged oldPagedDemo.
 */
public class DemoSelectPage extends CommonMenuPage {
    public static final String PAGE_KEY = "demoSelectPage";

    /**
     * Constructor for the oldPagedDemo select page.
     *
     * @param palette Color palette to use.
     */
    public DemoSelectPage(@NotNull Palette palette) {
        super(new KeyboardActions(), palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}