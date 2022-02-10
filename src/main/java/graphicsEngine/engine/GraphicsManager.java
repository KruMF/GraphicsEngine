package graphicsEngine.engine;

import graphicsEngine.engine.data.GraphicsData;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.pages.PageManager;
import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;
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
    private static final long REFRESH_DELAY = 30; //screen refresh delay in millis

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
     * @param pages Pages to display.
     */
    public static void initialize(@Nullable ExitManager exitManager, @Nullable ArrayList<Page> pages) {
        System.out.println(GRAPHICS_ENGINE_NAME + ": Initializing.");
        setupGraphics(pages);
        setupIO(exitManager);
        running = true;
    }

    private static void setupGraphics(@Nullable ArrayList<Page> pages) {
        // Has to be before graphics.
        GraphicsManager.pages = new PageManager(pages);

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