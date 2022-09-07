package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import org.jetbrains.annotations.NotNull;

//has only contents, nothing much to add
//TODO: finish this and add javadocs
public abstract class SimpleWindow extends AbstractWindow {
    public SimpleWindow(@NotNull WindowConfig config) {
        super(config);
    }
}