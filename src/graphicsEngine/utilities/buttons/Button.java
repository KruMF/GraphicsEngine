package graphicsEngine.utilities.buttons;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.ButtonColors;
import graphicsEngine.utilities.simpleParts.MouseDetectablePart;

import java.awt.Graphics;

public abstract class Button extends MouseDetectablePart {

    String text;

    public Button(
            String _text,
            int[] _size) {
        super(
                GraphicsManager.data.palette.buttonColors.bodyColor,
                GraphicsManager.data.palette.buttonColors.borderColor, true,
                _size);

        text = _text;
    }

    @Override
    public void draw(Graphics g, int[] _location) {
        super.draw(g, _location);
        drawButtonText(g);
    }

    @Override
    public void drawInactive(Graphics g, int[] _location) {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        backgroundColor = colors.bodyColor;
        borderColor = colors.borderColor;

        super.drawInactive(g, _location);
    }

    @Override
    public void drawHovered(Graphics g, int[] _location) {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        backgroundColor = colors.bodyColor;
        borderColor = colors.borderColor_active;

        super.drawHovered(g, _location);
    }

    @Override
    public void drawClicked(Graphics g, int[] _location) {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        backgroundColor = colors.bodyColor_active;
        borderColor = colors.borderColor_active;

        super.drawClicked(g, _location);
    }

    private void drawButtonText(Graphics g){
        g.setColor(GraphicsManager.data.palette.buttonColors.textColor);
        g.drawString(
                text,
                location[0] + size[0] / 2,
                location[1] + size[1] / 2);
    }

    @Override
    public void interactionCheck(){
        super.interactionCheck();
    }

    public void actionCheck(){
        if (activated) action();
        activated = false; //debounce
    }

    public void action(){
        System.out.println("Button action placeholder");
    }
}