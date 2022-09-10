package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.panels.PanelColors;
import graphicsEngineDemo.d5_featurePreview.common.AbstractCommonPage;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class CommonDemoPage extends AbstractCommonPage {
    //TODO: add javadoc
    public CommonDemoPage(@Nullable PanelColors panelColors,
                          @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }
}