package graphicsEngine.demo.demoLauncher;

/**
 * A class for launching various demo variants.
 *
 * TODO: finish this class
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
                case "1" -> {
                    unfinishedLauncherMessage("simplest possible demo");
                }
                case "2" -> {
                    unfinishedLauncherMessage("simple demo with pages");
                }
                case "3" -> {
                    unfinishedLauncherMessage("advanced demo");
                }
                default -> {
                    return false;
                }
            }
            return true;
        }
    }

    private static void graphicalSelector() {
        unfinishedLauncherMessage("graphical demo selector");
    }

    private static void unfinishedLauncherMessage(String actionMessage) {
        System.out.println(
                "Demo launcher not finished. Trying to launch: " + actionMessage);
    }
}