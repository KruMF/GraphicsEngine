package graphicsEngine.demo.demoLauncher;

import graphicsEngine.demo.demoLauncher.graphicalSelector.GraphicalDemoSelector;

/**
 * A class for launching various demo variants.
 *
 * TODO: finish javadoc
 */
public class DemoLauncher {

    /**
     * TODO: finish javadoc
     *
     * @param args Initial parameters
     */
    public static void main(String[] args) {
        if (!argumentCheck(args)) {
            graphicalSelector();
        }
    }

    private static boolean argumentCheck(String[] args) {
        if (args == null || args.length < 1 || args[0] == null) {
            return false;
        } else {
            switch (args[0]) {
                case "1" -> LaunchTypes.launchSimplest();
                case "2" -> LaunchTypes.launchPaged();
                case "3" -> LaunchTypes.launchThreaded();
                //add new demo types here
                default -> {
                    return false;
                }
            }
            return true;
        }
    }

    private static void graphicalSelector() {
        GraphicalDemoSelector.launch();
    }
}