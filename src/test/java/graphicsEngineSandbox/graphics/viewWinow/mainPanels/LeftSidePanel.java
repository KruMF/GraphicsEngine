package graphicsEngineSandbox.graphics.viewWinow.mainPanels;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.StaticPanel;

import java.awt.Dimension;
import java.awt.Graphics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LeftSidePanel extends StaticPanel {
    private static final int @NotNull [] TEXT_LOCATION = new int[] {5, 20};
    private static final @NotNull String TEXT = "Left side panel";

    public LeftSidePanel(int width, @Nullable SimpleColorScheme colors) {
        super(new Dimension(width, Integer.MAX_VALUE), colors, null);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    private void drawText(@NotNull Graphics g) {
        g.setColor(getPanelColors().getSecondaryColor());
        g.drawString(TEXT, TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}