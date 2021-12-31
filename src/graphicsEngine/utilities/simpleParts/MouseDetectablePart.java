package graphicsEngine.utilities.simpleParts;

import graphicsEngine.utilities.input.InputData;

import java.awt.*;

public abstract class MouseDetectablePart extends SimplePart {

    public boolean hovered;
    public boolean clicked;
    public boolean activated;

    public MouseDetectablePart(
            int[] _size,
            Color _backgroundColor, Color _borderColor) {
        super(_size, _backgroundColor, _borderColor);
        prepareActivityBooleans();
    }

    private void prepareActivityBooleans(){
        hovered = false;
        clicked = false;
        activated = false;
    }

    public void draw(Graphics g, int[] _location){
        if (clicked) drawClicked(g, _location);
        else if (hovered) drawHovered(g, _location);
        else drawInactive(g, _location);
    }

    public void drawClicked(Graphics g, int[] _location){
        super.draw(g, _location, size);
    }

    public void drawHovered(Graphics g, int[] _location){
        super.draw(g, _location, size);
    }

    public void drawInactive(Graphics g, int[] _location){
        super.draw(g, _location, size);
    }

    public void interactionCheck(InputData input){
        mouseLocationCheck(input.mouse);
        if (input.mouseClick) mouseClickCheck();
        else mouseReleaseCheck();
    }

    private boolean checkXY(int[] mouse){
        return ((mouse[0] > location[0]) &&
                (mouse[1] > location[1]) &&
                (mouse[0] < location[0] + size[0]) &&
                (mouse[1] < location[1] + size[1]));
    }

    private void mouseLocationCheck(int[] mouse){
        hovered = checkXY(mouse);
    }

    private void mouseClickCheck(){
        if (hovered) clicked = true;
    }

    private void mouseReleaseCheck(){
        if (clicked && hovered) activated = true;
        clicked = false;
    }
}