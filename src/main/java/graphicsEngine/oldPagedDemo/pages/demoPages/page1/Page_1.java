package graphicsEngine.oldPagedDemo.pages.demoPages.page1;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.parts.simpleParts.SimplePart;

import graphicsEngine.oldPagedDemo.pages.demoPages.common.CommonDemoPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the oldPagedDemo page 1.
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