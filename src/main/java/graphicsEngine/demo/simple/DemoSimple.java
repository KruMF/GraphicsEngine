package graphicsEngine.demo.simple;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.demo.simple.pages.*;

import java.util.ArrayList;

// TODO: needs rework
public class DemoSimple {

    public static void main(String[] args) {
        System.out.println("Simple graphics demo started.");
        start();
    }

    private static void start() {
        GraphicsManager graphics = new GraphicsManager();

        PanelColors panelColors = GraphicsManager.data.palette.panelColors;

        GraphicsManager.initialize(null, new ArrayList<>() {{
            add(new Page_0(panelColors));
            add(new Page_1(panelColors));
        }});
        graphics.run();
    }
}