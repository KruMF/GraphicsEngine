package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;
import graphicsEngine.parts.*;

import java.awt.*;
import javax.swing.*;

import org.jetbrains.annotations.Nullable;

// TODO: add javadocs
public class Footer extends StaticPanel {
    private static final int
            HEIGHT = 25,
            TEXT_OFFSET_X = 10;

    public Footer(@Nullable PanelColors panelColors, boolean border) {
        super(new Dimension(Integer.MAX_VALUE, HEIGHT), panelColors, border);
        addMembers();
    }

    private void addMembers() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //a separator for separating label from the leftmost edge of the panel
        add(Box.createRigidArea(new Dimension(TEXT_OFFSET_X,0)));

        //a label
        add(new SimpleLabel("This is a footer", getPanelColors().text));
    }
}