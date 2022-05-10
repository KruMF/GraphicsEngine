package rotorCalculator.graphics;

import graphicsEngineSwingBeta.AbstractGraphicsAdapter;

public class GraphicsAdapter extends AbstractGraphicsAdapter {
    public GraphicsAdapter() {
        super();
        graphics.newWindow(new Window());
    }
}