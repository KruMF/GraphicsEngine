package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.presets.SimpleOverlay;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//contents and overlays
//TODO: finish this and add javadocs
abstract class AbstractLayeredWindow extends AbstractWindow {
    private static final SimpleOverlay DEFAULT_OVERLAY = new SimpleOverlay(null);

    private SimpleOverlay overlay;

    AbstractLayeredWindow(@NotNull WindowConfig config, @Nullable SimpleOverlay overlay) {
        super(config);
        setOverlay(overlay);
        hideOverlay();
    }

    void setOverlay(@Nullable SimpleOverlay overlay) {
        setGlassPane(Objects.requireNonNullElse(overlay, DEFAULT_OVERLAY));
    }

    public void showOverlay() {
        getGlassPane().setVisible(true);
    }

    public void hideOverlay() {
        getGlassPane().setVisible(false);
    }

    public void toggleOverlay() {
        getGlassPane().setVisible(!getGlassPane().isVisible());
    }
}