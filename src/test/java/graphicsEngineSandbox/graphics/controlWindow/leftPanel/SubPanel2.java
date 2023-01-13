package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngineSandbox.data.Data;

import java.awt.Graphics;

import org.jetbrains.annotations.Nullable;

class SubPanel2 extends AbstractSubPanel {
    protected static final int HEIGHT = 60;
    private static final int[] TEXT_LOCATION = new int[] {5, 20};

    protected SubPanel2(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(
                new int[] {LeftPanel.WIDTH, HEIGHT},
                colors,
                borderProperties);
    }

    @Override
    protected final void drawText(Graphics g) {
        g.setColor(getPanelColors().getSecondaryColor());
        g.drawString("X: " + Data.getX(), TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}