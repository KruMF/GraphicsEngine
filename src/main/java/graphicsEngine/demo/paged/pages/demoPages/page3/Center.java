package graphicsEngine.demo.paged.pages.demoPages.page3;

import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Output;

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

        drawRotorInfoTable(g);

        drawPageMessage(g);
        //draw other stuff here
    }

    private void drawPageMessage(@NotNull Graphics g) {
        g.setColor(Color.green);
        GraphicsHelper.drawStringCentered(g, "This is the demo page 3",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});
    }

    private void drawRotorInfoTable(@NotNull Graphics g) {
        g.setColor(Color.orange);
        Output.drawTable(g, location);
    }
}