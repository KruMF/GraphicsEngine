package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngine.presets.SimpleJButton;
import graphicsEngineDemo.d5_featurePreview.window.Window;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;
import graphicsEngineDemo.d5_featurePreview.demoPages.page3.Page3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class DemoSelectButtonListener implements ActionListener {
    private final Window window;

    //TODO: add javadocs
    public DemoSelectButtonListener(@NotNull Window window) {
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
            case Button_Page1.ACTION_COMMAND ->
                    window.setActivePage(Page1.getStaticPageKey());
            case Button_Page2.ACTION_COMMAND ->
                    window.setActivePage(Page2.getStaticPageKey());
            case Button_Page3.ACTION_COMMAND ->
                    window.setActivePage(Page3.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }

    //TODO: add javadocs
    public static class Button_Page1 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo1";

        protected Button_Page1(@Nullable ActionListener actionListener) {
            super("Page 1", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Page2 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo2";

        protected Button_Page2(@Nullable ActionListener actionListener) {
            super("Page 2", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Page3 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo3";

        protected Button_Page3(@Nullable ActionListener actionListener) {
            super("Page 3", ACTION_COMMAND, actionListener);
        }
    }
}