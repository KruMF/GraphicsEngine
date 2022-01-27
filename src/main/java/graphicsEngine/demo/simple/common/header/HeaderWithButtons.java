package graphicsEngine.demo.simple.common.header;

import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.presets.panels.CommonHeader;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.util.ArrayList;

// TODO: add javadoc
public class HeaderWithButtons extends CommonHeader {

    public HeaderWithButtons(int height, PanelColors panelColors) {
        super(height, panelColors, prepareParts(getHeight(height)));
    }

    // TODO: add javadoc
    private static ArrayList<DrawablePart> prepareParts(int height) {
        int logoWidth = 200, buttonWidth = 100;
        int[] logoSize = new int[] {logoWidth, height};
        int[] buttonSize = new int[] {buttonWidth, height};
        return new ArrayList<>() {{
            add(new Logo(logoSize, new boolean[] {true, false}));
            add(new HeaderButton1(buttonSize));
            add(new HeaderButton2(buttonSize));
        }};
    }
}