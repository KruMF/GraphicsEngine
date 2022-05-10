package graphicsEngineOld.oldPagedDemo.pages.demoPages.page1;

import graphicsEngineOld.utilities.TextAligner;
import graphicsEngineOld.parts.simpleParts.SimplePart;

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
        TextAligner.drawStringCentered(g, "This is the oldPagedDemo page 1",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here
    }
}