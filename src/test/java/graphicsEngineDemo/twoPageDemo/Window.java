package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import graphicsEngineDemo.twoPageDemo.pages.Page1;
import graphicsEngineDemo.twoPageDemo.parts.Button1;
import graphicsEngineDemo.twoPageDemo.parts.Button2;
import org.jetbrains.annotations.NotNull;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: finish this and add javadocs
class Window extends AbstractWindow implements ActionListener {

    public Window() {
        super(config());
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

    @Override
    public @NotNull String getWindowKey() {
        return "window";
    }

    /**
     * Adds parts to this window.
     */
    @Override
    public void addParts() {
        add(new Page1(null, this));
        //TODO: add pages here; maybe use MultiPageWindow instead of AbstractWindow
        //add(new Page2(null, this));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName;
        switch (e.getActionCommand()) {
            case Button1.ACTION_COMMAND -> {
                buttonName = Button1.ACTION_COMMAND;
            }
            case Button2.ACTION_COMMAND -> {
                buttonName = Button2.ACTION_COMMAND;
            }
            default -> buttonName = "A button";
        }
        printLine(buttonName + " has been pressed");
    }
}