package graphicsEngineDemo.d5_featurePreview.demoPages.page3;

import graphicsEngine.Utilities;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;

import java.awt.Color;
import java.awt.BorderLayout;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.Nullable;

class Center extends DynamicPanel {
    protected Center(Page3 page) {
        super(null,
                new PanelColors(Utilities.EMPTY_COLOR, null, null),
                false);
        add(new DynamicLabel(page, Color.red), BorderLayout.PAGE_START);
        //add(new SimpleLabel("Demo 3", Color.white));
        //Add parts here
    }

    private static class DynamicLabel extends SimpleLabel {
        private final Page3 page;

        protected DynamicLabel(Page3 page,
                               @Nullable Color textColor) {
            this(page, textColor, null);
        }

        protected DynamicLabel(Page3 page,
                               @Nullable Color textColor,
                               @Nullable Color background) {
            super(null, textColor, background);
            this.page = page;
        }

        //calls either paint or update
        @Override
        public void repaint() {
            printLine("label repaint happens");
            setText(getNewText());
            super.repaint();
        }

        private String getNewText() {
            String valueString = "page=null";
            if (page != null) {
                valueString = "data=null";
                if (page.data != null) {
                    valueString = String.valueOf(page.data.getValue());
                }
            }
            return "A dynamically changeable string. X: " + valueString;
        }
    }
}