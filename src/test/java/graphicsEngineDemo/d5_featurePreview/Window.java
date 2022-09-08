package graphicsEngineDemo.d5_featurePreview;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.MultiPageWindow;
import graphicsEngine.windows.AbstractPage;
import graphicsEngineDemo.d5_featurePreview.common.CommonHeaderButtons;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectButtons;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;
import static graphicsEngine.Utilities.getSampleIcon;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class Window extends MultiPageWindow implements ActionListener {
    //TODO: add javadoc
    public Window() {
        super(config(), null);
        setActivePage(StartingPage.getStaticPageKey());
        setIcon(getSampleIcon());
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static WindowConfig config() {
        String title = "Feature-preview demo";
        int[]
            size = new int[] {600, 400},
            location = new int[] {50, 50};
        WindowConfig config = new WindowConfig(title, size, location);
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
    }

    //TODO: add javadoc
    @Override
    public @NotNull String getWindowKey() {
        return "window";
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

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (headerButtonActionCheck(e)) return;
        if (demoSelectButtonActionCheck(e)) return;
        printLine("A button has been pressed but no action set up");
    }

    private boolean headerButtonActionCheck(ActionEvent e) {
        switch (e.getActionCommand()) {
            case CommonHeaderButtons.Button_Start.ACTION_COMMAND ->
                    setActivePage(StartingPage.getStaticPageKey());
            case CommonHeaderButtons.Button_Settings.ACTION_COMMAND ->
                    setActivePage(SettingsPage.getStaticPageKey());
            case CommonHeaderButtons.Button_DemoSelect.ACTION_COMMAND ->
                    setActivePage(DemoSelectPage.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }

    private boolean demoSelectButtonActionCheck(ActionEvent e) {
        switch (e.getActionCommand()) {
            case DemoSelectButtons.Button_Page1.ACTION_COMMAND ->
                    setActivePage(Page1.getStaticPageKey());
            case DemoSelectButtons.Button_Page2.ACTION_COMMAND ->
                    setActivePage(Page2.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }
}