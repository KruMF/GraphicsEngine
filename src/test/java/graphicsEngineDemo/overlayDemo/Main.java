package graphicsEngineDemo.overlayDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SinglePageWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;


import static consoleUtils.ConsoleUtils.printLine;

/**
 * TODO: finish this and add javadocs
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window()));
        }};
    }

    /**
     * The window to display.
     */
    private static class Window extends SinglePageWindow implements ActionListener {
        private static final JPanel OVERLAY = new JPanel() {
            {
                setOpaque(false);
            }
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(100, 0, 0, 100));
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
        };

        public Window() {
            super(new WindowConfig(), OVERLAY);
        }

        @Override
        public @NotNull String getWindowKey() {
            return "window";
        }

        @Override
        public AbstractPage addPage() {
            return new Page(null, this);
        }

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonName;
            switch (e.getActionCommand()) {
                case Button1.ACTION_COMMAND -> {
                    buttonName = Button1.ACTION_COMMAND;
                    showOverlay();
                }
                case Button2.ACTION_COMMAND -> {
                    buttonName = Button2.ACTION_COMMAND;
                    hideOverlay();
                }
                default -> buttonName = "A button";
            }
            printLine(buttonName + " has been pressed");
        }
    }
}