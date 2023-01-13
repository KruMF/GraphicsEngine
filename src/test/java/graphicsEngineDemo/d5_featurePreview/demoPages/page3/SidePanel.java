package graphicsEngineDemo.d5_featurePreview.demoPages.page3;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.parts.labels.SimpleLabel;

import graphicsEngineDemo.d5_featurePreview.demoPages.PageWithPanel;

//TODO: add javadoc
class SidePanel extends PageWithPanel.CommonSidePanel {
    private static final int WIDTH = 200;

    //TODO: add javadoc
    protected SidePanel(@Nullable SimpleColorScheme colors,
                        @Nullable BorderProperties borderProperties) {
        super(colors, WIDTH, borderProperties);
        add(new SimpleLabel("Demo page 3 - Side panel", getPanelColors().getSecondaryColor()));
        add(new SimpleLabel("Some text", getPanelColors().getSecondaryColor()));
        //Add parts here
    }
}