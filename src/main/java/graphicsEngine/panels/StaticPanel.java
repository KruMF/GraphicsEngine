package graphicsEngine.panels;

import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;

//TODO: add javadoc
public class StaticPanel extends SimplePanel {

    //auto-stretching panel
    //TODO: add javadoc
    public StaticPanel(@Nullable SimpleColorScheme colors) {
        this(null, colors, null);
    }

    //custom size and border state
    //TODO: add javadoc
    public StaticPanel(@Nullable Dimension sizeLimits,
                       @Nullable SimpleColorScheme colors,
                       @Nullable BorderProperties borderProperties) {
        super(sizeLimits, colors, borderProperties);
    }

    //doesn't repaint children
    //TODO: add javadoc
    @Override
    public void repaint() {
        super.repaint();
    }

    //TODO: add javadoc
    public void addParts() {}
}