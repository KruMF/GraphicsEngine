package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonRow;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

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

}