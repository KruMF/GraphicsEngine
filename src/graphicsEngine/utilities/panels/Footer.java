package graphicsEngine.utilities.panels;

import java.awt.*;

public class Footer extends Panel {
    public Footer(
            Color _backgroundColor, Color _borderColor,
            int height) {
        super(
                _backgroundColor, _borderColor,
                true, false, false, false,
                new int[]{0, height},
                null);
    }

    public void draw(Graphics g, int[] pageSize) {
        super.draw(
                g,
                new int[]{0, pageSize[1] - size[1]},
                new int[]{pageSize[0], size[1]});
    }
}