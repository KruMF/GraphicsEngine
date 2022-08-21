package graphicsEngineDemo.twoPageDemo.pages;

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
    public void addParts() {}

    @Override
    public String getPageKey() {
        return "page1";
    }
}