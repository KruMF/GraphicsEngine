package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.SimplePanel;
import graphicsEngine.parts.*;

import java.awt.*;
import javax.swing.*;

import com.google.inject.internal.Nullable;

// TODO: add javadocs
public class Footer extends SimplePanel {
    private static final int
            HEIGHT = 25,
            TEXT_OFFSET_X = 10;

    public Footer(@Nullable PanelColors panelColors, boolean border) {
        super(panelColors, border);
        setPreferredSize(new Dimension(Integer.MAX_VALUE, HEIGHT));
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