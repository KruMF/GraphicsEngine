package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import org.jetbrains.annotations.NotNull;

//contents and overlays
abstract class AbstractLayeredWindow extends AbstractWindow {
    AbstractLayeredWindow(@NotNull WindowConfig config) {
        super(config);
    }
}