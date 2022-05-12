package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;

import rotorCalculator.graphics.panels.leftPanel.sections.Section1;

import javax.swing.*;

import com.google.inject.internal.Nullable;

public class Column1 extends AbstractColumn {
    public static final int WIDTH = 200;

    protected Column1(@Nullable PanelColors panelColors) {
        super(WIDTH, panelColors, true);
    }

    @Override
    public void addParts(JPanel p) {
        p.add(new Section1(getPanelColors()));
        p.add(new Section1(getPanelColors()));
    }
}