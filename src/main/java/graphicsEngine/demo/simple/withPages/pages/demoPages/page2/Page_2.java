package graphicsEngine.demo.simple.withPages.pages.demoPages.page2;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;
import graphicsEngine.utilities.containers.AlignmentType;

import graphicsEngine.demo.simple.withPages.common.CommonPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is page 2 for the Simple Demo.
 */
public class Page_2 extends CommonPage {
    public static final String PAGE_KEY = "page2";

    //TODO: add javadoc
    public Page_2(@NotNull Palette palette) {
        super(palette, prepareCenter(), AlignmentType.TOP);
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}