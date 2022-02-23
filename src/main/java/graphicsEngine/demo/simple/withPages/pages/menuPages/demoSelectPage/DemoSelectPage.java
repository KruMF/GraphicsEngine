package graphicsEngine.demo.simple.withPages.pages.menuPages.demoSelectPage;

import graphicsEngine.demo.simple.withPages.pages.menuPages.CommonMenuPage;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * This is the page for selecting demo type for the Simple Demo.
 */
public class DemoSelectPage extends CommonMenuPage {

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