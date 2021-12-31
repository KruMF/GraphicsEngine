package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonContainer;
import graphicsEngine.utilities.buttons.ButtonRow;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

public abstract class Panel extends SimplePart implements ButtonContainer {

    public ButtonRow buttons;

    public Panel(
            int[] _size,
            Color _backgroundColor, Color _borderColor,
            ButtonRow _buttons) {
        super(_size, _backgroundColor, _borderColor);

        buttons = _buttons;
    }

    @Override
    public void draw(Graphics g, int[] _location, int[] _size){
        super.draw(g, _location, _size);

        if(buttons != null) drawButtons(g);

        //draw text etc
    }

    private void drawButtons(Graphics g){
        buttons.draw(g, location);
    }

    @Override
    public void buttonInteractionCheck(InputData input){
        if (buttons != null) buttons.buttonInteractionCheck(input);
    }

    @Override
    public void buttonActionCheck(){
        if (buttons != null) buttons.buttonActionCheck();
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

}