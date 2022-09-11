package graphicsEngineDemo.d5_featurePreview.common.header;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.AbstractHeader;

import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class CommonHeader extends AbstractHeader {
    private static final int HEIGHT = 50;

    //TODO: add javadoc
    public CommonHeader(@Nullable PanelColors panelColors,
                        @Nullable HeaderButtonListener buttonListener) {
        super(panelColors, HEIGHT);
        addButtons(buttonListener);
    }

    //TODO: add javadoc
    @Override
    public void addParts() {}

    private void addButtons(@Nullable HeaderButtonListener buttonListener) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new HeaderButtonListener.Button_Start(buttonListener));
        add(new HeaderButtonListener.Button_Settings(buttonListener));
        add(new HeaderButtonListener.Button_DemoSelect(buttonListener));
    }
}