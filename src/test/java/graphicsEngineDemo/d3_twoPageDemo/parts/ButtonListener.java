package graphicsEngineDemo.d3_twoPageDemo.parts;

import graphicsEngine.parts.SimpleJButton;
import graphicsEngineDemo.d3_twoPageDemo.Window;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class ButtonListener implements ActionListener {
    private final Window window;

    //TODO: add javadoc
    public ButtonListener(@NotNull Window window) {
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
        printLine("A button has been pressed but no action set up");
    }

    private boolean actionCheck(@NotNull ActionEvent e) {
        switch (e.getActionCommand()) {
            case Button1.ACTION_COMMAND -> window.setActivePage(Page1.getStaticPageKey());
            case Button2.ACTION_COMMAND -> window.setActivePage(Page2.getStaticPageKey());
            default -> {
                return false;
            }
        }
        return true;
    }

    //TODO: add javadoc
    protected static class Button1 extends SimpleJButton {
        //TODO: add javadoc
        protected static final String ACTION_COMMAND = "button1";

        //TODO: add javadoc
        protected Button1(@Nullable ActionListener actionListener) {
            super("Page 1", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadoc
    protected static class Button2 extends SimpleJButton {
        //TODO: add javadoc
        protected static final String ACTION_COMMAND = "button2";

        //TODO: add javadoc
        protected Button2(@Nullable ActionListener actionListener) {
            super("Page 2", ACTION_COMMAND, actionListener);
        }
    }
}