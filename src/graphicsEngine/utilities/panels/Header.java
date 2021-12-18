package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.Button;

import java.awt.*;
import java.util.ArrayList;

public class Header extends Panel {
    public Header(
            Color _backgroundColor, Color _borderColor,
            int height,
            int buttonSeparation, int buttonWidth) {
        super(
                _backgroundColor, _borderColor,
                false, false, true, false,
                new int[]{0, height},
                prepareButtons(height, buttonSeparation, buttonWidth)
        );
    }

    private static ButtonRow prepareButtons(int panelHeight, int buttonSeparation, int buttonWidth){
        int[] buttonSize = new int[]{buttonWidth, panelHeight - buttonSeparation * 2};
        return new ButtonRow(
                new int[]{0,0},
                buttonSeparation, buttonSize[1], buttonSize[0],
                new ArrayList<>(){{
                    add(new Button_1(buttonSize));
                    add(new Button_2(buttonSize));
                }}
        );
    }

    public void draw(Graphics g, int width) {
        super.draw(
                g,
                new int[]{0, 0},
                new int[]{width, size[1]});
    }


    static class Button_1 extends Button {
        public Button_1(int[] _size) {
            super("Button 1", _size);
        }

        @Override
        public void action() {
            System.out.println("Placeholder for Button 1 action.");
        }
    }

    static class Button_2 extends Button {
        public Button_2(int[] _size) {
            super("Button 2", _size);
        }

        @Override
        public void action() {
            System.out.println("Placeholder for Button 2 action.");
        }
    }
}