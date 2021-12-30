package graphicsEngine.demo.simple;

import graphicsEngine.GraphicsManager;
import graphicsEngine.demo.simple.pages.*;

import java.util.ArrayList;

public class DemoSimple {

    private static final long refreshDelay = 20; //screen refresh delay in millis

    public static void main(String[] args){
        System.out.println("Simple graphics demo started.");

        GraphicsManager.initialize(
                new ArrayList<>(){{
                    add(new Page_0());
                    add(new Page_1());
                }}
        );

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