package graphicsEngine;

/**
 * A graphics adapter class.
 * Intended for allowing not to use the GraphicsManager directly.
 * Reference this to use the GraphicsEngine.
 * TODO: check redundancy
 */
public class AbstractGraphicsAdapter {
    //TODO: seems redundant, originally meant for security
    public GraphicsManager graphics;

    //TODO: seems redundant, originally meant for security
    public AbstractGraphicsAdapter() {
        graphics = new GraphicsManager();
    }

    /**
     * Call this to end graphics.
     * TODO: seems redundant, originally meant for security
     */
    public final void end() {
        graphics.end();
    }
}