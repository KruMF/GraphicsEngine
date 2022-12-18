package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.panels.BorderInterface;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.parts.labels.SimpleLabel;

import java.awt.Dimension;
import java.awt.Color;

import org.jetbrains.annotations.NotNull;

class TextLabel extends SimpleLabel {
    protected static final int HEIGHT = 80;
    private static final Color TEXT_COLOR = Color.blue;

    protected TextLabel(@NotNull BorderProperties borderProperties) {
        super("A label object", TEXT_COLOR);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, HEIGHT));


        BorderInterface.setComponentBorderState(
                this,
                borderProperties.getBorderColor(),
                borderProperties.getBorderState());
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = Integer.MAX_VALUE;
        return size;
    }
}