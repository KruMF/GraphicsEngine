package graphicsEngineDemo.d5_featurePreview.demoPages.page4;

import java.awt.*;

import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;

class Center extends DynamicPanel {
    protected Center(Page4 page) {
        super(
                null,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null);
        //add(new DynamicLabel(page, Color.red), BorderLayout.PAGE_START);
        add(new SimpleLabel("Demo 4", Color.white));
        //Add parts here
    }

    /*
    //TODO: use parts.labels.DynamicLabel
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
    }*/
}