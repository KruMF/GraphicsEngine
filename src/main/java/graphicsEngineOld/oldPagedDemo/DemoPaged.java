package graphicsEngineOld.oldPagedDemo;

import graphicsEngineOld.engine.GraphicsManager;
import graphicsEngineOld.engine.data.GraphicsData;
import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.pages.Page;

import graphicsEngineOld.oldPagedDemo.pages.menuPages.startingPage.StartingPage;
import graphicsEngineOld.oldPagedDemo.pages.menuPages.settingsPage.SettingsPage;
import graphicsEngineOld.oldPagedDemo.pages.menuPages.demoSelectPage.DemoSelectPage;
import graphicsEngineOld.oldPagedDemo.pages.demoPages.page1.Page_1;
import graphicsEngineOld.oldPagedDemo.pages.demoPages.page2.Page_2;

import java.util.HashMap;

import org.jetbrains.annotations.NotNull;

/**
 * Graphics oldPagedDemo with pages.
 */
public class DemoPaged {

    /**
     * Paged oldPagedDemo main method.
     *
     * @param args Arguments not required; leave null.
     */
    public static void main(String[] args) {
        System.out.println("Paged graphics oldPagedDemo started.");
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
        // Graphics data with default values.
        return new GraphicsData();

        // Graphics data with custom values.
        //return new GraphicsData(null, null, true);
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