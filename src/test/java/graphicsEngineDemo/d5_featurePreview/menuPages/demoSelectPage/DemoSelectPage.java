package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngine.panels.PanelColors;
import graphicsEngineDemo.d5_featurePreview.common.AbstractCommonPage;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class DemoSelectPage extends AbstractCommonPage {
    //TODO: add javadoc
    public DemoSelectPage() {
        this(null);
    }

    //TODO: add javadoc
    public DemoSelectPage(@Nullable ActionListener actionListener) {
        super(actionListener);
    }

    //TODO: add javadoc
    @Override
    public final String getPageKey() {
        return "demoSelect";
    }

    //TODO: add javadoc
    @Override
    public void addParts() {
        //
    }

    //TODO: add javadoc
    public static String getStaticPageKey() {
        return (new DemoSelectPage()).getPageKey();
    }
}