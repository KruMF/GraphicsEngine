package graphicsEngine;

import graphicsEngine.data.GraphicsData;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.pages.PageManager;
import graphicsEngine.utilities.input.InputManager;

import java.util.ArrayList;

public class GraphicsManager implements Runnable{

    public static GraphicsData data;
    public static PageManager pages;

    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    private static final long refreshDelay = 30; //screen refresh delay in millis
    public static boolean running;

    public GraphicsManager(){
        System.out.println("Graphics Engine: Creating.");
        data = new GraphicsData(true, true);
    }

    public static void initialize(ArrayList<Page> _pages){
        System.out.println("Graphics Engine: Initializing.");

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

    @SuppressWarnings("BusyWait")
    @Override
    public void run(){
        while(running){
            if (!data.windowParameters.minimized) {
                graphics.main();
                Page activePage = pages.pages.get(pages.activePage);
                activePage.inputCheck.check(input, activePage);
            }

            try {
                Thread.sleep(refreshDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}