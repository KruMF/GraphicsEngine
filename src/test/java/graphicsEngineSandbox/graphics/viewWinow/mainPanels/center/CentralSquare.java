package graphicsEngineSandbox.graphics.viewWinow.mainPanels.center;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.StaticPanel;

import java.awt.*;

import org.jetbrains.annotations.NotNull;

public class CentralSquare extends StaticPanel {
    private static final @NotNull SimpleColorScheme
            COLORS = new SimpleColorScheme(
                    new Color(30, 30, 150),
            new Color(150, 150, 0));

    private static final @NotNull BorderProperties
            BORDER_PROPERTIES = new BorderProperties(
                    new Color(200,180,100),
                    false);

    private static final int @NotNull [] TEXT_LOCATION = new int[] {5, 20};

    public CentralSquare() {
        super(null, COLORS, BORDER_PROPERTIES);
    }

    @Override
    public @NotNull Dimension getPreferredSize() {
        Dimension maxSize = this.getParent().getSize();
        int a = Math.min(maxSize.width, maxSize.height);
        return new Dimension(a, a);
    }

    @Override
    public void setSize(@NotNull Dimension d) {
        int a = Math.max(0, Math.min(d.width, d.height));
        super.setSize(new Dimension(a, a));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        myGraphics(g);
    }

    private void myGraphics(@NotNull Graphics g) {
        @NotNull Color borderColor = BORDER_PROPERTIES.getBorderColor();
        drawCircle(g, borderColor);
        drawDiagonals(g, borderColor);
        @NotNull Color textColor = getPanelColors().getSecondaryColor();
        drawText(g, textColor);
    }

    private void drawText(@NotNull Graphics g, @NotNull Color color) {
        g.setColor(color);
        g.drawString(
                "A square",
                TEXT_LOCATION[0], TEXT_LOCATION[1]);
        g.drawString(
                "This size: " + getWidth() + ", " + getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 30);
        g.drawString(
                "Parent size: " + getParent().getWidth() + ", " + getParent().getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 45);
        g.drawString(
                "Preferred size: " + getPreferredSize().getWidth() + ", " + getPreferredSize().getHeight(),
                TEXT_LOCATION[0], TEXT_LOCATION[1] + 60);
    }

    private void drawDiagonals(@NotNull Graphics g, @NotNull Color color) {
        @NotNull Dimension size = getSize();

        g.setColor(color);
        g.drawLine(0, 0, size.width, size.height);
        g.drawLine(0, size.height, size.width, 0);
    }

    private void drawCircle(@NotNull Graphics g, @NotNull Color color) {
        @NotNull Dimension size = getSize();

        g.setColor(color);
        g.drawOval(0, 0, size.width, size.height);
    }
}