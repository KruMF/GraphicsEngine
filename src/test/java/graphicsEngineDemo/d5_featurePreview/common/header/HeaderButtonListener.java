package graphicsEngineDemo.d5_featurePreview.common.header;

import graphicsEngine.parts.SimpleJButton;
import graphicsEngineDemo.d5_featurePreview.window.Window;
import graphicsEngineDemo.d5_featurePreview.menuPages.startingPage.StartingPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage.SettingsPage;
import graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage.DemoSelectPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class HeaderButtonListener implements ActionListener {
    private final Window window;

    //TODO: add javadocs
    public HeaderButtonListener(@NotNull Window window) {
        this.window = window;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionCheck(e)) return;
        printLine("A header button has been pressed but no action set up");
    }

    private boolean actionCheck(@NotNull ActionEvent e) {
        switch (e.getActionCommand()) {
            case Button_Start.ACTION_COMMAND ->
                    window.setActivePage(StartingPage.getStaticPageKey());
            case Button_Settings.ACTION_COMMAND ->
                    window.setActivePage(SettingsPage.getStaticPageKey());
            case Button_DemoSelect.ACTION_COMMAND ->
                    window.setActivePage(DemoSelectPage.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }

    //TODO: add javadocs
    public static class Button_Start extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_start";

        protected Button_Start(@Nullable ActionListener actionListener) {
            super("Start", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Settings extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_settings";

        protected Button_Settings(@Nullable ActionListener actionListener) {
            super("Settings", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_DemoSelect extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demoSelect";

        protected Button_DemoSelect(@Nullable ActionListener actionListener) {
            super("Select demo", ACTION_COMMAND, actionListener);
        }
    }
}