package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.StaticPanel;
import graphicsEngine.parts.labels.SimpleLabel;
import graphicsEngine.panels.VerticalPanel;

import java.awt.*;
import java.util.List;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page2 extends PageWithPanel {
    private static final @NotNull Color BACKGROUND_COLOR = new Color(50, 150, 50);

    private Page2() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page2(@Nullable List<ActionListener> actionListenerList,
                 @Nullable SimpleColorScheme colors) {
        super(actionListenerList);
        setBackground(BACKGROUND_COLOR);
        initializePanels(
                colors,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page2";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page2()).getPageKey();
    }

    /**
     * TODO: finish this javadoc
     *
     * @param colors
     * @return
     */
    @Override
    public final @NotNull VerticalPanel getLeftSidePanel(@Nullable SimpleColorScheme colors) {
        return new SidePanel(colors, null);
    }

    /**
     * TODO: finish this javadoc
     *
     * @return
     */
    @Override
    public @Nullable JPanel getPageCenter() {
        return new StaticPanel(
                null,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, Color.white),
                null) {
            {
                //setLayout(new BorderLayout(0, 0));
                add(new SimpleLabel("Center", getPanelColors().getSecondaryColor()), BorderLayout.NORTH);
                //Add parts here
            }
        };
    }

    //TODO: add javadoc
    private static class SidePanel extends CommonSidePanel {
        private static final int WIDTH = 200;

        //TODO: add javadoc
        public SidePanel(@Nullable SimpleColorScheme panelColors,
                         @Nullable BorderProperties borderProperties) {
            super(panelColors, WIDTH, borderProperties);
            add(new SimpleLabel("Demo page 2 - Side panel", getPanelColors().getSecondaryColor()));
            //Add parts here
        }
    }
}