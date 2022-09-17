package graphicsEngine.panels;

import java.awt.Component;
import java.awt.Dimension;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class DynamicPanel extends SimplePanel {
    //TODO: add javadoc
    public DynamicPanel(@Nullable Dimension sizeLimits,
                        @Nullable PanelColors panelColors,
                        boolean drawBorder) {
        super(sizeLimits, panelColors, drawBorder);
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