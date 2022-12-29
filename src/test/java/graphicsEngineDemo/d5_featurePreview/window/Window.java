package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.pages.AbstractPage;
import graphicsEngineDemo.d5_featurePreview.common.header.HeaderButtonListener;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectButtonListener;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;
import graphicsEngineDemo.d5_featurePreview.demoPages.page3.Page3;
import graphicsEngineDemo.d5_featurePreview.demoPages.page4.Page4;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;

import static graphicsEngineDemo.d5_featurePreview.common.CommonColors.HEADER_AND_FOOTER_COLORS;
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
        return new ArrayList<>() {{
            add(new StartingPage(getHeaderListener(), HEADER_AND_FOOTER_COLORS));
            add(new SettingsPage(getHeaderListener(), HEADER_AND_FOOTER_COLORS));
            add(new DemoSelectPage(getDemoSelectListeners(), HEADER_AND_FOOTER_COLORS));
            add(new Page1(getHeaderListener(), HEADER_AND_FOOTER_COLORS));
            add(new Page2(getHeaderListener(), HEADER_AND_FOOTER_COLORS));
            add(new Page3(getDemoPage3Listeners(), HEADER_AND_FOOTER_COLORS));
            add(new Page4(getDemoPage4Listeners(), HEADER_AND_FOOTER_COLORS));
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

    private @NotNull List<ActionListener> getDemoPage3Listeners() {
        List<ActionListener> listeners = getHeaderListener();
        //TODO: add custom listener here
        return listeners;
    }

    private @NotNull List<ActionListener> getDemoPage4Listeners() {
        List<ActionListener> listeners = getHeaderListener();
        //TODO: add custom listener here
        return listeners;
    }
}