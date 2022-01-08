package graphicsEngine.data;

import java.util.ArrayList;

public class GraphicsData {
    public WindowParameters windowParameters;
    public Palette palette;

    public boolean debugLayer;

    public GraphicsData(ArrayList<String[]> windowParameters, boolean debugLayer) {
        this.windowParameters = new WindowParameters(windowParameters);
        palette = new Palette();

        this.debugLayer = debugLayer;
    }
}