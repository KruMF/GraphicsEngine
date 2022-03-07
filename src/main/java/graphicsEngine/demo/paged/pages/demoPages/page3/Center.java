package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.utilities.GraphicsHelper;
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

        g.setColor(Color.green);
        GraphicsHelper.drawStringCentered(g, "This is the demo page 3",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here
    }
}