package graphicsEngine.windows;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import static graphicsEngine.Utilities.printLine;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class MultiPageWindow extends PagedWindow {
    private Map<String, AbstractPage> pages;

    public MultiPageWindow(
            @NotNull WindowConfig config,
            @NotNull List<AbstractPage> pages) {
        this(config, pages, null);
    }

    public MultiPageWindow(
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

    @Override
    public final void setActivePage(@Nullable String key) {
        String nonNullKey = Objects.requireNonNullElse(key, EMPTY_KEY);
        if (!nonNullKey.equals(EMPTY_KEY) && pages.containsKey(nonNullKey)) {
            super.setActivePage(nonNullKey);
            resetParts();
        } else {
            printLine("Page not found");
        }
    }

    @Override
    public final void addParts() {
        if (pages != null && pages.size() > 0) {
            add(pages.get(getActivePage()));
        }
    }
}