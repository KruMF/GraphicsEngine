package graphicsEngine.pages;

import java.util.ArrayList;
import java.awt.Graphics;

public class PageManager {
    public ArrayList<Page> pages;
    public int activePage;

    public PageManager(){
        pages = new ArrayList<>(){{
            add(new Page_0());
            add(new Page_1());
        }};
        activePage = 0;
    }

    public void draw(Graphics g){
        pages.get(activePage).draw(g);
    }
}