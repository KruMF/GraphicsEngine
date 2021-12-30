package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.Button;
import graphicsEngine.utilities.parts.SimplePart;

import java.awt.*;
import java.util.ArrayList;

public abstract class Panel extends SimplePart {

    public ButtonRow buttons;

    public Panel(
            Color _backgroundColor, Color _borderColor,
            boolean _borderN, boolean _borderE, boolean _borderS, boolean _borderW,
            int[] _size,
            ButtonRow _buttons) {
        super(
                _backgroundColor, true,
                _borderColor,
                _borderN, _borderE, _borderS, _borderW,
                _size);

        buttons = _buttons;
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size){
        super.draw(g, _location, _size);

        if(buttons != null) buttons.draw(g, location);

        //draw text
    }

    private void drawButtons(Graphics g, int[] panelLocation){
        buttons.draw(g, panelLocation);
    }

    public void buttonInteractionCheck(){
        buttons.interactionCheck();
    }

    public void buttonActionCheck(){
        buttons.actionCheck();
    }

    /*
    static class LeftSide extends Panel {
        public LeftSide(Color backgroundColor) {
            super(backgroundColor);
        }
    }

    static class RightSide extends Panel {
        public RightSide(Color backgroundColor) {
            super(backgroundColor);
        }
    }
    */

    //static class Center extends Panel {}

    static class ButtonRow {
        int[] location; //relative to panel

        ArrayList<Button> buttons;
        int separation;
        int buttonHeight;
        int buttonWidth;

        ButtonRow(int[] _location, int _separation, int _buttonHeight, int _buttonWidth, ArrayList<Button> _buttons){
            location = _location;

            separation = _separation;
            buttonHeight = _buttonHeight;
            buttonWidth = _buttonWidth;

            buttons = _buttons;
        }

        public void draw(Graphics g, int[] panelLocation){
            if(buttons != null){
                int offsetX = separation;
                int offsetY = separation;

                for (Button button : buttons) {
                    button.draw(
                            g,
                            new int[]{
                                    panelLocation[0] + location[0] + offsetX,
                                    panelLocation[1] + location[1] + offsetY});
                    offsetX += (separation + button.size[0]);
                }
            }
        }

        public void interactionCheck(){
            if(buttons != null){
                for (Button button : buttons) {
                    button.interactionCheck();
                }
            }
        }

        public void actionCheck(){
            if(buttons != null){
                for (Button button : buttons) {
                    button.actionCheck();
                }
            }
        }
    }
}