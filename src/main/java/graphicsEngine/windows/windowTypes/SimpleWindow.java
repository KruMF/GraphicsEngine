package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import org.jetbrains.annotations.NotNull;

//only contents
public abstract class SimpleWindow extends AbstractWindow {
    public SimpleWindow(@NotNull WindowConfig config) {
        super(config);
    }
}