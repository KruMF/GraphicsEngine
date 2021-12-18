package graphicsEngine.demo.simple;

import graphicsEngine.GraphicsManager;

public class DemoSimple {

    private static final long refreshDelay = 20; //screen refresh delay in millis

    public static void main(String[] args){
        System.out.println("Simple graphics demo started.");

        GraphicsManager.initialize();

        run();
    }

    private static void run(){
        while (GraphicsManager.running){
            GraphicsManager.run();

            try {
                Thread.sleep(refreshDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}