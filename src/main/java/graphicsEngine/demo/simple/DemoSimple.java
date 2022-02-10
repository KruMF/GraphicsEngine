package graphicsEngine.demo.simple;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.demo.simple.pages.page0.Page_0;
import graphicsEngine.demo.simple.pages.page1.Page_1;
import graphicsEngine.utilities.pages.Page;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class DemoSimple {

    //TODO: add javadoc
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

    private static ArrayList<Page> preparePages(@NotNull Palette palette) {
        return new ArrayList<>() {{
            add(new Page_0(palette));
            add(new Page_1(palette));
        }};
    }
}