package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngine.presets.panels.VerticalPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page3 extends PageWithPanel {
    private Page3() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page3(@Nullable List<ActionListener> actionListenerList,
                 @Nullable PanelColors headerAndFooterColors) {
        super(actionListenerList, headerAndFooterColors, null);
        setBackground(new Color(50, 50, 150));
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page3";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page3()).getPageKey();
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
            add(new DynamicLabel(Color.red, null));
            //add(new SimpleLabel("Demo 3", Color.white));
            //Add parts here
        }};
    }

    //TODO: add javadoc
    private static class SidePanel extends CommonSidePanel {
        private static final int WIDTH = 100;

        //TODO: add javadoc
        public SidePanel(@Nullable PanelColors panelColors) {
            super(panelColors, WIDTH);
            add(new SimpleLabel("Side panel", Color.white));
            //Add parts here
        }
    }

    private static class DynamicLabel extends SimpleLabel {

        public DynamicLabel(@Nullable Color textColor) {
            super(null, textColor);
        }

        public DynamicLabel(@Nullable Color textColor,
                            @Nullable Color background) {
            super(null, textColor, background);
        }

        @Override
        public void paintComponent(Graphics g) {
            g.setColor(getForeground());
            g.drawString("mystring", 5, 15);
        }
    }
}