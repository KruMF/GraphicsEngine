package graphicsEngineDemo.threaded.common.calc;

import graphicsEngineDemo.threaded.common.data.Data;

/**
 * Checks the pointlessness of further calculations.
 * TODO: fix javadoc
 */
public class EmptyDataCheck {

    /**
     * Check if it's time to stop calculating.
     *
     * @return True if calculations have to stop.
     */
    public static boolean check() {
        return !checkX();
    }

    private static boolean checkX() {
        return Data.getX() < Data.MAX_X;
    }
}