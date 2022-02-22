package graphicsEngine.demo.simple;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.demo.simple.pages.menuPages.startingPage.StartingPage;
import graphicsEngine.demo.simple.pages.demoPages.page1.Page_1;
import graphicsEngine.demo.simple.pages.demoPages.page2.Page_2;

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
            add(new StartingPage(palette));
            add(new Page_1(palette));
            add(new Page_2(palette));
        }};
    }
}