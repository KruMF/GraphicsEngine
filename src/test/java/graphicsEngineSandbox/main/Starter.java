package graphicsEngineSandbox.main;

import graphicsEngineSandbox.data.Data;
import graphicsEngineSandbox.graphics.MyGraphicsAdapter;

import static consoleUtils.ConsoleUtils.printLine;

//a helper class for starting everything
// TODO: add javadoc
class Starter {
    // TODO: add javadoc
    protected static void start() {
        Main.mainThread = new Main();
        printLine("Initializing other threads.");
        startOtherThreads();
        Main.mainThread.start();
    }

    private static void startOtherThreads() {
        Data.resetValues(); //TODO: convert to a non-static object

        Main.mainThread.graphics = new MyGraphicsAdapter();
    }
}