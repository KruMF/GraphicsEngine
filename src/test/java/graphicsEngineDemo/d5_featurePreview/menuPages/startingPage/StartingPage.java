package graphicsEngineDemo.d5_featurePreview.menuPages.startingPage;

import graphicsEngine.panels.PanelColors;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d5_featurePreview.common.AbstractCommonPage;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class StartingPage extends AbstractCommonPage {
    //TODO: add javadoc
    public StartingPage() {
        this(null);
    }

    //TODO: add javadoc
    public StartingPage(@Nullable ActionListener actionListener) {
        super(actionListener);
    }

    //TODO: add javadoc
    @Override
    public final String getPageKey() {
        return "start";
    }

    //TODO: add javadoc
    @Override
    public void addParts() {
        //
    }

    //TODO: add javadoc
    public static String getStaticPageKey() {
        return (new StartingPage()).getPageKey();
    }
}