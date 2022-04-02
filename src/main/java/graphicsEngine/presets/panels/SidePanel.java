package graphicsEngine.presets.panels;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.parts.containers.AlignmentType;
import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.containers.Panel;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
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