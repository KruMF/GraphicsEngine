package graphicsEngine.windows;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class PagedWindow extends AbstractWindow {

    private String activePage;

    public PagedWindow(@NotNull WindowConfig config) {
        super(config);
        setActivePage(null);
    }

    /**
     * Get the key of the currently active page.
     *
     * @return String of the key.
     */
    public String getActivePage() {
        return activePage;
    }

    //TODO: finish this and add javadoc
    public void setActivePage(@Nullable String key) {
        activePage = Objects.requireNonNullElse(key, EMPTY_KEY);
        resetParts();
    }
}