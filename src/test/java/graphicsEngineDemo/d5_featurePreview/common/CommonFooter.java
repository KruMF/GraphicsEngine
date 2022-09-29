package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.presets.panels.AbstractFooter;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class CommonFooter extends AbstractFooter {
    private static final int HEIGHT = 40;

    //TODO: add javadoc
    public CommonFooter(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(colors, HEIGHT, borderProperties);
    }

    //TODO: add javadoc
    @Override
    public void addParts() {}
}