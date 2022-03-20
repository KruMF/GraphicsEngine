package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Output;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class Center extends SimplePart {
    private static final int[] TEXT_LOCATION = new int[] {300, 50};

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

        GraphicsHelper.drawStrings_VA(
                g, 0, Output.outputStringArray(), new int[] {
                        TEXT_LOCATION[0] + this.location[0],
                        TEXT_LOCATION[1] + this.location[1]
                });

        //draw other stuff here
    }
}