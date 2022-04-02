package graphicsEngine.demo.paged.pages.demoPages.page2;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.parts.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.common.CommonDemoPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the demo page 2.
 */
public class Page_2 extends CommonDemoPage {
    public static final String PAGE_KEY = "demoPage2";

    //TODO: add javadoc
    public Page_2(@NotNull Palette palette) {
        super(new KeyboardActions(), palette, prepareCenter());
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}