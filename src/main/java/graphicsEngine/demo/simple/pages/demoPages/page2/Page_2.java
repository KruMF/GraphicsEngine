package graphicsEngine.demo.simple.pages.demoPages.page2;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.demo.simple.common.CommonPage;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is page 2 for the Simple Demo.
 */
public class Page_2 extends CommonPage {

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