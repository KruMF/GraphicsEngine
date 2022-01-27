package graphicsEngine.data;

import graphicsEngine.data.colors.Palette;
import graphicsEngine.data.windowParameters.WindowParameters;

import java.util.Objects;

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
     * @param palette          Color palette. (Null - default colors)
     * @param debugLayer       Drawing of the debug layer. (Null - false)
     *                         TODO: remove debug layer
     */
    public GraphicsData(WindowParameters windowParameters, Palette palette, boolean debugLayer) {
        setWindowParameters(windowParameters);
        setPalette(palette);

        setDebugLayer(debugLayer);
    }

    public void setWindowParameters(WindowParameters windowParameters) {
        this.windowParameters = Objects.requireNonNullElse(windowParameters, new WindowParameters(
                null, null,
                null, null));
    }

    public void setPalette(Palette palette) {
        this.palette = Objects.requireNonNullElse(palette, new Palette(
                null, null,
                null));
    }

    public void setDebugLayer(boolean debugLayer) {
        this.debugLayer = Objects.requireNonNullElse(debugLayer, false);
    }
}