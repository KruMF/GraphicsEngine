package graphicsEngine.presets.panels;

import graphicsEngine.panels.StaticPanel;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class HorizontalPanel extends StaticPanel {
    //TODO: add javadoc
    public HorizontalPanel(@Nullable SimpleColorScheme colors,
                           int height,
                           @Nullable BorderProperties borderProperties) {
        super(
                new Dimension(Integer.MAX_VALUE, height),
                colors,
                borderProperties);
    }
}