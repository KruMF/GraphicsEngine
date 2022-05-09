package swingBetaDemo.graphics.controlWindow.leftPanel;

import graphicsEngineSwingBeta.parts.SimpleLabel;

import javax.swing.border.LineBorder;
import java.awt.*;

class TextLabel extends SimpleLabel {
    protected static final int HEIGHT = 80;
    private static final Color TEXT_COLOR = Color.blue;

    protected TextLabel(Color borderColor) {
        super("A label object", TEXT_COLOR);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, HEIGHT));

        //TODO: remove this when tests are completed
        setBorder(new LineBorder(borderColor));
    }

    protected final void setTextColor(Color textColor) {
        setForeground(textColor);
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = Integer.MAX_VALUE;
        return size;
    }
}