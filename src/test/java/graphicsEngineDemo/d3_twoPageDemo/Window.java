package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.windowTypes.MultiPageWindow;

import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page2;
import graphicsEngineDemo.d3_twoPageDemo.parts.Buttons;

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
        setActivePage(new Page1(null, null).getPageKey());
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
        switch (e.getActionCommand()) {
            case Buttons.Button1.ACTION_COMMAND -> {
                setActivePage((new Page1(null, null)).getPageKey());
            }
            case Buttons.Button2.ACTION_COMMAND -> {
                setActivePage((new Page2(null, null)).getPageKey());
            }
            default -> printLine("A button has been pressed but no action set up");
        }
    }
}