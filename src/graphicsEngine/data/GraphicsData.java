package graphicsEngine.data;

import java.util.ArrayList;

// TODO: add javadoc
public class GraphicsData {
    public WindowParameters windowParameters;
    public Palette palette;

    public boolean debugLayer;

    // TODO: add javadoc
    public GraphicsData(ArrayList<String[]> windowParameters, boolean debugLayer) {
        this.windowParameters = new WindowParameters(windowParameters);
        palette = new Palette();

        this.debugLayer = debugLayer;
    }
}