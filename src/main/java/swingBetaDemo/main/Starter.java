package swingBetaDemo.main;

import graphicsEngineSwingBeta.GraphicsManager;
import swingBetaDemo.data.Data;

import static swingBetaDemo.main.Utilities.printLine;

//a helper class for starting everything
class Starter {
    protected static void start() {
        Main.mainThread = new Main();
        printLine("Initializing other threads.");
        startOtherThreads();
        Main.mainThread.start();
    }

    private static void startOtherThreads() {
        Data.resetValues(); //TODO: convert to a non-static object

        Main.mainThread.graphics = new GraphicsManager();
    }
}