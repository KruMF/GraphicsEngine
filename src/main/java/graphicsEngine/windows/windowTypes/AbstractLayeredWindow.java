package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import java.util.Objects;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//contents and overlays
abstract class AbstractLayeredWindow extends AbstractWindow {
    private JPanel overlay = new JPanel();
    AbstractLayeredWindow(@NotNull WindowConfig config, @Nullable JPanel overlay) {
        super(config);
        setOverlay(overlay);
        hideOverlay();
    }

    void setOverlay(@Nullable JPanel overlay) {
        setGlassPane(Objects.requireNonNullElse(overlay, new JPanel()));
        showOverlay();
    }

    void showOverlay() {
        getGlassPane().setVisible(true);
    }
    void hideOverlay() {
        getGlassPane().setVisible(false);
    }
    void toggleOverlay() {
        getGlassPane().setVisible(!getGlassPane().isVisible());
    }
}