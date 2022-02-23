package graphicsEngine.utilities.pages;

import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.Graphics;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Page manager for drawing and checking interaction of contained pages.
 */
public class PageManager {
    public ArrayList<Page> pages;
    public int activePage;

    /**
     * Creates a page manager and sets active page to 0.
     *
     * @param pages ArrayList of pages to add. (Null - no pages)
     */
    public PageManager(@Nullable ArrayList<Page> pages) {
        this.pages = Objects.requireNonNullElse(pages, new ArrayList<>());
        activePage = 0;
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
     * @return True if valid, false if no pages exist or index out of bounds.
     */
    private boolean checkPageStatus() {
        return (pages.size() > 0) && (activePage < pages.size());
    }
}