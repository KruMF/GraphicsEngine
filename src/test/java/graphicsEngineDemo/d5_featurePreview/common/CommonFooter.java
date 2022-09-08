package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractFooter;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class CommonFooter extends AbstractFooter {
    private static final int HEIGHT = 50;

    //TODO: add javadoc
    public CommonFooter(@Nullable PanelColors panelColors) {
        super(panelColors, HEIGHT);
    }

    //TODO: add javadoc
    @Override
    public void addParts() {}
}