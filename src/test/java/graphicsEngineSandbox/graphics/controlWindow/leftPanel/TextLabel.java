package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.Utilities;
import graphicsEngine.parts.SimpleLabel;

import javax.swing.border.LineBorder;
import java.awt.*;

import org.jetbrains.annotations.NotNull;

class TextLabel extends SimpleLabel {
    protected static final int HEIGHT = 80;
    private static final Color TEXT_COLOR = Color.blue;

    protected TextLabel(@NotNull Color borderColor, boolean border) {
        super("A label object", TEXT_COLOR);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, HEIGHT));

        Utilities.BorderInterface.setBorderState(
                this,
                border,
                borderColor);
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = Integer.MAX_VALUE;
        return size;
    }
}