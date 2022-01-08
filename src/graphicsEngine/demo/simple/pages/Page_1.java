package graphicsEngine.demo.simple.pages;

import graphicsEngine.demo.simple.common.CommonPage;
import graphicsEngine.utilities.GraphicsHelper;

import java.awt.*;

/**
 * This is page 1
 */
public class Page_1 extends CommonPage {

    public Page_1() {
        super(null, null);
    }

    public void drawCenter(Graphics g, int[] location, int[] size) {
        g.setColor(Color.green);
        GraphicsHelper.drawStrings_VA(
                g,0,
                new String[] {"This is the second page"},
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here
    }
}