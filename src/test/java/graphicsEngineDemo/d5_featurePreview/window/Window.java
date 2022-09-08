package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngine.windows.AbstractPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static graphicsEngine.Utilities.getSampleIcon;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class Window extends WindowUtilities {
    //TODO: add javadoc
    public Window() {
        super();
        setActivePage(StartingPage.getStaticPageKey());
        setIcon(getSampleIcon());
    }

    //TODO: add javadoc
    @Override
    public @NotNull List<AbstractPage> getInitialPages() {
        ActionListener actionListener = this;
        return new ArrayList<>() {{
            add(new StartingPage(actionListener));
            add(new SettingsPage(actionListener));
            add(new DemoSelectPage(actionListener));
            add(new Page1(actionListener));
            add(new Page2(actionListener));
        }};
    }

    //TODO: add javadoc
    @Override
    public final boolean headerButtonActionCheck(ActionEvent e) {
        return ButtonActions.headerButtonActions(e, this);
    }

    //TODO: add javadoc
    @Override
    public final boolean demoSelectButtonActionCheck(ActionEvent e) {
        return ButtonActions.demoSelectButtonActions(e, this);
    }
}