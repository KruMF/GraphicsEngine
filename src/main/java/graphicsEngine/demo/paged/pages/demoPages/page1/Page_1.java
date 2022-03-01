package graphicsEngine.demo.paged.pages.demoPages.page1;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.common.CommonDemoPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the demo page 1.
 */
public class Page_1 extends CommonDemoPage {
    public static final String PAGE_KEY = "demoPage1";

    //TODO: add javadoc
    public Page_1(@NotNull Palette palette) {
        super(null, palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}