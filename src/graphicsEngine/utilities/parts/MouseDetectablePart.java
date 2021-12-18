package graphicsEngine.utilities.parts;

import graphicsEngine.GraphicsManager;

import java.awt.*;

public abstract class MouseDetectablePart extends SimplePart {

    public boolean hovered;
    public boolean clicked;
    public boolean activated;

    public MouseDetectablePart(
            Color _backgroundColor,
            Color _borderColor, boolean border,
            int[] _size) {
        super(_backgroundColor, true,
                _borderColor,
                border, border, border, border,
                _size);
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

    public void interactionCheck(){
        mouseLocationCheck();
        boolean click = GraphicsManager.input.inputData.mouseClick;
        if (click) mouseClickCheck();
        else mouseReleaseCheck();
    }

    private boolean checkXY(){
        int[] mouse = GraphicsManager.input.inputData.mouse;
        return ((mouse[0] > location[0]) &&
                (mouse[1] > location[1]) &&
                (mouse[0] < location[0] + size[0]) &&
                (mouse[1] < location[1] + size[1]));
    }

    private void mouseLocationCheck(){
        hovered = checkXY();
    }

    private void mouseClickCheck(){
        if (hovered && checkXY()) clicked = true;
    }

    private void mouseReleaseCheck(){
        if (clicked && checkXY()) activated = true;

        clicked = false;
        hovered = false;
    }
}