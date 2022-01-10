package graphicsEngine.data;

import java.util.ArrayList;

/**
 * Class for graphics data.
 */
public class GraphicsData {
    public WindowParameters windowParameters;
    public Palette palette;

    public boolean debugLayer;

    /**
     * Creates graphics data.
     *
     * @param windowParameters Array of importable window parameters.
     * @param debugLayer       Drawing of the debug layer.
     *                         TODO: remove
     */
    public GraphicsData(ArrayList<String[]> windowParameters, boolean debugLayer) {
        this.windowParameters = new WindowParameters(windowParameters);
        palette = new Palette();

        this.debugLayer = debugLayer;
    }
}