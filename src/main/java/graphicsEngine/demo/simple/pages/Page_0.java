package graphicsEngine.demo.simple.pages;

import graphicsEngine.data.colors.Palette;
import graphicsEngine.demo.simple.common.CommonPage;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;

// TODO: needs rework
/**
 * This is page 0
 */
public class Page_0 extends CommonPage {

    public Page_0(Palette palette) {
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
}