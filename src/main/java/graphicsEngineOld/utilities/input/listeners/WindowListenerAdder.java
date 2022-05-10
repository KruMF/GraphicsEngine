package graphicsEngineOld.utilities.input.listeners;

import graphicsEngineOld.engine.data.windowParameters.WindowParameters;
import graphicsEngineOld.utilities.input.InputData;
import graphicsEngineOld.engine.ExitManager;

import javax.swing.JFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jetbrains.annotations.NotNull;

/**
 * Window listener adder class.
 */
class WindowListenerAdder {

    /**
     * Creates a window listener adder.
     *
     * @param window           Window to add listeners to.
     * @param windowParameters Window parameters to modify.
     * @param inputData        Input data to modify.
     * @param exitManager      Exit manager to call upon exit.
     */
    WindowListenerAdder(@NotNull JFrame window, @NotNull WindowParameters windowParameters,
                        @NotNull InputData inputData, @NotNull ExitManager exitManager) {
        addWindowListener(window, windowParameters, inputData, exitManager);
        addWindowResizeListener(window, windowParameters);
    }

    /**
     * Adds window listeners to the window.
     *
     * @param window           Window to add listeners to.
     * @param windowParameters Window parameters to modify.
     * @param inputData        Input data to modify.
     * @param exitManager      Exit manager to call upon exit.
     */
    private void addWindowListener(@NotNull JFrame window, @NotNull WindowParameters windowParameters,
                                   @NotNull InputData inputData, @NotNull ExitManager exitManager) {
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

    /**
     * Adds window resize listener to the window.
     *
     * @param window           Window to add listener to.
     * @param windowParameters Window parameters to modify.
     */
    private void addWindowResizeListener(@NotNull JFrame window, @NotNull WindowParameters windowParameters) {
        window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                windowParameters.updateWindowValues();
                windowParameters.setDrawableSize();
            }
        });
    }
}