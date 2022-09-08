package graphicsEngineDemo.d5_featurePreview;

import graphicsEngine.GraphicsAdapter;

import graphicsEngine.windows.WindowUpdater;

//TODO: add javadoc
public class Main {
    //TODO: add javadoc
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window()));
        }};
    }
}