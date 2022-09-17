package graphicsEngineDemo.d5_featurePreview.window;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.MultiPageWindow;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: add javadoc
abstract class WindowUtilities extends MultiPageWindow {

    //TODO: add javadoc
    public WindowUtilities(@NotNull WindowManager windowManager) {
        super(windowManager, config(), null, null);
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

    @Override
    public void repaint() {
        printLine("window being repainted");
        try {
            Objects.requireNonNull(getActivePage()).repaint();
        } catch (NullPointerException ignored) {}
        super.repaint();
    }
}