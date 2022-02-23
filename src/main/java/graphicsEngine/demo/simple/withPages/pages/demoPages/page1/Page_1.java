package graphicsEngine.demo.simple.withPages.pages.demoPages.page1;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.demo.simple.withPages.common.CommonPage;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is page 1 for the Simple Demo.
 */
public class Page_1 extends CommonPage {

    //TODO: add javadoc
    public Page_1(@NotNull Palette palette) {
        super(palette, prepareCenter(), AlignmentType.TOP);
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }
}