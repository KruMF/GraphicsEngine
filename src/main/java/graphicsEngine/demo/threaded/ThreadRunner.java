package graphicsEngine.demo.threaded;

// TODO: add javadoc
public class ThreadRunner implements Runnable {
    private static final long delay = 50;
    private boolean running;

    private static final int xmax = 100;
    private int x;

    ThreadRunner() {
        x = 0;
        running = true;
    }

    @SuppressWarnings("BusyWait")
    @Override
    public void run() {
        while (running) {
            System.out.println("Thread running. X = " + x);

            x++;
            endCheck();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void endCheck() {
        if(x == xmax) {
            running = false;
        }
    }
}