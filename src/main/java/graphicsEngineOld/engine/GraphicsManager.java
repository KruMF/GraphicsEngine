package graphicsEngineOld.engine;

import graphicsEngineOld.engine.data.GraphicsData;
import graphicsEngineOld.utilities.input.InputManager;
import graphicsEngineOld.parts.pages.PageManager;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;

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