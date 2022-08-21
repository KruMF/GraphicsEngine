package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.panels.PanelColors;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
class Page1 extends AbstractCommonPage {
    protected Page1(@Nullable PanelColors panelColors,
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