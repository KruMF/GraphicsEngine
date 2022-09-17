package graphicsEngineDemo.d3_twoPageDemo.parts;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractFooter;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
public class CommonFooter extends AbstractFooter {
    private static final int HEIGHT = 100;

    public CommonFooter(@Nullable PanelColors panelColors) {
        super(panelColors, HEIGHT);
    }
}