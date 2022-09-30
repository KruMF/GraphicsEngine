package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.StaticPanel;

import java.awt.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractSubPanel extends StaticPanel {
    protected AbstractSubPanel(int @NotNull [] size,
                               @Nullable SimpleColorScheme colors,
                               @Nullable BorderProperties borderProperties) {
        super(new Dimension(size[0], size[1]), colors, borderProperties);
        setOpaque(false);
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    @Override
    public final void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    protected abstract void drawText(Graphics g);
}