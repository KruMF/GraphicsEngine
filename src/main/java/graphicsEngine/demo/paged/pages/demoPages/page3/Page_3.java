package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.parts.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.common.CommonDemoPage;
import graphicsEngine.demo.paged.pages.demoPages.page3.sidePanel.LeftSidePanel;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * This is the demo page 3.
 */
public class Page_3 extends CommonDemoPage {
    public static final String PAGE_KEY = "demoPage3";

    //TODO: add javadoc
    public Page_3(@NotNull Palette palette) {
        super(null, palette, prepareCenter(palette.panelColors));
    }

    private static ArrayList<? extends SimplePart> prepareCenter(PanelColors panelColors) {
        return new ArrayList<>() {{
            add(new LeftSidePanel(panelColors));
            add(new Center());
        }};
    }

}