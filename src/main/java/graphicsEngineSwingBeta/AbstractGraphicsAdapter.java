package graphicsEngineSwingBeta;

//for allowing not to use graphics manager directly
public class AbstractGraphicsAdapter {
    public GraphicsManager graphics;

    public AbstractGraphicsAdapter() {
        graphics = new GraphicsManager();
    }

    public final void end() {
        graphics.end();
    }
}