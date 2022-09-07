package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.presets.SimpleOverlay;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class MultiPageWindow extends AbstractLayeredWindow {
    private static final String EMPTY_KEY = "";
    private final Map<String, AbstractPage> pages;
    private String activePage;

    public MultiPageWindow(@NotNull WindowConfig config,
                           @Nullable SimpleOverlay overlay) {
        super(config, overlay);
        this.pages = new HashMap<>();
        activePage = EMPTY_KEY;
        addPages(getInitialPages());
    }

    /*private @NotNull String getFirstKey() throws NullPointerException {
        if (pages == null) {
            throw new NullPointerException();
        }
        if (pages.size() > 0) {
            return Objects.requireNonNullElse(
                    pages.keySet().stream().toList().get(0),
                    EMPTY_KEY);
        }
        return EMPTY_KEY;
    }*/

    private void addPages(@NotNull List<AbstractPage> pages) {
        for (AbstractPage page : pages) {
            addPage(page);
        }
    }

    //TODO: add javadoc
    public void addPage(@NotNull AbstractPage page) {
        pages.put(page.getPageKey(), page);
    }

    //TODO: add javadoc
    public @NotNull abstract List<AbstractPage> getInitialPages();

    /**
     * Get the key of the currently active page.
     *
     * @return String of the key.
     */
    public @NotNull String getActivePageKey() {
        return Objects.requireNonNullElse(activePage, EMPTY_KEY);
    }

    //TODO: add javadoc
    public @Nullable AbstractPage getActivePage() {
        if (pages.containsKey(getActivePageKey())) {
            return pages.get(activePage);
        }
        return null;
    }

    /**
     * Sets a new active page and resets parts.
     *
     * @param key Key of the page.
     */
    public void setActivePage(@Nullable String key) {
        activePage = Objects.requireNonNullElse(key, EMPTY_KEY);
        resetParts();
    }

    /**
     * Adds the active page to the frame.
     */
    @Override
    public final void addParts() {
        AbstractPage activePage = getActivePage();
        if (activePage != null) {
            add(activePage);
        }
    }
}