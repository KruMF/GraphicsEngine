package graphicsEngine.oldPagedDemo.pages.menuPages.settingsPage;

import graphicsEngine.utilities.TextAligner;
import graphicsEngine.parts.simpleParts.SimplePart;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

/**
 * Central section of the settings page.
 *
 * TODO: finish this, add contents
 */
public class Center extends SimplePart {

    /**
     * Constructor for the center.
     */
    protected Center() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void draw(@NotNull Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);

        g.setColor(Color.green);
        TextAligner.drawStringCentered(g, "This is the settings page",
                new int[] {
                        location[0] + size[0] / 2,
                        location[1] + size[1] / 2});

        //draw stuff here
    }
}