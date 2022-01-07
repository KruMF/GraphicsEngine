package graphicsEngine.utilities.pages;

import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;
import java.awt.Graphics;
import java.util.Objects;

public class PageManager {
    public ArrayList<Page> pages;
    public int activePage;

    public PageManager(ArrayList<Page> pages) {
        this.pages = Objects.requireNonNullElse(pages, new ArrayList<>());
        activePage = 0;
    }

    public void draw(Graphics g) {
        if (checkPageStatus()) {
            pages.get(activePage).draw(g);
        }
    }

    public void activityCheck(InputManager input) {
        if (checkPageStatus()) {
            Page activePage = pages.get(this.activePage);
            activePage.inputCheck.check(input, activePage);
        }
    }

    private boolean checkPageStatus() {
        return (pages.size() > 0) && (activePage < pages.size());
    }
}