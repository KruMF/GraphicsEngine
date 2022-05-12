package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;

import rotorCalculator.graphics.panels.leftPanel.sections.Sub1;

import javax.swing.*;

import com.google.inject.internal.Nullable;

class Column1 extends AbstractColumn {
    protected static final int WIDTH = 200;

    protected Column1(@Nullable PanelColors panelColors) {
        super(WIDTH, panelColors, true);
    }

    @Override
    public void addParts() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new Sub1(getPanelColors()));
        add(new Sub1(getPanelColors()));
    }
}