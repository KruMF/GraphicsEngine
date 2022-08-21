package graphicsEngineDemo.twoPageDemo.parts;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractHeader;

import javax.swing.BoxLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadocs
public class CommonHeader extends AbstractHeader {
    private static final int HEIGHT = 50;

    public CommonHeader(@Nullable PanelColors panelColors,
                           @Nullable ActionListener actionListener) {
        super(panelColors, HEIGHT);
        addButtons(actionListener);
    }

    @Override
    public void addParts() {}

    private void addButtons(@Nullable ActionListener actionListener) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Button1(actionListener));
        add(new Button2(actionListener));
    }
}