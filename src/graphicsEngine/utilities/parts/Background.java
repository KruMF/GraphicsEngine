package graphicsEngine.utilities.parts;

import java.awt.*;

public class Background extends SimplePart {
    public Background(Color _backgroundColor) {
        super(
                _backgroundColor, true,
                null,
                false, false, false, false,
                new int[]{0, 0});
    }
}