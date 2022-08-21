package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractFooter;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
class CommonFooter extends AbstractFooter {
    private static final int HEIGHT = 100;

    protected CommonFooter(@Nullable PanelColors panelColors) {
        super(panelColors, HEIGHT);
    }

    @Override
    public void addParts() {}
}