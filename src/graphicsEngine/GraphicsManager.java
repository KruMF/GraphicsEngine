package graphicsEngine;

import graphicsEngine.data.GraphicsData;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.pages.PageManager;
import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;

public class GraphicsManager {

    public static GraphicsData data;
    public static PageManager pages;

    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    public static boolean running;

    public static void initialize(ArrayList<Page> _pages){
        System.out.println("GraphicsManager: Initializing.");

        data = new GraphicsData(true, true);
        pages = new PageManager(_pages);

        graphics = new GraphicsClass();
        graphics.initialize();

        exitManager = new ExitManager();
        input = new InputManager(
                graphics.window, data.windowParameters,
                exitManager);

        data.windowParameters.minimized = false;
        running = true;
    }

    public static void run(){
        if (!data.windowParameters.minimized) {
            graphics.main();
            Page activePage = pages.pages.get(pages.activePage);
            activePage.inputCheck.check(input, activePage);
        }
    }
}