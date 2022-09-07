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
import javax.swing.BoxLayout;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

        private boolean overlayColorState;

        private Window() {
            super(new WindowConfig(), null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle(WINDOW_TITLE);

            overlayColorState = false;
            setOverlay(new Overlay(this));
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
                case Buttons.ACTION_COMMAND_4 -> toggleOverlayColor();
                default -> printLine("A button has been pressed but no action set up");
            }
        }

        private void toggleOverlayColor() {
            overlayColorState = !overlayColorState;
            if(overlayColorState) {
                setOverlayColor(Overlay.COLOR_1);
            } else {
                setOverlayColor(Overlay.COLOR_0);
            }
        }

        private void setOverlayColor(@Nullable Color color) {
            SimpleOverlay overlay = getOverlay();
            if (overlay != null) {
                overlay.setColor(color);
            }
        }
    }

    //TODO: add javadoc
    private static class Overlay extends SimpleOverlay {
        protected static final Color COLOR_0 = new Color(100, 0, 0, 100);
        protected static final Color COLOR_1 = new Color(0, 100, 0, 100);

        protected Overlay(@Nullable ActionListener actionListener) {
            super(COLOR_0);
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(new Buttons.Button4(actionListener));
        }
    }
}