package graphicsEngineSandbox.graphics.controlWindow;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.StaticPanel;
import graphicsEngine.parts.SimpleLabel;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.Box;

import org.jetbrains.annotations.Nullable;

// TODO: add javadocs
public class Footer extends StaticPanel {
    private static final int
            HEIGHT = 25,
            TEXT_OFFSET_X = 10;

    public Footer(@Nullable SimpleColorScheme colors,
                  @Nullable BorderProperties borderProperties) {
        super(new Dimension(Integer.MAX_VALUE, HEIGHT), colors, borderProperties);
    }

    @Override
    public void addParts() {
        super.addParts();
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //a separator for separating label from the leftmost edge of the panel
        add(Box.createRigidArea(new Dimension(TEXT_OFFSET_X,0)));

        //a label
        add(new SimpleLabel("This is a footer", getPanelColors().getSecondaryColor()));
    }
}