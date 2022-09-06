package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SinglePageWindow;

import java.awt.Graphics;
import java.awt.Color;
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
        private static final String WINDOW_TITLE = "Overlay demo";
        private static final Color OVERLAY_COLOR = new Color(100, 0, 0, 100);

        private static final JPanel OVERLAY = new JPanel() {
            {
                setOpaque(false);
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(OVERLAY_COLOR);
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
        };

        private Window() {
            super(new WindowConfig(), OVERLAY);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle(WINDOW_TITLE);
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