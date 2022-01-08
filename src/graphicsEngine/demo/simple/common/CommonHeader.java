package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.buttons.Button;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.Panel;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;
import java.util.ArrayList;

public class CommonHeader extends Panel {
    public static final int HEIGHT = 100;

    public CommonHeader() {
        super(new int[] {0, HEIGHT}, new boolean[] {false, true},
                CommonPage.PANEL_BACKGROUND_COLOR, CommonPage.PANEL_BORDER_COLOR,
                prepareParts(), AlignmentType.RIGHT);
    }

    private static ArrayList<DrawablePart> prepareParts(){
        int logoWidth = 200, buttonWidth = 100;
        int[] logoSize = new int[] {logoWidth, HEIGHT};
        int[] buttonSize = new int[] {buttonWidth, HEIGHT};
        return new ArrayList<>() {{
            add(new Logo(logoSize, new boolean[] {true, false}));
            add(new Button_1(buttonSize));
            add(new Button_2(buttonSize));
        }};
    }

    static class Logo extends SimplePart {
        private static final double PROPORTIONS = 0.8;
        private static final Color
                BACKGROUND_COLOR = Color.red,
                CIRCLE_COLOR = Color.white;

        public Logo(int[] size, boolean[] fixedSize) {
            super(size, fixedSize);
        }

        @Override
        public void draw(Graphics g, int[] location, int[] size){
            super.draw(g, location, size);
            drawLogo(g);
        }

        private void drawLogo(Graphics g){
            g.setColor(BACKGROUND_COLOR);
            g.fillRect(this.location[0], this.location[1], this.size[0], this.size[1]);

            g.setColor(CIRCLE_COLOR);

            // calculates diameter
            double size = Math.min(this.size[0], this.size[1]) * PROPORTIONS;
            // calculates final position of circle
            int[] location = new int[] {
                    (int) (this.location[0] + (double) this.size[0] / 2 - size / 2),
                    (int) (this.location[1] + (double) this.size[1] / 2 - size / 2)
            };

            g.fillOval(location[0], location[1], (int) size, (int) size);
        }
    }

    static class Button_1 extends graphicsEngine.utilities.buttons.Button {
        public Button_1(int[] size) {
            super(size, new boolean[] {true, false},
                    "Button 1",
                    new int[] {0, 0});
        }

        @Override
        public void action() {
            System.out.println("Placeholder for Button 1 action.");
        }
    }

    static class Button_2 extends Button {
        public Button_2(int[] size) {
            super(size, new boolean[] {true, false},
                    "Button 2",
                    new int[] {0, 0});
        }

        @Override
        public void action() {
            System.out.println("Placeholder for Button 2 action.");
        }
    }
}