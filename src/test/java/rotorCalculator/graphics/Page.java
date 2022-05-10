package rotorCalculator.graphics;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.parts.SimplePanel;
import graphicsEngine.PanelColors;

import javax.swing.*;
import java.awt.*;

import com.google.inject.internal.Nullable;

public class Page extends AbstractPage {
    Page() {
        super();
        addParts();
    }

    @Override
    public String getPageKey() {
        return "page";
    }

    private void addParts() {
        PanelColors panelColors = new PanelColors();

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Column1(panelColors));
        add(new Column2(panelColors));

        add(new Center(centerColors()));
        //setLayout(new BorderLayout());
        //add(new Footer(panelColors, false), BorderLayout.SOUTH);
        //add(new LeftPanel(panelColors, false), BorderLayout.WEST);
        //add(new ControlWindow.CentralPanel(), BorderLayout.CENTER);
    }

    private static PanelColors centerColors() {
        Color
                background = new Color(50, 80, 200),
                text = new Color(150, 120, 20),
                border = new Color(150, 0, 0);
        return new PanelColors(background, text, border);
    }

    private static abstract class AbstractColumn extends SimplePanel {
        protected AbstractColumn(int width, @Nullable PanelColors panelColors, boolean border) {
            super(panelColors, border);
            setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        }
    }

    private static class Column1 extends AbstractColumn {
        private static final int WIDTH = 100;
        protected Column1(@Nullable PanelColors panelColors) {
            super(WIDTH, panelColors, true);
        }
    }

    private static class Column2 extends AbstractColumn {
        private static final int WIDTH = 100;
        protected Column2(@Nullable PanelColors panelColors) {
            super(WIDTH, panelColors, true);
        }
    }

    private static class Center extends SimplePanel {
        protected Center(@Nullable PanelColors panelColors) {
            super(panelColors, false);
        }
    }
}