package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.Utilities;
import graphicsEngine.parts.SimpleLabel;

import java.awt.*;

public class SectionLabel extends SimpleLabel {
    protected static final int HEIGHT = 50;
    private static final int WIDTH = Integer.MAX_VALUE;

    protected SectionLabel(Color textColor, Color borderColor) {
        super("A label object", textColor);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setAlignmentX(Component.LEFT_ALIGNMENT);

        Utilities.BorderInterface.setBorderState(
                this,
                true,
                borderColor);
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = WIDTH;
        return size;
    }
}