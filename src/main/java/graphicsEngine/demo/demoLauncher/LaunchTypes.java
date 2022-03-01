package graphicsEngine.demo.demoLauncher;

import graphicsEngine.demo.advanced.DemoAdvanced;
import graphicsEngine.demo.simple.withPages.DemoSimple;

/**
 * TODO: Finish this and add javadoc
 */
class LaunchTypes {
    static void launchSimple_simplest() {
        unfinishedLauncherMessage("simplest possible demo");
    }

    static void launchSimple_withPages() {
        DemoSimple.main(null);
    }

    static void launchAdvanced() {
        DemoAdvanced.main(null);
    }

    //add new demo types here

    private static void unfinishedLauncherMessage(String actionMessage) {
        System.out.println(
                "Demo launcher not finished. Trying to launch: " + actionMessage);
    }
}