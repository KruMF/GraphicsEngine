package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonRow;

import java.awt.*;

public abstract class AbstractHeader extends Panel{
    public AbstractHeader(
            int height,
            Color _backgroundColor, Color _borderColor,
            ButtonRow _buttons) {
        super(
                new int[]{0, height},
                _backgroundColor, _borderColor,
                _buttons);
    }

    public void draw(Graphics g, int width) {
        super.draw(
                g,
                new int[]{0, 0},
                new int[]{width, size[1]});
    }
}