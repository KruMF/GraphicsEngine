package graphicsEngineDemo.d5_featurePreview.demoPages.page3;

import graphicsEngine.Utilities;
import graphicsEngine.parts.SimpleLabel;
import org.jetbrains.annotations.Nullable;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class Center extends JPanel {
    protected Center() {
        setBackground(Utilities.EMPTY_COLOR);
        add(new DynamicLabel(Color.red));
        //add(new SimpleLabel("Demo 3", Color.white));
        //Add parts here
    }

    private static class DynamicLabel extends SimpleLabel {

        protected DynamicLabel(@Nullable Color textColor) {
            super(null, textColor);
        }

        protected DynamicLabel(@Nullable Color textColor,
                            @Nullable Color background) {
            super(null, textColor, background);
        }

        @Override
        public void paintComponent(Graphics g) {
            setText("A dynamically changeable string");
            super.paintComponent(g);
        }
    }
}