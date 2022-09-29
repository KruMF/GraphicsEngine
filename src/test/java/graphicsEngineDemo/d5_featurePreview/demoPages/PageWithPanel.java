package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.presets.panels.VerticalPanel;
import graphicsEngineDemo.d5_featurePreview.common.CommonColors;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: add javadoc
public abstract class PageWithPanel extends CommonDemoPage {
    private SimpleColorScheme sidePanelColors;

    //TODO: add javadoc
    public PageWithPanel(@Nullable List<ActionListener> actionListenerList,
                         @Nullable SimpleColorScheme colors) {
        super(actionListenerList, colors);
    }

    //TODO: add javadoc
    @Override
    public void repaint() {
        printLine("panelPage being repainted");
        Component[] components = getComponents();
        for (Component component : components) {
            component.repaint();
        }
        super.repaint();
    }

    //TODO: add javadoc
    @Override
    public void setBodyParameters() {
        sidePanelColors = CommonColors.SIDE_PANEL_COLORS;
    }

    //TODO: add javadoc
    @Override
    public @Nullable Component getPageBody() {
        return new DynamicPanel(
                null,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null) {
            {
                setLayout(new BorderLayout(0, 0));
                VerticalPanel leftSidePanel = getLeftSidePanel(sidePanelColors);
                if (leftSidePanel != null) {
                    add(leftSidePanel, BorderLayout.WEST);
                }
                JPanel centralPanel = getPageCenter();
                if (centralPanel != null) {
                    add(centralPanel, BorderLayout.CENTER);
                }
            }
        };
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