package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.MultiPageWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: add javadoc
abstract class WindowUtilities extends MultiPageWindow implements ActionListener {
    //TODO: add javadoc
    public WindowUtilities() {
        super(config(), null);
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static @NotNull WindowConfig config() {
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

    //TODO: add javadoc
    public abstract boolean headerButtonActionCheck(ActionEvent e);

    //TODO: add javadoc
    public abstract boolean demoSelectButtonActionCheck(ActionEvent e);
}