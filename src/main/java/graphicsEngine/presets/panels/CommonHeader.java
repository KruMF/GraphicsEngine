package graphicsEngine.presets.panels;

import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.Panel;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import java.util.ArrayList;

// TODO: add javadoc
public class CommonHeader extends Panel {
    public static final int MINIMUM_HEIGHT = 20;

    // TODO: add javadoc
    public CommonHeader(int height, PanelColors panelColors, ArrayList<DrawablePart> parts) {
        super(new int[] {0, getHeight(height)}, new boolean[] {false, true},
                panelColors.light, panelColors.dark,
                parts, AlignmentType.LEFT);
    }

    public static int getHeight(int preferred) {
        return Math.max(MINIMUM_HEIGHT, preferred);
    }
}