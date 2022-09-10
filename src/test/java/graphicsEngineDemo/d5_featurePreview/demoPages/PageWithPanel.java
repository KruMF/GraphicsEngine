package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.panels.VerticalPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class PageWithPanel extends CommonDemoPage {
    private final PanelColors sidePanelColors;

    //TODO: add javadoc
    public PageWithPanel(@Nullable PanelColors headerAndFooterColors,
                         @Nullable PanelColors panelColors,
                         @Nullable ActionListener actionListener) {
        super(headerAndFooterColors, actionListener);
        sidePanelColors = panelColors;
    }

    //TODO: add javadoc
    @Override
    public @Nullable Component getPageBody(@Nullable ActionListener actionListener) {
        return new JPanel() {{
            setBackground(Utilities.EMPTY_COLOR);
            setLayout(new BorderLayout(0, 0));
            VerticalPanel leftSidePanel = getLeftSidePanel(sidePanelColors, actionListener);
            if (leftSidePanel != null) {
                add(leftSidePanel, BorderLayout.WEST);
            }
            JPanel centralPanel = getPageCenter(actionListener);
            if (centralPanel != null) {
                add(centralPanel, BorderLayout.CENTER);
            }
        }};
    }

    //TODO: add javadoc
    public abstract @Nullable VerticalPanel getLeftSidePanel(@Nullable PanelColors panelColors,
                                                             @Nullable ActionListener actionListener);

    //TODO: add javadoc
    public abstract @Nullable JPanel getPageCenter(@Nullable ActionListener actionListener);

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