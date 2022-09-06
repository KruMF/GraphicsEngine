package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.windowTypes.SinglePageWindow;
import graphicsEngine.presets.SimpleOverlay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;

/**
 * TODO: add javadoc
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

        private static final SimpleOverlay OVERLAY = new SimpleOverlay(OVERLAY_COLOR);

        private Window() {
            super(new WindowConfig(), OVERLAY);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle(WINDOW_TITLE);
        }

        /**
         * Redundant as there is only one window.
         * TODO: finish this javadoc
         *
         * @return The key of this window.
         */
        @Override
        public final @NotNull String getWindowKey() {
            return "window";
        }

        /**
         * Prepares a page to add to this window.
         *
         * @return An AbstractPage object.
         */
        @Override
        public final @NotNull AbstractPage addPage() {
            return new Page(null, this);
        }

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public final void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case Buttons.ACTION_COMMAND_1 -> showOverlay();
                case Buttons.ACTION_COMMAND_2 -> hideOverlay();
                case Buttons.ACTION_COMMAND_3 -> toggleOverlay();
                default -> printLine("A button has been pressed but no action set up");
            }
        }
    }
}