package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.windowTypes.SinglePageWindow;

import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The window to display.
 */
class Window extends SinglePageWindow {
    private static final String WINDOW_TITLE = "Overlay demo";

    private boolean overlayColorState;
    private ButtonListener headerButtonListener;

    //TODO: add javadoc
    Window(@NotNull WindowManager windowManager) {
        super(windowManager, new WindowConfig(), null, null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_TITLE);

        overlayColorState = false;
        setOverlay(new Overlay(headerButtonListener));
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
        headerButtonListener = new ButtonListener(this);
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
        return new Page(null, headerButtonListener);
    }

    //TODO: add javadoc
    void toggleOverlayColor() {
        overlayColorState = !overlayColorState;
        if (overlayColorState) {
            setOverlayColor(OverlayColors.GREEN);
        } else {
            setOverlayColor(OverlayColors.RED);
        }
    }

    private void setOverlayColor(@Nullable Color color) {
        try {
            getOverlay().setColor(color);
        } catch (ClassCastException ignored) {
            //glassPane does not contain a SimpleOverlay object
        }
    }
}