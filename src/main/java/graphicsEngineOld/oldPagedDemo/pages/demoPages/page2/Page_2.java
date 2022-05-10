package graphicsEngineOld.oldPagedDemo.pages.demoPages.page2;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.simpleParts.SimplePart;

import graphicsEngineOld.oldPagedDemo.pages.demoPages.common.CommonDemoPage;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the oldPagedDemo page 2.
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