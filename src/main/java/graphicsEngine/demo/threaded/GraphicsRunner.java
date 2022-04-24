package graphicsEngine.demo.threaded;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.pages.Page;

import java.util.ArrayList;
import java.util.HashMap;

import org.jetbrains.annotations.NotNull;

//TODO: needs more work
class GraphicsRunner {
    static void startGraphics() {
        System.err.println("Starting graphics...");
        GraphicsData startingParameters = startingParameters();
        GraphicsManager graphicsManager = new GraphicsManager(startingParameters);

        Palette palette = startingParameters.palette;
        String startingPageKey = DemoPage.PAGE_KEY;
        GraphicsManager.initialize(null, preparePages(palette), startingPageKey);

        graphicsManager.run();
    }

    private static GraphicsData startingParameters() {
        // Graphics data with default values.
        return new GraphicsData();

        // Graphics data with custom values.
        //return new GraphicsData(null, null, true);
    }

    private static HashMap<String, Page> preparePages(@NotNull Palette palette) {
        return new HashMap<>() {{
            put(DemoPage.PAGE_KEY, new DemoPage(null, palette, null));
        }};
    }

    static class DemoPage extends Page {
        public static final String PAGE_KEY = "thePage";

        /**
         * Creates a simple page with background and adds provided layers.
         *
         * @param inputChecker InputChecker to use. (Null - new InputChecker)
         * @param palette      Color palette to use. (Null - default)
         * @param layers       ArrayList of layers to add. (Null - blank page)
         */
        public DemoPage(InputChecker inputChecker, Palette palette, ArrayList<DrawablePart> layers) {
            super(inputChecker, palette, layers);
        }
    }
}