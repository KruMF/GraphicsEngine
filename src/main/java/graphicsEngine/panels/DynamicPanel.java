package graphicsEngine.panels;

import graphicsEngine.colors.SimpleColorScheme;

import java.awt.Component;
import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class DynamicPanel extends SimplePanel {

    //auto-stretching panel
    //TODO: add javadoc
    public DynamicPanel(@Nullable SimpleColorScheme colors) {
        this(null, colors, null);
    }

    //custom size and border state
    //TODO: add javadoc
    public DynamicPanel(@Nullable Dimension sizeLimits,
                        @Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(sizeLimits, colors, borderProperties);
    }

    //repaints all children
    //TODO: add javadoc
    @Override
    public void repaint() {
        Component[] components = getComponents();
        for (Component component : components) {
            component.repaint();
        }
        super.repaint();
    }

    //TODO: add javadoc
    public void addParts() {}
}