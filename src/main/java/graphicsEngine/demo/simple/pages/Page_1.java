package graphicsEngine.demo.simple.pages;

import graphicsEngine.data.colors.Palette;
import graphicsEngine.demo.simple.common.CommonPage;
import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;

// TODO: needs rework
/**
 * This is page 1
 */
public class Page_1 extends CommonPage {

    public Page_1(Palette palette) {
        super(palette, prepareCenter(), AlignmentType.TOP);
    }

    private static ArrayList<? extends SimplePart> prepareCenter() {
        return new ArrayList<>() {{
            add(new Center());
        }};
    }

    static class Center extends SimplePart {
        Center() {
            super();
        }

        @Override
        public void draw(@NotNull Graphics g, int[] location, int[] size) {
            super.draw(g, location, size);

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
}