package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.JFrame;
import java.awt.event.*;

import org.jetbrains.annotations.NotNull;

/**
 * Mouse listener adder class.
 */
class MouseListenerAdder {

    /**
     * Creates a mouse listener adder.
     *
     * @param window    Window to add listeners to.
     * @param inputData Input data to modify.
     */
    MouseListenerAdder(@NotNull JFrame window, @NotNull InputData inputData) {
        addMouseListener(window, inputData);
        addMouseMotionListener(window, inputData);
        addMouseWheelListener(window);
    }

    /**
     * Adds a mouse listener to the window for checking various mouse actions.
     *
     * @param window    Window to add listener to.
     * @param inputData Input data to modify.
     */
    private void addMouseListener(@NotNull JFrame window, @NotNull InputData inputData) {
        window.getContentPane().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                inputData.mouseClick = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                inputData.mouseClick = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    /**
     * Adds a mouse motion listener to the window.
     *
     * @param window    Window to add listener to.
     * @param inputData Input data to modify.
     */
    private void addMouseMotionListener(@NotNull JFrame window, @NotNull InputData inputData) {
        window.getContentPane().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                updateMouseCoordinates(inputData, e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                updateMouseCoordinates(inputData, e);
            }
        });
    }

    /**
     * Adds a mouse wheel listener to the window.
     * Currently not implemented.
     * TODO: implement
     *
     * @param window Window to add listener to.
     */
    private void addMouseWheelListener(@NotNull JFrame window) {
        window.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //mouse wheel listener placeholder - not implemented yet
            }
        });
    }

    /**
     * Updates mouse coordinates when mouse moved.
     *
     * @param inputData Input data to modify.
     * @param e         Mouse event for getting coordinates.
     */
    private static void updateMouseCoordinates(@NotNull InputData inputData, @NotNull MouseEvent e) {
        inputData.mouse[0] = e.getX();
        inputData.mouse[1] = e.getY();
    }
}