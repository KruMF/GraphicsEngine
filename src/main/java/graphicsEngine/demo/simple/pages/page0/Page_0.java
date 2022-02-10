package graphicsEngine.demo.simple.pages.page0;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.demo.simple.common.CommonPage;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is page 0
 */
public class Page_0 extends CommonPage {

    //TODO: add javadoc
    public Page_0(@NotNull Palette palette) {
        super(palette, prepareCenter(), AlignmentType.TOP);
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{add(new Center());}};
    }
}