package graphicsEngine.data;

public class GraphicsData {

    public WindowParameters windowParameters;
    public Palette palette;

    public boolean debugLayer;

    public GraphicsData(boolean loadWindowParameters, boolean _debugLayer){
        windowParameters = new WindowParameters(loadWindowParameters);
        palette = new Palette();

        debugLayer = _debugLayer;
    }
}