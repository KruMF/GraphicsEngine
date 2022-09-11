package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.AbstractPage;
import graphicsEngineDemo.d5_featurePreview.common.header.HeaderButtonListener;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectButtonListener;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page3;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;

import static graphicsEngine.Utilities.getSampleIcon;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class Window extends WindowUtilities {
    //TODO: add javadoc
    public Window(@NotNull WindowManager windowManager) {
        super(windowManager);
        setActivePage(StartingPage.getStaticPageKey());
        setIcon(getSampleIcon());
    }

    //TODO: add javadoc
    @Override
    public @NotNull List<AbstractPage> getInitialPages() {
        PanelColors panelColors = new PanelColors();
        return new ArrayList<>() {{
            add(new StartingPage(getHeaderListener(), panelColors));
            add(new SettingsPage(getHeaderListener(), panelColors));
            add(new DemoSelectPage(getDemoSelectListeners(), panelColors));
            add(new Page1(getHeaderListener(), panelColors));
            add(new Page2(getHeaderListener(), panelColors));
            add(new Page3(getHeaderListener(), panelColors));
        }};
    }

    private @NotNull List<ActionListener> getHeaderListener() {
        Window window = this;
        return new ArrayList<>() {{
            add(new HeaderButtonListener(window));
        }};
    }

    private @NotNull List<ActionListener> getDemoSelectListeners() {
        List<ActionListener> listeners = getHeaderListener();
        listeners.add(new DemoSelectButtonListener(this));
        return listeners;
    }
}