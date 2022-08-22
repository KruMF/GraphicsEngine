package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;

//contents and overlays
abstract class AbstractLayeredWindow extends AbstractWindow {
    private JPanel overlay = new JPanel();
    AbstractLayeredWindow(@NotNull WindowConfig config, @NotNull JPanel overlay) {
        super(config);
        setGlassPane(overlay);
        hideOverlay();
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