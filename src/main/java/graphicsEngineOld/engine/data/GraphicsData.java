package graphicsEngineOld.engine.data;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.engine.data.windowParameters.WindowParameters;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;

/**
 * Class for graphics data.
 */
public class GraphicsData {
    public WindowParameters windowParameters;
    public Palette palette;

    public boolean debugLayer;

    /**
     * Creates graphics data with default values.
     * Works as if parameters were null.
     * TODO: remove debugLayer parameter
     */
    public GraphicsData() {
        this(null, null, true);
    }

    /**
     * Creates graphics data.
     *
     * @param windowParameters Window parameters. (Null - default parameters)
     * @param palette          Color palette. (Null - default colors)
     * @param debugLayer       Drawing of the debug layer. (Null - false)
     *                         TODO: remove debug layer
     */
    public GraphicsData(@Nullable WindowParameters windowParameters,
                        @Nullable Palette palette,
                        @Nullable boolean debugLayer) {
        setWindowParameters(windowParameters);
        setPalette(palette);

        setDebugLayer(debugLayer);
    }

    public void setWindowParameters(@Nullable WindowParameters windowParameters) {
        this.windowParameters = Objects.requireNonNullElse(windowParameters, new WindowParameters(
                null, null,
                null, null));
    }

    public void setPalette(@Nullable Palette palette) {
        this.palette = Objects.requireNonNullElse(palette, new Palette(
                null, null,
                null));
    }

    public void setDebugLayer(@Nullable boolean debugLayer) {
        this.debugLayer = Objects.requireNonNullElse(debugLayer, false);
    }
}