package graphicsEngineDemo.d2_overlayDemo;

import java.util.List;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.windowTypes.SinglePageWindow;
import graphicsEngine.pages.AbstractPage;
import graphicsEngine.presets.SimpleOverlay;

import graphicsEngineDemo.d2_overlayDemo.page.Page;
import graphicsEngineDemo.d2_overlayDemo.overlay.Overlay;
import graphicsEngineDemo.d2_overlayDemo.buttons.ButtonListener;

/**
 * The window to display.
 */
public class Window extends SinglePageWindow {
    private static final String WINDOW_TITLE = "Overlay demo";
    private ButtonListener buttonListener;

    //TODO: add javadoc
    protected Window(@NotNull WindowManager windowManager) {
        super(windowManager, new WindowConfig(), null, null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_TITLE);
        setOverlay(new Overlay(buttonListener));
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

    /**
     * Redundant as there is only one window.
     * TODO: finish this javadoc
     *
     * @return The key of this window.
     */
    @Override
    public final @NotNull String getWindowKey() {
        return "window";
    }

    /**
     * Prepares a page to add to this window.
     *
     * @return An AbstractPage object.
     */
    @Override
    public final @NotNull AbstractPage getPage() {
        return new Page(buttonListener, null);
    }

    //TODO: add javadoc
    public void toggleOverlayColor() {
        try {
            @NotNull SimpleOverlay simpleOverlay = getOverlay(); //throws ClassCastException
            if (simpleOverlay instanceof Overlay) {
                ((Overlay) simpleOverlay).toggleColor();
            }
        } catch (ClassCastException ignored) {
            //glassPane does not contain a SimpleOverlay object
        }
    }
}