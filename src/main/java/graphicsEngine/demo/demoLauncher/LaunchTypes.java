package graphicsEngine.demo.demoLauncher;

/**
 * TODO: Finish this and add javadoc
 */
class LaunchTypes {
    static void launchSimple_simplest() {
        unfinishedLauncherMessage("simplest possible demo");
    }

    static void launchSimple_withPages() {
        unfinishedLauncherMessage("simple demo with pages");
    }

    static void launchAdvanced() {
        unfinishedLauncherMessage("advanced demo");
    }

    //add new demo types here

    private static void unfinishedLauncherMessage(String actionMessage) {
        System.out.println(
                "Demo launcher not finished. Trying to launch: " + actionMessage);
    }
}