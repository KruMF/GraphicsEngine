package graphicsEngine.utilities.input.listeners;

import graphicsEngine.data.WindowParameters;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.ExitManager;

import javax.swing.JFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowListenerAdder {
    WindowListenerAdder(JFrame window, WindowParameters windowParameters,
                        InputData inputData, ExitManager exitManager) {
        addWindowListener(window, windowParameters, inputData, exitManager);
        addWindowResizeListener(window, windowParameters);
    }

    private void addWindowListener(JFrame window, WindowParameters windowParameters,
                                   InputData inputData, ExitManager exitManager) {
        window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                exitManager.close();
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {
                windowParameters.minimized = true;
                inputData.keys = new int[] {};
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                windowParameters.minimized = false;
            }

            @Override
            public void windowActivated(WindowEvent e) {
                windowParameters.windowActive = true;
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                windowParameters.windowActive = false;
                inputData.keys = new int[] {};
            }
        });
    }

    private void addWindowResizeListener(JFrame window, WindowParameters windowParameters) {
        window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                windowParameters.updateWindowValues();
                windowParameters.setDrawableSize();
            }
        });
    }
}