package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngineSwingBeta.PanelColors;
import graphicsEngineSwingBeta.parts.SimpleLabel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.Objects;

import com.google.inject.internal.Nullable;

// TODO: add javadocs
public class Footer extends JPanel {
    private static final int
            HEIGHT = 25,
            TEXT_OFFSET_X = 10;

    private PanelColors colors;

    public Footer(@Nullable PanelColors panelColors, boolean border) {
        setColors(panelColors);
        setBackground(colors.background);
        setPreferredSize(new Dimension(Integer.MAX_VALUE, HEIGHT));
        setBorderState(border);
        addMembers(colors.text);
    }

    public void setColors(@Nullable PanelColors colors) {
        this.colors = Objects.requireNonNullElse(colors, new PanelColors());
    }

    public void setBorderState(boolean state) {
        if (state) {
            setBorder(new LineBorder(colors.border));
        } else {
            setBorder(null);
        }
    }

    private void addMembers(@Nullable Color textColor) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //a separator for separating label from the leftmost edge of the panel
        add(Box.createRigidArea(new Dimension(TEXT_OFFSET_X,0)));

        //a label
        add(new SimpleLabel("This is a footer", textColor));
    }
}