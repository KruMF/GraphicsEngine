package graphicsEngine;

import graphicsEngine.data.GraphicsData;
import graphicsEngine.utilities.input.InputManager;
import graphicsEngine.pages.Page;
import graphicsEngine.pages.Page_0;
import graphicsEngine.pages.Page_1;

import java.util.ArrayList;

public class GraphicsManager {

    public static GraphicsData data;
    public static ArrayList<Page> pages;
    public static int activePage;

    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    public static boolean running;

    public static void initialize(){
        System.out.println("GraphicsManager: Initializing.");

        data = new GraphicsData(
                true, true,
                true);
        pages = new ArrayList<>(){{
            add(new Page_0());
            add(new Page_1());
        }};
        activePage = 0;

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
            userInputCheck();
        }
    }

    private static void userInputCheck(){
        //Button.checkButtonActions(this); //uz ekrâna redzamo pogu notikumi
        //InputData.keyboardActionCheck(); //keyboard nospiesto pogu notikumi
    }
}