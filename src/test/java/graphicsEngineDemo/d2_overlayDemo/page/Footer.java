package graphicsEngineDemo.d2_overlayDemo.page;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.panels.AbstractFooter;

//TODO: add javadocs
class Footer extends AbstractFooter {
    private static final int HEIGHT = 100;

    //TODO: add javadoc
    protected Footer(@Nullable SimpleColorScheme panelColors,
                     @Nullable BorderProperties borderProperties) {
        super(panelColors, HEIGHT, borderProperties);
    }
}