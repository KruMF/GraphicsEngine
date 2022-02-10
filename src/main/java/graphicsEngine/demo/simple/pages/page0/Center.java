package graphicsEngine.demo.simple.pages.page0;

import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class Center extends SimplePart {

    //TODO: add javadoc
    protected Center() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        int[] margin = new int[] {20, 20};
        int[] drawSize = new int[] {
                size[0] - 2 * margin[0],
                size[1] - 2 * margin[1]};

        //draw stuff here

        //red rectangle offset from sides
        g.setColor(Color.red);
        g.drawRect(
                location[0] + margin[0],
                location[1] + margin[1],
                drawSize[0],
                drawSize[1]);
    }
}