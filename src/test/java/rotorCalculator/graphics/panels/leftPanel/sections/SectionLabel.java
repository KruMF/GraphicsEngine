package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.parts.SimpleLabel;

import javax.swing.border.LineBorder;
import java.awt.*;

public class SectionLabel extends SimpleLabel {
    protected static final int HEIGHT = 80;

    protected SectionLabel(Color textColor, Color borderColor) {
        super("A label object", textColor);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        //TODO: remove this when tests are completed
        setBorder(new LineBorder(borderColor));
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = Integer.MAX_VALUE;
        return size;
    }
}