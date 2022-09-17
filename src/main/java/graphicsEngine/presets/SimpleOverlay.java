package graphicsEngine.presets;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.util.Objects;
import java.awt.Color;
import java.awt.Graphics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class SimpleOverlay extends StaticPanel {
    private static final Color DEFAULT_COLOR = new Color(0, 0, 0, 100);

    //TODO: add javadoc
    public SimpleOverlay(@Nullable Color color) {
        super(null, getNewPanelColors(color), false);
        setOpaque(false);
    }

    private static PanelColors getNewPanelColors(@Nullable Color color) {
        return new PanelColors(getNonNullBackgroundColor(color), null, null);
    }

    private static Color getNonNullBackgroundColor(@Nullable Color color) {
        return Objects.requireNonNullElse(color, DEFAULT_COLOR);
    }

    /**
     * Sets the color of the background;
     *
     * @param color New color.
     */
    public void setColor(@Nullable Color color) {
        setPanelColors(getNewPanelColors(color));
    }

    //TODO: add javadocs
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        fillBackground(g);
    }

    private void fillBackground(@NotNull Graphics g) {
        g.setColor(getPanelColors().background);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}