package graphicsEngine.panels;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;

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