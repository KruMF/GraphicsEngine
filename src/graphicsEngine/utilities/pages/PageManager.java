package graphicsEngine.utilities.pages;

import java.util.ArrayList;
import java.awt.Graphics;

public class PageManager {
    public ArrayList<Page> pages;
    public int activePage;

    public PageManager(ArrayList<Page> _pages){
        pages = _pages;
        activePage = 0;
    }

    public void draw(Graphics g){
        pages.get(activePage).draw(g);
    }
}