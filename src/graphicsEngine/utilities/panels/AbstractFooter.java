package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonRow;

import java.awt.*;

public abstract class AbstractFooter extends Panel {
    public AbstractFooter(
            int height,
            Color _backgroundColor, Color _borderColor,
            ButtonRow _buttons) {
        super(
                new int[] {0, height},
                _backgroundColor, _borderColor,
                _buttons);
    }

    public void draw(Graphics g, int[] pageSize) {
        super.draw(
                g,
                new int[] {0, pageSize[1] - size[1]},
                new int[] {pageSize[0], size[1]});
    }
}