package swingBetaDemo.main;

import swingBetaDemo.data.Data;
import swingBetaDemo.graphics.GraphicsAdapter;

import static graphicsEngineSwingBeta.Utilities.printLine;

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

        Main.mainThread.graphics = new GraphicsAdapter();
    }
}