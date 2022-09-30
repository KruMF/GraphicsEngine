package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;

import java.awt.Graphics;

import org.jetbrains.annotations.Nullable;

class SubPanel1 extends AbstractSubPanel {
    protected static final int HEIGHT = 30;
    private static final int[] TEXT_LOCATION = new int[] {5, 20};
    private static final String TEXT = "TextPanel 1";

    protected SubPanel1(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(
                new int[] {LeftPanel.WIDTH, HEIGHT},
                colors,
                borderProperties);
    }

    @Override
    protected final void drawText(Graphics g) {
        g.setColor(getPanelColors().getSecondaryColor());
        g.drawString(TEXT, TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}