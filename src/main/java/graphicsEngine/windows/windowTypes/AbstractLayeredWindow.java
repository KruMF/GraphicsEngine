package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.presets.SimpleOverlay;

import java.awt.Component;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//contents and overlays
//TODO: finish this and add javadocs
abstract class AbstractLayeredWindow extends AbstractWindow {

    //TODO: add javadoc
    AbstractLayeredWindow(@NotNull WindowConfig config, @Nullable SimpleOverlay overlay) {
        super(config);
        setOverlay(overlay);
        hideOverlay();
    }

    //TODO: add javadoc
    public void setOverlay(@Nullable SimpleOverlay overlay) {
        setGlassPane(Objects.requireNonNullElse(overlay, getDefaultOverlay()));
    }

    private static SimpleOverlay getDefaultOverlay() {
        return new SimpleOverlay(null);
    }

    //TODO: finish this and add javadoc
    public @Nullable SimpleOverlay getOverlay() {
        Component glassPane = getGlassPane();
        if (glassPane instanceof SimpleOverlay) {
            return (SimpleOverlay) glassPane;
        } else {
            return null;
        }
    }

    //TODO: add javadoc
    public void showOverlay() {
        getGlassPane().setVisible(true);
    }

    //TODO: add javadoc
    public void hideOverlay() {
        getGlassPane().setVisible(false);
    }

    //TODO: add javadoc
    public void toggleOverlay() {
        getGlassPane().setVisible(!getGlassPane().isVisible());
    }
}