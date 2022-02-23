package graphicsEngine.utilities.pages;

import graphicsEngine.utilities.input.InputManager;

import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Page manager for drawing and checking interaction of contained pages.
 */
public class PageManager {
    public HashMap<String, Page> pages;
    public String activePage;

    /**
     * Creates a page manager and sets active page to 0.
     *
     * @param pages Map of pages to add. (Null or empty - no pages)
     */
    public PageManager(@Nullable HashMap<String, Page> pages, @Nullable String activePage) {
        this.pages = initialPages(pages);
        setActivePage(initialActivePage(activePage));
    }

    /**
     * Empty constructor for a blank page manager containing no pages.
     */
    public PageManager() {
        this(null, null);
    }

    private HashMap<String, Page> initialPages(@Nullable HashMap<String, Page> pages) {
        return Objects.requireNonNullElse(pages, new HashMap<>());
    }

    private String initialActivePage(@Nullable String activePage) {
        return Objects.requireNonNullElse(activePage, "");
    }

    //todo: add javadoc
    public void setActivePage(@Nullable String activePage) {
        if ((activePage != null) && (pages.containsKey(activePage))) {
            this.activePage = activePage;
        }
    }

    //todo: add javadoc
    public void addPage(@Nullable String key, @Nullable Page page) {
        if (checkAddableKeyValidity(key) && checkAddablePageValidity(page)) {
            pages.put(key, page);
        }
    }

    private boolean checkAddableKeyValidity(@Nullable String key) {
        return !(key == null || pages.containsKey(key));
    }

    private boolean checkAddablePageValidity(@Nullable Page page) {
        return !(page == null);
    }

    /**
     * Draws the active page.
     *
     * @param g Graphics to use.
     */
    public void draw(@NotNull Graphics g) {
        if (checkPageStatus()) {
            pages.get(activePage).draw(g);
        }
    }

    /**
     * Checks activity of the active page.
     *
     * @param input Input to use for checking.
     */
    public void activityCheck(@Nullable InputManager input) {
        if (checkPageStatus()) {
            Page activePage = pages.get(this.activePage);
            activePage.inputCheck.check(input, activePage);
        }
    }

    /**
     * Check if active page is valid.
     *
     * @return True if valid, false if no pages exist or no such page key found.
     */
    private boolean checkPageStatus() {
        return (pages.size() > 0) && (pages.containsKey(activePage));
    }
}