package graphicsEngine.pages.panels;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.HorizontalPanel;

//TODO: add javadoc
public abstract class AbstractHeader extends HorizontalPanel {
    //TODO: add javadoc
    public AbstractHeader(@Nullable SimpleColorScheme panelColors,
                          int height,
                          @Nullable BorderProperties borderProperties) {
        super(panelColors, height, borderProperties);
    }
}