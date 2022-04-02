package graphicsEngine.engine;

import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.utilities.input.InputManager;
import graphicsEngine.parts.pages.Page;
import graphicsEngine.parts.pages.PageManager;

import java.util.HashMap;
import java.util.Objects;

import com.google.inject.internal.Nullable;

/**
 * Graphics manager for managing graphics.
 */
public class GraphicsManager implements Runnable {
    public static GraphicsData data;
    public static PageManager pages;

    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    public static boolean running;
    private static final long REFRESH_DELAY = 15; //screen refresh delay in millis

    public static final String GRAPHICS_ENGINE_NAME = "Graphics Engine";

    /**
     * Creates a blank GraphicsManager thread with graphics data with specified parameters.
     * Has to be initialized. (Call initialize(?) to initialize)
     */
    public GraphicsManager(@Nullable GraphicsData graphicsData) {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Creating.");
        setGraphicsData(graphicsData);
    }

    private static void setGraphicsData(@Nullable GraphicsData graphicsData) {
        data = Objects.requireNonNullElse(graphicsData, new GraphicsData(
                null, null,
                true));
    }

    /**
     * Initializes GraphicsManager.
     * Gets it ready for thread running.
     *
     * @param exitManager Extended ExitManager for ending controller upon closing graphics. (Null - default)
     * @param pages Pages to display. (Null or empty - no pages)
     * @param activePage Key of the first active page. (Null - acts as if no pages present)
     */
    public static void initialize(@Nullable ExitManager exitManager,
                                  @Nullable HashMap<String, Page> pages, @Nullable String activePage) {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Initializing.");
        setupGraphics(pages, activePage);
        setupIO(exitManager);
        running = true;
    }

    private static void setupGraphics(@Nullable HashMap<String, Page> pages, @Nullable String activePage) {
        // Has to be before graphics.
        GraphicsManager.pages = new PageManager(pages, activePage);

        // Graphics.
        graphics = new GraphicsClass();
        graphics.initialize();
    }

    private static void setupIO(@Nullable ExitManager exitManager) {
        // Has to be before input.
        GraphicsManager.exitManager = Objects.requireNonNullElse(
                exitManager,
                new ExitManager());

        // Input.
        input = new InputManager(
                graphics.window, data.windowParameters,
                GraphicsManager.exitManager);
    }

    /**
     * Runs when GraphicsManager thread is being run.
     */
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