package graphicsEngine;

import graphicsEngine.data.GraphicsData;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.pages.PageManager;
import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;

public class GraphicsManager implements Runnable {
    public static GraphicsData data;
    public static PageManager pages;

    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    public static boolean running;
    private static final long REFRESH_DELAY = 30; //screen refresh delay in millis

    private static final String GRAPHICS_ENGINE_NAME = "Graphics Engine";

    /**
     * Creates a blank GraphicsManager thread with graphics data with specified parameters.
     * Has to be initialized. (Call initialize(?) to initialize)
     *
     * @param windowParameters Window parameters. (Null - default parameters)
     */
    public GraphicsManager(ArrayList<String[]> windowParameters) {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Creating.");

        data = new GraphicsData(windowParameters, true);
    }

    /**
     * Initializes GraphicsManager.
     * Gets it ready for thread running.
     *
     * @param pages Pages to display.
     */
    public static void initialize(ArrayList<Page> pages) {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Initializing.");

        // Has to be before graphics.
        GraphicsManager.pages = new PageManager(pages);

        // Graphics.
        graphics = new GraphicsClass();
        graphics.initialize();

        // Has to be before input.
        exitManager = new ExitManager(GRAPHICS_ENGINE_NAME);

        // Input.
        input = new InputManager(
                graphics.window, data.windowParameters,
                exitManager);

        // Get ready for running.
        running = true;
    }

    @SuppressWarnings("BusyWait")
    @Override
    public void run() {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Running.");
        while (running) {
            if (!data.windowParameters.minimized) {
                graphics.main();
                pages.activityCheck(input);
            }

            try {
                Thread.sleep(REFRESH_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}