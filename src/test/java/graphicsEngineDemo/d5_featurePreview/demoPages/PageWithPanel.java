package graphicsEngineDemo.d5_featurePreview.demoPages;

import java.util.List;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.panels.VerticalPanel;

import graphicsEngineDemo.d5_featurePreview.common.CommonColors;

//TODO: add javadoc
public abstract class PageWithPanel extends CommonDemoPage {
    private SimpleColorScheme sidePanelColors;

    //TODO: add javadoc
    public PageWithPanel(@Nullable List<ActionListener> actionListenerList) {
        super(actionListenerList);
        sidePanelColors = CommonColors.SIDE_PANEL_COLORS;
    }

    //
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BorderLayout(0, 0));
            @Nullable VerticalPanel leftSidePanel = getLeftSidePanel(sidePanelColors);
            if (leftSidePanel != null) {
                add(leftSidePanel, BorderLayout.WEST);
            }
            @Nullable JPanel centralPanel = getPageCenter();
            if (centralPanel != null) {
                add(centralPanel, BorderLayout.CENTER);
            }
        }};
    }

    //TODO: add javadoc
    public abstract @Nullable VerticalPanel getLeftSidePanel(@Nullable SimpleColorScheme panelColors);

    //TODO: add javadoc
    public abstract @Nullable JPanel getPageCenter();

    //TODO: add javadoc
    public static class CommonSidePanel extends VerticalPanel {

        //TODO: add javadoc
        public CommonSidePanel(@Nullable SimpleColorScheme panelColors,
                               int width,
                               @Nullable BorderProperties borderProperties) {
            super(panelColors, width, borderProperties);
        }
    }
}