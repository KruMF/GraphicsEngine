package graphicsEngineDemo.d5_featurePreview.common.header;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.panels.AbstractHeader;

import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class CommonHeader extends AbstractHeader {
    private static final int HEIGHT = 40;

    //TODO: add javadoc
    public CommonHeader(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties,
                        @Nullable HeaderButtonListener buttonListener) {
        super(colors, HEIGHT, borderProperties);
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