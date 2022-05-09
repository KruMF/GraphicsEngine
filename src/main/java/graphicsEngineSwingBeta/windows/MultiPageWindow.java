package graphicsEngineSwingBeta.windows;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

import static graphicsEngineSwingBeta.Utilities.printLine;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class MultiPageWindow extends AbstractWindow {
    private Map<String, AbstractPage> pages;

    @SuppressWarnings("unused")
    public MultiPageWindow(
            @NotNull WindowConfig config,
            @NotNull List<AbstractPage> pages) {
        this(config, pages, null);
    }

    @SuppressWarnings("unused")
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

    public final void setActivePage(@NotNull String key) {
        if (!key.equals(EMPTY_KEY) && pages.containsKey(key)) {
            super.setActivePage(key);
            resetParts();
        } else {
            printLine("Page not found");
        }
    }

    @Override
    public final void addParts() {
        add(pages.get(activePage));
    }
}