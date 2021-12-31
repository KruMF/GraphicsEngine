package graphicsEngine.demo.advanced;

public class ThreadRunner implements Runnable {
    private boolean running;

    private static final long delay = 50;

    private int x;
    private static final int xmax = 100;

    ThreadRunner(){
        x = 0;
        running = true;
    }

    @SuppressWarnings("BusyWait")
    @Override
    public void run() {
        while(running){
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

    private void endCheck(){
        if(x == xmax) running = false;
    }
}