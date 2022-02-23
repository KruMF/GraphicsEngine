package graphicsEngine.demo.simple.withPages.pages.menuPages.startingPage;

import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

/**
 * Central section of the main menu page.
 */
class Center extends SimplePart {

    //TODO: add javadoc
    protected Center() {
        super();
    }

    /**
     * Drawing of the center.
     *
     * @param g        Graphics to use.
     * @param location Starting location for drawing.
     * @param size     Maximum drawing size.
     */
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

    //welcome message
    //
}