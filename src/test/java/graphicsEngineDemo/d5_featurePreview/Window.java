package graphicsEngineDemo.d5_featurePreview;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.MultiPageWindow;
import graphicsEngine.windows.AbstractPage;

import graphicsEngineDemo.d5_featurePreview.demoPages.Page1;
import graphicsEngineDemo.d5_featurePreview.demoPages.Page2;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class Window extends MultiPageWindow {
    //TODO: add javadoc
    public Window() {
        super(config(), null);
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static WindowConfig config() {
        String title = "Paged demo";
        int[]
            size = new int[] {500, 500},
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
        return new ArrayList<>() {{
            add(new Page1());
            add(new Page2());
        }};
    }
}