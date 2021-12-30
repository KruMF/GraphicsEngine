package graphicsEngine.utilities.input.listeners;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.WindowParameters;
import graphicsEngine.utilities.input.InputData;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerAdder {
    WindowListenerAdder(JFrame window, InputData inputData){
        addWindowListener(window, inputData);
        addWindowResizeListener(window);
    }

    private void addWindowListener(JFrame window, InputData inputData){
        window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                GraphicsManager.close();
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {
                GraphicsManager.minimized = true;
                inputData.keys = new int[] {};
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                GraphicsManager.minimized = false;
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //windowActive = true;
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //windowActive = false;
                inputData.keys = new int[] {};
            }
        });
    }

    private void addWindowResizeListener(JFrame window){
        window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                WindowParameters windowParameters = GraphicsManager.data.windowParameters;

                windowParameters.updateWindowValues();
                windowParameters.setDrawableSize();
            }
        });
    }
}