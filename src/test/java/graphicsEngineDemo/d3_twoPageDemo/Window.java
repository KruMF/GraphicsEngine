package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.windowTypes.MultiPageWindow;

import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page2;
import graphicsEngineDemo.d3_twoPageDemo.parts.Buttons;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;

//TODO: add javadocs
class Window extends MultiPageWindow implements ActionListener {
    //TODO: add javadoc
    public Window() {
        super(config(), null);
        setActivePage(Page1.getStaticPageKey());
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

    //TODO: add javadoc
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
            add(new Page1(actionListener, new Color(200, 120, 0)));
            add(new Page2(actionListener, new Color(200,80,100)));
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
            case Buttons.Button1.ACTION_COMMAND -> setActivePage(Page1.getStaticPageKey());
            case Buttons.Button2.ACTION_COMMAND -> setActivePage(Page2.getStaticPageKey());
            default -> printLine("A button has been pressed but no action set up");
        }
    }
}