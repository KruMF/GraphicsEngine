package graphicsEngineOld.presets.panels;

import graphicsEngineOld.engine.data.colors.PanelColors;
import graphicsEngineOld.parts.simpleParts.DrawablePart;
import graphicsEngineOld.parts.containers.AlignmentType;
import graphicsEngineOld.parts.containers.Panel;

import java.util.ArrayList;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public class CommonFooter extends Panel {
    public static final int MINIMUM_HEIGHT = 10;

    // TODO: add javadoc
    public CommonFooter(int height, @NotNull PanelColors panelColors,
                        @Nullable ArrayList<DrawablePart> parts) {
        super(new int[] {0, getHeight(height)}, new boolean[] {false, true},
                panelColors.light, panelColors.dark,
                parts, AlignmentType.LEFT);
    }

    private static int getHeight(int preferred) {
        return Math.max(MINIMUM_HEIGHT, preferred);
    }
}