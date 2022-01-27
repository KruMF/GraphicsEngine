package graphicsEngine.demo.simple.pages;

import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.demo.simple.common.HeaderWithButtons;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.CommonFooter;
import graphicsEngine.utilities.GraphicsHelper;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;
import java.util.ArrayList;

// TODO: needs rework
/**
 * This is page 1
 */
public class Page_1 extends HeaderAndFooterPage {

    public Page_1(PanelColors panelColors) {
        super(panelColors,
                new HeaderWithButtons(100, panelColors),
                new CommonFooter(50, panelColors, null),
                prepareCenter(),
                AlignmentType.TOP);
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
        public void draw(Graphics g, int[] location, int[] size) {
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