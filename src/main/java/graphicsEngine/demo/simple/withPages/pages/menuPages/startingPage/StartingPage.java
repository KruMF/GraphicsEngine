package graphicsEngine.demo.simple.withPages.pages.menuPages.startingPage;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;
import graphicsEngine.demo.simple.withPages.pages.menuPages.CommonMenuPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the starting page of the Simple Demo.
 */
public class StartingPage extends CommonMenuPage {

    /**
     * Constructor for the starting page.
     *
     * @param palette Color palette to use.
     */
    public StartingPage(@NotNull Palette palette) {
        super(palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{add(new Center());}};
    }
}