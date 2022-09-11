package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngine.presets.panels.VerticalPanel;

import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page2 extends PageWithPanel {
    private Page2() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page2(@Nullable List<ActionListener> actionListenerList,
                 @Nullable PanelColors headerAndFooterColors) {
        super(actionListenerList, headerAndFooterColors);
        setBackground(new Color(50, 150, 50));
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
     * @param panelColors
     * @return
     */
    @Override
    public final @NotNull VerticalPanel getLeftSidePanel(@Nullable PanelColors panelColors) {
        return new SidePanel(panelColors);
    }

    /**
     * TODO: finish this javadoc
     *
     * @return
     */
    @Override
    public @Nullable JPanel getPageCenter() {
        return new JPanel() {{
            setBackground(Utilities.EMPTY_COLOR);
            add(new SimpleLabel("Center", Color.white));
            //Add parts here
        }};
    }

    //TODO: add javadoc
    private static class SidePanel extends CommonSidePanel {
        private static final int WIDTH = 200;

        //TODO: add javadoc
        public SidePanel(@Nullable PanelColors panelColors) {
            super(panelColors, WIDTH);
            add(new SimpleLabel("Demo page 2 - Side panel", getPanelColors().text));
            //Add parts here
        }
    }
}