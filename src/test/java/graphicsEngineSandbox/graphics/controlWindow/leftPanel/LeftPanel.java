package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.PanelColors;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.Objects;

import com.google.inject.internal.Nullable;

//TODO: add javadocs
public class LeftPanel extends JPanel {
    static final int WIDTH = 150;

    private PanelColors colors;

    public LeftPanel(PanelColors panelColors, boolean border) {
        setColors(panelColors);
        setBackground(colors.background);
        setPreferredSize(new Dimension(WIDTH, Integer.MAX_VALUE));
        setBorderState(border);
        addMembers();
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

    private void addMembers() {
        setLayout(new BorderLayout(0, 0));
        add(new JPanel() {
            {
                setOpaque(false);
                setPreferredSize(new Dimension(
                        LeftPanel.WIDTH,
                        getPreferredHeight()));
                setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
                //setAlignmentX(Component.LEFT_ALIGNMENT);
                add(new SubPanel1(colors, false));
                add(new SubPanel1(colors, false));
                add(new SubPanel2(colors, true));
                add(new TextLabel(colors.border));
            }
        }, BorderLayout.NORTH);

    }

    private static int getPreferredHeight() {
        return SubPanel1.HEIGHT * 2
                + SubPanel2.HEIGHT
                + TextLabel.HEIGHT;
    }
}