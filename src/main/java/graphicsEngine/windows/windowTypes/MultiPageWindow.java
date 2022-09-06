package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.presets.SimpleOverlay;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.swing.*;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class MultiPageWindow extends AbstractLayeredWindow {
    /*protected Map<String, AbstractPage> pages;
    private String activePage;*/

    public MultiPageWindow(@NotNull WindowConfig config, @Nullable SimpleOverlay overlay) {
        super(config, overlay);
    }

    /*public MultiPageWindow(
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
    }*/

    /*private String getFirstKey() {
        if (pages.size() > 0) {
            return pages.keySet().stream().toList().get(0);
        } else return AbstractWindow.EMPTY_KEY;
    }*/

    /*private void addPages(@NotNull List<AbstractPage> pages) {
        this.pages = new HashMap<>();
        for (AbstractPage page : pages) {
            addPage(page);
        }
    }

    private void addPage(@NotNull AbstractPage page) {
        pages.put(page.getPageKey(), page);
    }*/

    /*@Override
    public final void setActivePage(@Nullable String key) {
        String nonNullKey = Objects.requireNonNullElse(key, AbstractWindow.EMPTY_KEY);
        if (!nonNullKey.equals(AbstractWindow.EMPTY_KEY) && pages.containsKey(nonNullKey)) {
            super.setActivePage(nonNullKey);
        } else {
            printLine("Page not found");
        }
    }*/

    @Override
    public final void addParts() {
        /*if (pages != null && pages.size() > 0) {
            add(pages.get(getActivePage()));
        }*/
    }

    /**
     * Get the key of the currently active page.
     *
     * @return String of the key.
     */
    /*public String getActivePage() {
        return activePage;
    }

    //TODO: finish this and add javadoc
    public void setActivePage(@Nullable String key) {
        activePage = Objects.requireNonNullElse(key, AbstractWindow.EMPTY_KEY);
        resetParts();
    }*/
}