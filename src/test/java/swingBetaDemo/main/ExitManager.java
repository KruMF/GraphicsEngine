package swingBetaDemo.main;

import swingBetaDemo.calc.EmptyDataCheck;

//for managing exit of the main thread
// TODO: finish this
public class ExitManager {
    private static final boolean CHECK_FOR_END = false;

    //determine, if main thread has to stop
    //returns true, if thread has to stop
    public static boolean determineEnd() {
        return EmptyDataCheck.check()
                && CHECK_FOR_END;
    }
}