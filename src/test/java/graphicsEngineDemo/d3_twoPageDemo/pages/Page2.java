package graphicsEngineDemo.d3_twoPageDemo.pages;

import graphicsEngine.panels.PanelColors;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
public class Page2 extends AbstractCommonPage {
    public Page2(@Nullable PanelColors panelColors,
                    @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }

    @Override
    public void addParts() {
        //TODO: add a label here indicating page number
    }

    @Override
    public String getPageKey() {
        return "page2";
    }

    //TODO: add javadoc
    public static String getStaticPageKey() {
        return (new Page2(null, null)).getPageKey();
    }
}