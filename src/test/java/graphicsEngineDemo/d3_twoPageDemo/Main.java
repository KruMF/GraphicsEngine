package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;

import static consoleUtils.ConsoleUtils.printLine;

/**
 * TODO: finish this
 */
public class Main {
    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        printLine("Starting two-page demo...");
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window()));
        }};
    }
}