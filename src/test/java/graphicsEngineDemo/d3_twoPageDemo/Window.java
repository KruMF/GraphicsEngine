package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.windowTypes.MultiPageWindow;

import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page2;
import graphicsEngineDemo.d3_twoPageDemo.parts.Button1;
import graphicsEngineDemo.d3_twoPageDemo.parts.Button2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;

//TODO: finish this and add javadocs
class Window extends MultiPageWindow implements ActionListener {
    //TODO: add javadocs
    public Window() {
        super(config(), null);
        try {
            setActivePage(getFirstKey());
        } catch (NullPointerException ignored) {}
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static WindowConfig config() {
        String title = "Two page demo";
        int[]
                size = new int[]{600, 400},
                location = new int[]{50, 50};
        WindowConfig config = new WindowConfig(title, size, location);
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
    }

    //TODO: add javadocs
    @Override
    public final @NotNull String getWindowKey() {
        return "window";
    }

    /**
     * Adds pages to this window.
     */
    @Override
    public @NotNull List<AbstractPage> getInitialPages() {
        ActionListener actionListener = this;
        return new ArrayList<>() {{
            add(new Page1(null, actionListener));
            add(new Page2(null, actionListener));
        }};
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName;
        switch (e.getActionCommand()) {
            case Button1.ACTION_COMMAND -> {
                buttonName = Button1.ACTION_COMMAND;
                //TODO: switch to page 1 here
            }
            case Button2.ACTION_COMMAND -> {
                buttonName = Button2.ACTION_COMMAND;
                //TODO: switch to page 2 here
            }
            default -> buttonName = "A button";
        }
        printLine(buttonName + " has been pressed");
    }
}