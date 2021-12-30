package graphicsEngine.data;

import java.util.ArrayList;

public class GraphicsData {

    public WindowParameters windowParameters;
    public ColorParameters colorParameters;

    public boolean debugLayer;

    public ArrayList<String[]> fileHandlerTestData;

    public GraphicsData(
            boolean loadWindowParameters, boolean loadColorParameters,
            boolean _debugLayer){
        windowParameters = new WindowParameters(loadWindowParameters);
        colorParameters = new ColorParameters(loadColorParameters);

        debugLayer = _debugLayer;
    }
}