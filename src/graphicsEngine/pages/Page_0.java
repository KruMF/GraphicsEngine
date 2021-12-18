package graphicsEngine.pages;

import java.awt.*;

public class Page_0 extends Page {

    //This is page 1
    //Temporarily displaying calendar

    public Page_0() {
        super();
    }

    @Override
    public void drawCenter(Graphics g, int[] location, int[] size) {
        int[] margin = new int[]{20, 20};
        int[] drawSize = new int[]{
                size[0] - 2 * margin[0],
                size[1] - 2 * margin[1]};

        //draw stuff here
        /*TimelineTemp.draw(
                g,
                location,
                size);*/

        g.setColor(Color.red);
        g.drawRect(
                location[0] + margin[0],
                location[1] + margin[1],
                drawSize[0],
                drawSize[1]);
    }
}