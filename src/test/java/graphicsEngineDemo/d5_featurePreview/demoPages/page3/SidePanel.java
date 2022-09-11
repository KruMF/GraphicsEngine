package graphicsEngineDemo.d5_featurePreview.demoPages.page3;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.demoPages.PageWithPanel;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
class SidePanel extends PageWithPanel.CommonSidePanel {
    private static final int WIDTH = 200;

    //TODO: add javadoc
    protected SidePanel(@Nullable PanelColors panelColors) {
        super(panelColors, WIDTH);
        add(new SimpleLabel("Demo page 3 - Side panel", getPanelColors().text));
        add(new SimpleLabel("Demo page 3 - Side panel", getPanelColors().text));
        //Add parts here
    }
}
