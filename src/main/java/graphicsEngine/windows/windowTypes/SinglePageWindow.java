package graphicsEngine.windows.windowTypes;

import java.util.Map;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    protected Map<String, AbstractPage> pages;

    public SinglePageWindow(@NotNull WindowConfig config) {
        super(config);
    }


}