package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.panels.PanelColors;

import javax.swing.border.LineBorder;
import java.awt.*;

import com.google.inject.internal.Nullable;

public class Sub1 extends AbstractSubPanel {
    public static final int HEIGHT = 100;

    public Sub1(@Nullable PanelColors panelColors) {
        super(HEIGHT, panelColors, true);
        setBorder(new LineBorder(Color.cyan));
    }

    @Override
    public void addParts() {
        setLayout(new BorderLayout(0, 0));
        /*add(
                new JPanel() {
                    {
                        //
                    }
                },
                BorderLayout.WEST);
        */
    }
}