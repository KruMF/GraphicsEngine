package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.buttons.Button;
import graphicsEngine.utilities.buttons.ButtonRow;
import graphicsEngine.utilities.panels.AbstractHeader;

import java.awt.*;
import java.util.ArrayList;

public class Header extends AbstractHeader {

    private static final int  height = 100;
    private static final int  buttonSeparation = 10, buttonWidth = 100;

    public Header() {
        super(
                height,
                Color.gray, Color.darkGray,
                prepareButtons(height, buttonSeparation, buttonWidth));
    }

    private static ButtonRow prepareButtons(int panelHeight, int buttonSeparation, int buttonWidth){
        int[] buttonSize = new int[]{
                buttonWidth,
                panelHeight - buttonSeparation * 2};
        return new ButtonRow(
                new int[]{0,0},
                buttonSeparation, buttonSize[1], buttonSize[0],
                new ArrayList<>(){{
                    add(new Button_1(buttonSize));
                    add(new Button_2(buttonSize));
                }}
        );
    }

    static class Button_1 extends graphicsEngine.utilities.buttons.Button {
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