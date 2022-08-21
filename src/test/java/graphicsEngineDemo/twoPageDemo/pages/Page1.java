package graphicsEngineDemo.twoPageDemo.pages;

import graphicsEngine.panels.PanelColors;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
public class Page1 extends AbstractCommonPage {
    public Page1(@Nullable PanelColors panelColors,
                    @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }

    @Override
    public void addParts() {
        //TODO: add a label here indicating page number
    }

    @Override
    public String getPageKey() {
        return "page1";
    }
}