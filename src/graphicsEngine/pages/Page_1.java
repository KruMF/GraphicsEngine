package graphicsEngine.pages;

import graphicsEngine.GraphicsHelper;

import java.awt.*;

public class Page_1 extends Page {
    public Page_1() {
        super();
    }

    @Override
    public void drawCenter(Graphics g, int[] location, int[] size) {
        GraphicsHelper.drawStrings_VA(
                g,0,
                new String[]{"This is the second page"},
                new int[]{
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});
    }
}