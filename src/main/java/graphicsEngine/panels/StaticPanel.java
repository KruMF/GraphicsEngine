package graphicsEngine.panels;

import org.jetbrains.annotations.Nullable;

import java.awt.*;

//TODO: add javadoc
public class StaticPanel extends SimplePanel {
    //TODO: add javadoc
    public StaticPanel(@Nullable Dimension sizeLimits,
                       @Nullable PanelColors panelColors,
                       boolean drawBorder) {
        super(sizeLimits, panelColors, drawBorder);
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