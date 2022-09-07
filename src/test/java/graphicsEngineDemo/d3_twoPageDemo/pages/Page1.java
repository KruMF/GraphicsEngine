package graphicsEngineDemo.d3_twoPageDemo.pages;

import graphicsEngine.panels.PanelColors;

import java.awt.*;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
public class Page1 extends AbstractCommonPage {
    public Page1(@Nullable PanelColors panelColors,
                    @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
        setBackground(Color.cyan);
    }

    @Override
    public void addParts() {
        //TODO: add a label here indicating page number
    }

    @Override
    public String getPageKey() {
        return "page1";
    }

    //TODO: add javadoc
    public static String getStaticPageKey() {
        return (new Page1(null, null)).getPageKey();
    }
}