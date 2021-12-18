package graphicsEngine.utilities.input;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.WindowParameters;

import java.awt.event.*;

public class InputManager {
    public InputData inputData;

    public InputManager(){
        inputData = new InputData();

        addWindowListener();
        addWindowResizeListener();
        addKeyListener();
        addMouseListener();
        addMouseMotionListener();
        addMouseWheelListener();
    }

    private void addWindowListener(){
        GraphicsManager.graphics.window.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                statusOut("Window open.");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                statusOut("Window closing.");
                GraphicsManager.close();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                statusOut("Window closed.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                statusOut("Window minimized.");
                GraphicsManager.minimized = true;
                inputData.keys = new int[] {};
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                statusOut("Window restored.");
                GraphicsManager.minimized = false;
            }

            @Override
            public void windowActivated(WindowEvent e) {
                statusOut("Window activated.");
                //windowActive = true;
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                statusOut("Window deactivated.");
                //windowActive = false;
                inputData.keys = new int[] {};
            }
        });
    }

    private void addWindowResizeListener(){
        GraphicsManager.graphics.window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                WindowParameters windowParameters = GraphicsManager.data.windowParameters;

                windowParameters.updateWindowValues();
                windowParameters.setDrawableSize();
            }
        });
    }

    private void addKeyListener(){
        GraphicsManager.graphics.window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                boolean newKey = true;

                for (int i = 0; i < inputData.keys.length; i++) { //pârbauda vai piespiestâ poga ir jauna
                    if (key == inputData.keys[i]) {
                        newKey = false;
                        break;
                    }
                }

                if (newKey) {
                    int[] keysTemp = new int[inputData.keys.length + 1];

                    for (int i = 0; i < inputData.keys.length; i++) {
                        keysTemp[i] = inputData.keys[i];
                    }
                    keysTemp[inputData.keys.length] = key;

                    inputData.keys = keysTemp;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (inputData.keys.length > 1) {
                    int key = e.getKeyCode();
                    int[] keysTemp = new int[inputData.keys.length - 1];

                    for (int i = 0, j = 0; i < inputData.keys.length; i++) {
                        if (key != inputData.keys[i]) {
                            keysTemp[j] = inputData.keys[i];
                            j++;
                        }
                    }

                    inputData.keys = keysTemp;
                } else inputData.keys = new int[] {};
            }
        });
    }

    private void addMouseListener(){
        GraphicsManager.graphics.window.getContentPane().addMouseListener(new MouseListener() {
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

    private void addMouseMotionListener(){
        GraphicsManager.graphics.window.getContentPane().addMouseMotionListener(new MouseMotionListener() {
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

    private void addMouseWheelListener(){
        GraphicsManager.graphics.window.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //mouse wheel actions not implemented yet
            }
        });
    }

    private static void statusOut(String message){
        if (GraphicsManager.data.printInputToConsole) System.out.println("InputData: " + message);
    }
}