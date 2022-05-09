package graphicsEngineDemo.threaded.simple.main;

import graphicsEngineDemo.threaded.common.calc.EmptyDataCheck;

//for managing exit of the main thread
// TODO: finish this and add javadoc
public class ExitManager {
    private static final boolean CHECK_FOR_END = false;

    //determine, if main thread has to stop
    //returns true, if thread has to stop
    // TODO: add javadoc
    public static boolean determineEnd() {
        return EmptyDataCheck.check()
                && CHECK_FOR_END;
    }
}