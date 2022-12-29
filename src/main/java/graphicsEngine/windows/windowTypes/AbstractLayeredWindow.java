package graphicsEngine.windows.windowTypes;

import java.util.Objects;
import java.util.List;
import java.awt.Component;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.presets.SimpleOverlay;

/**
 * An abstract layered window containing contents and an overlay.
 */
abstract class AbstractLayeredWindow extends AbstractWindow {

    /**
     * Creates a new AbstractWindow with specified configuration and overlay.
     *
     * @param windowManager A WindowManager object
     * @param config        Window configuration.
     * @param overlay       Overlay
     */
    AbstractLayeredWindow(@NotNull WindowManager windowManager,
                          @NotNull WindowConfig config,
                          @Nullable List<ActionListener> actionListenerList,
                          @Nullable SimpleOverlay overlay) {
        super(windowManager, config, actionListenerList);
        setOverlay(overlay);
        hideOverlay();
    }

    /**
     * Sets the overlay.
     *
     * @param overlay A SimpleOverlay object.
     */
    public void setOverlay(@Nullable SimpleOverlay overlay) {
        setGlassPane(Objects.requireNonNullElse(overlay, getDefaultOverlay()));
    }

    private static @NotNull SimpleOverlay getDefaultOverlay() {
        return new SimpleOverlay(null);
    }

    /**
     * Gets the overlay.
     *
     * @return The overlay.
     * @throws ClassCastException if glassPane does not contain a SimpleOverlay object.
     */
    public @NotNull SimpleOverlay getOverlay() throws ClassCastException {
        Component glassPane = getGlassPane();
        if (glassPane instanceof SimpleOverlay) {
            return (SimpleOverlay) glassPane;
        }
        throw new ClassCastException();
    }

    /**
     * Shows the overlay.
     */
    public void showOverlay() {
        getGlassPane().setVisible(true);
    }

    /**
     * Hides the overlay.
     */
    public void hideOverlay() {
        getGlassPane().setVisible(false);
    }

    /**
     * Toggles visibility of the overlay.
     */
    public void toggleOverlay() {
        Component pane = getGlassPane();
        pane.setVisible(!(pane.isVisible()));
    }

    @Override
    public void repaint() {
        try {
            Objects.requireNonNull(getGlassPane()).repaint();
        } catch (NullPointerException ignored) {}
        super.repaint();
    }
}