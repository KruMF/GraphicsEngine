package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.StaticPanel;

import java.awt.*;
import javax.swing.*;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class LeftPanel extends StaticPanel {
    static final int WIDTH = 150;

    public LeftPanel(@Nullable SimpleColorScheme colors,
                     @Nullable BorderProperties borderProperties) {
        super(new Dimension(WIDTH, Integer.MAX_VALUE), colors, borderProperties);
    }

    @Override
    public void addParts() {
        super.addParts();
        setLayout(new BorderLayout(0, 0));
        add(
                new JPanel() {
                    {
                        setOpaque(false);
                        setPreferredSize(new Dimension(LeftPanel.WIDTH, getPreferredHeight()));
                        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
                        //setAlignmentX(Component.LEFT_ALIGNMENT);
                        SimpleColorScheme colors = new SimpleColorScheme();
                        add(new SubPanel1(colors, null));
                        add(new SubPanel1(colors, null));
                        add(new SubPanel2(colors, new BorderProperties(null, true)));
                        add(new TextLabel(new BorderProperties(null, true)));
                    }
                },
                BorderLayout.NORTH);
    }

    private static int getPreferredHeight() {
        return SubPanel1.HEIGHT * 2
                + SubPanel2.HEIGHT
                + TextLabel.HEIGHT;
    }
}