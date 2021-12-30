package graphicsEngine.utilities.input.listeners;

import graphicsEngine.utilities.input.InputData;

import javax.swing.*;
import java.awt.event.*;

class MouseListenerAdder {
    MouseListenerAdder(JFrame window, InputData inputData){
        addMouseListener(window, inputData);
        addMouseMotionListener(window, inputData);
        addMouseWheelListener(window);
    }

    private void addMouseListener(JFrame window, InputData inputData){
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

    private void addMouseMotionListener(JFrame window, InputData inputData){
        window.getContentPane().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                inputData.mouse[0] = e.getX();
                inputData.mouse[1] = e.getY();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                inputData.mouse[0] = e.getX();
                inputData.mouse[1] = e.getY();
            }
        });
    }

    private void addMouseWheelListener(JFrame window){
        window.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //mouse wheel listener placeholder - not implemented yet
            }
        });
    }
}