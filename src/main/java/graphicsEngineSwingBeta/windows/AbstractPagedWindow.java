package graphicsEngineSwingBeta.windows;

import graphicsEngineSwingBeta.parts.AbstractPage;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractPagedWindow extends AbstractWindow {
    private static final String EMPTY_KEY = "";
    private Map<String, AbstractPage> pages;
    private String activePage;

    public AbstractPagedWindow(
            @NotNull WindowConfig config,
            @NotNull List<AbstractPage> pages) {
        this(config, pages, null);
    }

    public AbstractPagedWindow(
            @NotNull WindowConfig config,
            @NotNull List<AbstractPage> pages,
            @Nullable String activePageKey) {
        super(config);
        addPages(pages);
        setActivePage(Objects.requireNonNullElse(activePageKey, getFirstKey()));
    }

    private String getFirstKey() {
        if (pages.size() > 0) {
            return pages.keySet().stream().toList().get(0);
        } else return EMPTY_KEY;
    }

    private void addPages(@NotNull List<AbstractPage> pages) {
        this.pages = new HashMap<>();
        for (AbstractPage page : pages) {
            addPage(page);
        }
    }

    private void addPage(@NotNull AbstractPage page) {
        pages.put(page.getPageKey(), page);
    }

    public final void setActivePage(@NotNull String key) {
        if (pages.containsKey(key)) {
            activePage = key;
            resetParts();
        }
    }

    @Override
    public final void addParts() {
        add(pages.get(activePage));
    }
}