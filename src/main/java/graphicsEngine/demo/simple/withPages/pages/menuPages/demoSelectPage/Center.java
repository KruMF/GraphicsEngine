package graphicsEngine.demo.simple.withPages.pages.menuPages.demoSelectPage;

import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

//TODO: finish this and add javadoc
public class Center extends SimplePart {

    protected Center() {
        super();
    }

    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        g.setColor(Color.green);
        GraphicsHelper.drawStringCentered(g, "This is the demo selection page",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here
    }
}