package graphicsEngine.demo.simple;

import graphicsEngine.GraphicsManager;
import graphicsEngine.demo.simple.pages.*;

import java.util.ArrayList;

public class DemoSimple {

    public static void main(String[] args) {
        System.out.println("Simple graphics demo started.");
        start();
    }

    private static void start() {
        GraphicsManager graphics = new GraphicsManager();
        GraphicsManager.initialize(new ArrayList<>() {{
            add(new Page_0());
            add(new Page_1());
        }});
        graphics.run();
    }
}