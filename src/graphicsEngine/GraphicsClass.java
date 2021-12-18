package graphicsEngine;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.pages.DebugLayer;

import javax.swing.*;
import java.awt.*;

public class GraphicsClass extends JPanel {

    public JFrame window;
    public GraphicsClass graphics;

    public void initialize(){
        WindowParameters windowParameters = GraphicsManager.data.windowParameters;
        window = new JFrame(windowParameters.windowTitle);
        window.setDefaultCloseOperation(WindowParameters.defaultCloseAction);

        graphics = new GraphicsClass();

        window.getContentPane().add(graphics);
        window.setResizable(true);
        window.setSize(windowParameters.windowSize[0], windowParameters.windowSize[1]);
        window.setLocation(windowParameters.windowLocation[0], windowParameters.windowLocation[1]);

        window.setVisible(true);
        windowParameters.setDrawableSize();
    }

    /**
     * Initiates drawing of a single frame.
     */
    public void main(){
        window.repaint();
    }

    protected void paintComponent(Graphics g) {
        GraphicsManager.pages.get(GraphicsManager.activePage).draw(g);
        if(GraphicsManager.data.debugLayer) DebugLayer.draw(g);
    }
}