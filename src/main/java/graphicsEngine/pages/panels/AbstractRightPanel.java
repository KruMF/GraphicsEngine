package graphicsEngine.pages.panels;

import graphicsEngine.panels.VerticalPanel;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;

//TODO: add javadocs
public abstract class AbstractRightPanel extends VerticalPanel {
    //TODO: add javadoc
    public AbstractRightPanel(@Nullable SimpleColorScheme colors,
                              int width,
                              @Nullable BorderProperties borderProperties) {
        super(colors, width, borderProperties);
    }
}