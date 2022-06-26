package graphicsEngineOld.presets.panels;

import graphicsEngineOld.engine.data.colors.PanelColors;
import graphicsEngineOld.parts.containers.AlignmentType;
import graphicsEngineOld.parts.simpleParts.DrawablePart;
import graphicsEngineOld.parts.containers.Panel;

import java.util.ArrayList;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class SidePanel extends Panel {
    /**
     * Creates a simple panel.
     *
     * @param width      Width of the panel.
     * @param panelColors panel colors TODO: fix this
     * @param parts ArrayList of containable parts. (Aligned to top)
     */
    public SidePanel(int width, @NotNull PanelColors panelColors,
                     @Nullable ArrayList<DrawablePart> parts) {
        super(new int[] {width, 0}, new boolean[] {true, false},
                panelColors.light, panelColors.dark,
                parts, AlignmentType.TOP);
    }
}