package graphicsEngine.demo.simple;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.GraphicsData;
import graphicsEngine.data.colors.Palette;
import graphicsEngine.demo.simple.pages.*;
import graphicsEngine.utilities.pages.Page;

import java.util.ArrayList;

//TODO: add javadoc
public class DemoSimple {

    public static void main(String[] args) {
        System.out.println("Simple graphics demo started.");
        start();
    }

    private static void start() {
        GraphicsData startingParameters = startingParameters();
        GraphicsManager graphics = new GraphicsManager(startingParameters);

        Palette palette = startingParameters.palette;
        GraphicsManager.initialize(null, preparePages(palette));

        graphics.run();
    }

    private static GraphicsData startingParameters() {
        return new GraphicsData(null, null, true);
    }

    private static ArrayList<Page> preparePages(Palette palette) {
        return new ArrayList<>() {{
            add(new Page_0(palette));
            add(new Page_1(palette));
        }};
    }
}