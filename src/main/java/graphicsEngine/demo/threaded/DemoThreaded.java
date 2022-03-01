package graphicsEngine.demo.threaded;

// TODO: needs rework
public class DemoThreaded {
    private static ThreadRunner threadRunner;

    public static void main(String[] args) {
        initialize();
        run();
    }

    private static void initialize() {
        System.out.println("Advanced graphics demo: starting");

        threadRunner = new ThreadRunner();

        System.err.println("Graphics Engine not added to threaded demo.");
    }

    private static void run() {
        System.out.println("Starting thread.");
        threadRunner.run();
    }
}