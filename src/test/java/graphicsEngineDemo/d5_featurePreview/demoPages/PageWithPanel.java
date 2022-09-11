package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.VerticalPanel;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class PageWithPanel extends CommonDemoPage {
    private final PanelColors sidePanelColors;

    //TODO: add javadoc
    public PageWithPanel(@Nullable List<ActionListener> actionListenerList,
                         @Nullable PanelColors headerAndFooterColors,
                         @Nullable PanelColors panelColors) {
        super(actionListenerList, headerAndFooterColors);
        sidePanelColors = panelColors;
    }

    //TODO: add javadoc
    @Override
    public @Nullable Component getPageBody() {
        return new JPanel() {{
            setBackground(Utilities.EMPTY_COLOR);
            setLayout(new BorderLayout(0, 0));
            VerticalPanel leftSidePanel = getLeftSidePanel(sidePanelColors);
            if (leftSidePanel != null) {
                add(leftSidePanel, BorderLayout.WEST);
            }
            JPanel centralPanel = getPageCenter();
            if (centralPanel != null) {
                add(centralPanel, BorderLayout.CENTER);
            }
        }};
    }

    //TODO: add javadoc
    public abstract @Nullable VerticalPanel getLeftSidePanel(@Nullable PanelColors panelColors);

    //TODO: add javadoc
    public abstract @Nullable JPanel getPageCenter();

    //TODO: add javadoc
    public static class CommonSidePanel extends VerticalPanel {

        //TODO: add javadoc
        public CommonSidePanel(@Nullable PanelColors panelColors, int width) {
            super(panelColors, width);
        }

        /**
         * TODO: finish this javadoc
         */
        @Override
        public void addParts() {}
    }
}