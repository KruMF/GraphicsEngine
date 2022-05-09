package graphicsEngineDemo.threaded.main;

import ThreadAbstraction.AbstractUpdater;
import graphicsEngineDemo.threaded.calc.Calculations;
import graphicsEngineDemo.threaded.graphics.GraphicsAdapter;

import static graphicsEngineSwingBeta.Utilities.printLine;

// TODO: add javadoc
public class Main extends AbstractUpdater {
    // TODO: add javadoc
    public static void main(String[] args) {
        Starter.start();
    }

    public static Main mainThread;
    private static final long THREAD_DELAY = 100L;

    protected GraphicsAdapter graphics;

    protected Main() {
        super(THREAD_DELAY);
        printLine("Main thread initialized.");
    }

    // TODO: add javadoc
    @Override
    public void update() {
        //TODO: put non-static data object here?
        Calculations calculations = new Calculations();
        calculations.start();
    }

    // TODO: add javadoc
    @Override
    public void endCheck() {
        if (ExitManager.determineEnd()) {
            end();
        }
    }

    // TODO: add javadoc
    @Override
    public void finish() {
        printLine("Main thread ending.");
        graphics.end();
    }
}
