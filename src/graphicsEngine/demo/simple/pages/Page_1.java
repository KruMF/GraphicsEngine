package graphicsEngine.demo.simple.pages;

import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.GraphicsHelper;

import java.awt.*;

/**
 * This is page 1
 */
public class Page_1 extends Page {

    public Page_1() {
        super();
    }

    //gotta be overriden for central
    @Override
    public void drawCenter(Graphics g, int[] location, int[] size) {
        g.setColor(Color.green);
        GraphicsHelper.drawStrings_VA(
                g,0,
                new String[]{"This is the second page"},
                new int[]{
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here

    }
}