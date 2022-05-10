package rotorCalculator.graphics.panels;

import graphicsEngine.PanelColors;
import graphicsEngine.parts.SimplePanel;

import javax.swing.*;
import java.awt.*;

import com.google.inject.internal.Nullable;

public class LeftPanel extends SimplePanel {
    public LeftPanel(@Nullable PanelColors panelColors) {
        super(panelColors, false);
        setPreferredSize(new Dimension(
                Column1.WIDTH + Column2.WIDTH,
                Integer.MAX_VALUE));
        addParts();
    }

    private void addParts() {
        PanelColors panelColors = new PanelColors();

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Column1(panelColors));
        add(new Column2(panelColors));
    }

    private static abstract class AbstractColumn extends SimplePanel {
        protected AbstractColumn(int width, @Nullable PanelColors panelColors, boolean border) {
            super(panelColors, border);
            setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        }
    }

    private static class Column1 extends AbstractColumn {
        protected static final int WIDTH = 200;
        protected Column1(@Nullable PanelColors panelColors) {
            super(WIDTH, panelColors, true);
        }
    }

    private static class Column2 extends AbstractColumn {
        protected static final int WIDTH = 200;
        protected Column2(@Nullable PanelColors panelColors) {
            super(WIDTH, panelColors, true);
        }
    }
}