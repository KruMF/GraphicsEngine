package graphicsEngineDemo.d5_featurePreview.common;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.panels.AbstractFooter;

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