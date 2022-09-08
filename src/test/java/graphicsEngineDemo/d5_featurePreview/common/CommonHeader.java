package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractHeader;

import javax.swing.BoxLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class CommonHeader extends AbstractHeader {
    private static final int HEIGHT = 50;

    //TODO: add javadoc
    public CommonHeader(@Nullable PanelColors panelColors,
                        @Nullable ActionListener actionListener) {
        super(panelColors, HEIGHT);
        addButtons(actionListener);
    }

    //TODO: add javadoc
    @Override
    public void addParts() {}

    private void addButtons(@Nullable ActionListener actionListener) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        //add(new Buttons.Button1(actionListener));
        //add(new Buttons.Button2(actionListener));
    }
}