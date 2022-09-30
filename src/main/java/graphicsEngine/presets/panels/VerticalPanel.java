package graphicsEngine.presets.panels;

import graphicsEngine.panels.StaticPanel;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class VerticalPanel extends StaticPanel {
    //TODO: add javadoc
    public VerticalPanel(@Nullable SimpleColorScheme colors,
                         int width,
                         @Nullable BorderProperties borderProperties) {
        super(
                new Dimension(width, Integer.MAX_VALUE),
                colors,
                borderProperties);
    }
}