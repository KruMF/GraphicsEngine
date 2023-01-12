package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.MultiPageWindow;
import graphicsEngine.pages.AbstractPage;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page1;
import graphicsEngineDemo.d3_twoPageDemo.pages.Page2;
import graphicsEngineDemo.d3_twoPageDemo.parts.ButtonListener;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Window extends MultiPageWindow {
    private ButtonListener buttonListener;

    //TODO: add javadoc
    public Window(@NotNull WindowManager windowManager) {
        super(windowManager, config(), null, null);
        setActivePage(Page1.getStaticPageKey());
    }

    /**
     * Hardcoded configuration of a new Window object.
     *
     * @return Window configuration.
     */
    private static @NotNull WindowConfig config() {
        String title = "Two-page demo";
        int[]
                size = new int[]{600, 400},
                location = new int[]{50, 50};
        WindowConfig config = new WindowConfig(title, size, location);
        config.closeOperation = EXIT_ON_CLOSE;
        return config;
    }

    /**
     * Adds known listeners to this page.
     * Override this to add custom listeners.
     *
     * @param list List of listeners to add.
     *
     * @return Remaining unknown listeners.
     */
    @Override
    public @NotNull List<ActionListener> addListeners(@Nullable List<ActionListener> list) {
        buttonListener = new ButtonListener(this);
        return super.addListeners(list);
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
        return new ArrayList<>() {{
            add(new Page1(buttonListener, new Color(200, 120, 0)));
            add(new Page2(buttonListener, new Color(200,80,100)));
        }};
    }
}