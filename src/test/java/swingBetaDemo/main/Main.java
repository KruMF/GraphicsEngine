package swingBetaDemo.main;

import ThreadAbstraction.AbstractUpdater;
import swingBetaDemo.calc.Calculations;
import swingBetaDemo.graphics.GraphicsAdapter;

import static graphicsEngineSwingBeta.Utilities.printLine;

public class Main extends AbstractUpdater {
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

    @Override
    public void update() {
        //TODO: put non-static data object here?
        Calculations calculations = new Calculations();
        calculations.start();
    }

    @Override
    public void endCheck() {
        if (ExitManager.determineEnd()) {
            end();
        }
    }

    @Override
    public void finish() {
        printLine("Main thread ending.");
        graphics.end();
    }
}
