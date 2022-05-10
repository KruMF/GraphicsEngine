package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.PanelColors;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.Objects;

import com.google.inject.internal.Nullable;

abstract class AbstractSubPanel extends JPanel {
    public PanelColors colors;

    protected AbstractSubPanel(int[] size, PanelColors panelColors, boolean border) {
        setOpaque(false);
        setPreferredSize(new Dimension(size[0], size[1]));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setColors(panelColors);
        setBorderState(border);
    }

    public final void setColors(@Nullable PanelColors colors) {
        this.colors = Objects.requireNonNullElse(colors, new PanelColors());
    }

    public final void setBorderState(boolean state) {
        if (state) {
            setBorder(new LineBorder(colors.border));
        } else {
            setBorder(null);
        }
    }

    @Override
    public final void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawText(g);
    }

    protected abstract void drawText(Graphics g);
}