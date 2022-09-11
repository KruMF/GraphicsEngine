package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class for containing buttons.
 */
class ButtonListener implements ActionListener {
    private final Window window;

    //TODO: add javadocs
    ButtonListener(@NotNull Window window) {
        this.window = window;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionCheck(e)) return;
        printLine("A button has been pressed but no action set up");
    }

    private boolean actionCheck(@NotNull ActionEvent e) {
        switch (e.getActionCommand()) {
            case Button1.ACTION_COMMAND ->
                    window.showOverlay();
            case Button2.ACTION_COMMAND ->
                    window.hideOverlay();
            case Button3.ACTION_COMMAND ->
                    window.toggleOverlay();
            case Button4.ACTION_COMMAND ->
                    window.toggleOverlayColor();
            default -> {
                return false;
            }
        }
        return true;
    }

    /**
     * A simple button for showing the overlay.
     */
    protected static class Button1 extends SimpleJButton {
        public static final String ACTION_COMMAND = "show";

        protected Button1(@Nullable ActionListener actionListener) {
            super("Show", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for hiding the overlay.
     */
    protected static class Button2 extends SimpleJButton {
        public static final String ACTION_COMMAND = "hide";

        protected Button2(@Nullable ActionListener actionListener) {
            super("Hide", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for toggling the visibility of the overlay.
     */
    protected static class Button3 extends SimpleJButton {
        public static final String ACTION_COMMAND = "toggle";

        protected Button3(@Nullable ActionListener actionListener) {
            super("Toggle visibility", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for toggling the color of the overlay.
     */
    protected static class Button4 extends SimpleJButton {
        public static final String ACTION_COMMAND = "color";

        protected Button4(@Nullable ActionListener actionListener) {
            super("Toggle color", ACTION_COMMAND, actionListener);
        }
    }
}