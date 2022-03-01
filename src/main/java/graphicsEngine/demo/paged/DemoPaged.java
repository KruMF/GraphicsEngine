package graphicsEngine.demo.paged;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.pages.Page;

import graphicsEngine.demo.paged.pages.menuPages.startingPage.StartingPage;
import graphicsEngine.demo.paged.pages.menuPages.settingsPage.SettingsPage;
import graphicsEngine.demo.paged.pages.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngine.demo.paged.pages.demoPages.page1.Page_1;
import graphicsEngine.demo.paged.pages.demoPages.page2.Page_2;

import java.util.HashMap;

import org.jetbrains.annotations.NotNull;

/**
 * Graphics demo with pages.
 */
public class DemoPaged {

    /**
     * Paged demo main method.
     *
     * @param args Arguments not required; leave null.
     */
    public static void main(String[] args) {
        System.out.println("Paged graphics demo started.");
        start();
    }

    private static void start() {
        GraphicsData startingParameters = startingParameters();
        GraphicsManager graphics = new GraphicsManager(startingParameters);

        Palette palette = startingParameters.palette;
        GraphicsManager.initialize(null, preparePages(palette), StartingPage.PAGE_KEY);

        graphics.run();
    }

    private static GraphicsData startingParameters() {
        return new GraphicsData(null, null, true);
    }

    private static HashMap<String, Page> preparePages(@NotNull Palette palette) {
        return new HashMap<>() {{
            put(StartingPage.PAGE_KEY, new StartingPage(palette));
            put(SettingsPage.PAGE_KEY, new SettingsPage(palette));
            put(DemoSelectPage.PAGE_KEY, new DemoSelectPage(palette));
            put(Page_1.PAGE_KEY, new Page_1(palette));
            put(Page_2.PAGE_KEY, new Page_2(palette));
        }};
    }
}