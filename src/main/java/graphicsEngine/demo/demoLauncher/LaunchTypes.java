package graphicsEngine.demo.demoLauncher;

import graphicsEngine.demo.paged.DemoPaged;
import graphicsEngine.demo.threaded.DemoAdvanced;

/**
 * TODO: Finish this and add javadoc
 */
class LaunchTypes {
    static void launchSimplest() {
        unfinishedLauncherMessage("simplest possible demo");
    }

    static void launchPaged() {
        DemoPaged.main(null);
    }

    static void launchThreaded() {
        DemoAdvanced.main(null);
    }

    //add new demo types here

    private static void unfinishedLauncherMessage(String actionMessage) {
        System.out.println(
                "Demo launcher not finished. Trying to launch: " + actionMessage);
    }
}