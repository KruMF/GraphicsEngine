package graphicsEngine.utilities.panels;

import graphicsEngine.utilities.buttons.ButtonContainer;

import java.awt.*;

public class Footer extends Panel implements ButtonContainer {
    public Footer(
            int height,
            Color _backgroundColor, Color _borderColor) {
        super(
                new int[]{0, height},
                _backgroundColor, _borderColor,
                null);
    }

    public void draw(Graphics g, int[] pageSize) {
        super.draw(
                g,
                new int[]{0, pageSize[1] - size[1]},
                new int[]{pageSize[0], size[1]});
    }
}