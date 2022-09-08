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
 * GraphicsEngine demo demonstrating the use of overlays.
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
        public final @NotNull AbstractPage getPage() {
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
                case Buttons.Button1.ACTION_COMMAND -> showOverlay();
                case Buttons.Button2.ACTION_COMMAND -> hideOverlay();
                case Buttons.Button3.ACTION_COMMAND -> toggleOverlay();
                case Buttons.Button4.ACTION_COMMAND -> toggleOverlayColor();
                default -> printLine("A button has been pressed but no action set up");
            }
        }

        private void toggleOverlayColor() {
            overlayColorState = !overlayColorState;
            if(overlayColorState) {
                setOverlayColor(OverlayColors.GREEN);
            } else {
                setOverlayColor(OverlayColors.RED);
            }
        }

        private void setOverlayColor(@Nullable Color color) {
            try {
                getOverlay().setColor(color);
            } catch (ClassCastException ignored) {
                //glassPane does not contain a SimpleOverlay object
            }
        }
    }

    /**
     * TODO: finish this javadoc
     */
    private static class Overlay extends SimpleOverlay {
        //TODO: add javadoc
        protected Overlay(@Nullable ActionListener actionListener) {
            super(OverlayColors.RED);
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(new Buttons.Button4(actionListener));
        }
    }

    /**
     * TODO: finish this javadoc
     */
    private static class OverlayColors {
        protected static final Color RED = new Color(100, 0, 0, 100);
        protected static final Color GREEN = new Color(0, 100, 0, 100);
    }
}