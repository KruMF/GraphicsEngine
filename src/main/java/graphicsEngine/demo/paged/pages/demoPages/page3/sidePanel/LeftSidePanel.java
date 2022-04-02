package graphicsEngine.demo.paged.pages.demoPages.page3.sidePanel;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.TextAligner;
import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.simpleParts.SimplePart;
import graphicsEngine.presets.panels.SidePanel;

import java.awt.*;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

/**
 * The left side panel.
 */
public class LeftSidePanel extends SidePanel {
    private static final int DEFAULT_WIDTH = 300;

    /**
     * Creates the left side panel.
     *
     * @param panelColors panel colors TODO: fix this
     */
    public LeftSidePanel(@NotNull PanelColors panelColors) {
        super(DEFAULT_WIDTH, panelColors, prepareParts());
    }

    private static ArrayList<DrawablePart> prepareParts() {
        return new ArrayList<>() {{
            add(new TextBox1());
            //add(new ButtonGrid());
            add(new TextBox2());
        }};
    }

    public static class VerticalTextBox extends SimplePart {
        public static final int[] TEXT_OFFSET = new int[] {10, 5};
        public static final Color TEXT_COLOR = Color.black;

        public String[] data;

        // stretchable
        public VerticalTextBox() {
            super();
        }

        // vertically fixed
        public VerticalTextBox(int height) {
            super(
                    new int[] {0, height},
                    new boolean[] {false, true});
        }

        public void setData(String[] data) {
            this.data = data;
        }

        @Override
        public void draw(@NotNull Graphics g, int[] location, int[] size) {
            super.draw(g, location, size);
            g.setColor(TEXT_COLOR);
            TextAligner.drawStrings_VA(g, 0, data, new int[] {
                    this.location[0] + TEXT_OFFSET[0],
                    this.location[1] + TEXT_OFFSET[1]});
        }
    }

    public static class TextBox1 extends VerticalTextBox {
        public TextBox1() {
            super(200);
            setData(prepareData());
        }

        private static String[] prepareData() {
            return new String[] {
                    "textBox1"
            };
        }
    }

    public static class TextBox2 extends VerticalTextBox {
        public TextBox2() {
            super();
            setData(prepareData());
        }

        private static String[] prepareData() {
            return new String[] {
                    "textBox2"
            };
        }
    }
}