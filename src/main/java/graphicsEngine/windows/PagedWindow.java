package graphicsEngine.windows;

import org.jetbrains.annotations.NotNull;

public abstract class PagedWindow extends AbstractWindow {
    public PagedWindow(@NotNull WindowConfig config) {
        super(config);
    }
}