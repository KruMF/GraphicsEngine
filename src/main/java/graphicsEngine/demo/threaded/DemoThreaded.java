package graphicsEngine.demo.threaded;

// TODO: finish this
public class DemoThreaded {
    private static ThreadRunner threadRunner;

    public static void main(String[] args) {
        System.out.println("Advanced graphics demo: starting");

        threadRunner = new ThreadRunner(); // Has to be created before graphics.
        GraphicsRunner.startGraphics();
        runMainThread();
    }

    private static void runMainThread() {
        System.out.println("Starting main thread...");
        threadRunner.run();
    }
}