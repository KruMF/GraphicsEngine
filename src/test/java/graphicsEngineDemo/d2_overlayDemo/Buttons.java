package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

/**
 * A class for containing buttons.
 */
public class Buttons {
    /**
     * A simple button for showing the overlay.
     */
    public static class Button1 extends SimpleJButton {
        public static final String ACTION_COMMAND = "show";

        protected Button1(@Nullable ActionListener actionListener) {
            super("Show", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for hiding the overlay.
     */
    public static class Button2 extends SimpleJButton {
        public static final String ACTION_COMMAND = "hide";

        protected Button2(@Nullable ActionListener actionListener) {
            super("Hide", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for toggling the visibility of the overlay.
     */
    public static class Button3 extends SimpleJButton {
        public static final String ACTION_COMMAND = "toggle";

        protected Button3(@Nullable ActionListener actionListener) {
            super("Toggle visibility", ACTION_COMMAND, actionListener);
        }
    }

    /**
     * A simple button for toggling the color of the overlay.
     */
    public static class Button4 extends SimpleJButton {
        public static final String ACTION_COMMAND = "color";

        protected Button4(@Nullable ActionListener actionListener) {
            super("Toggle color", ACTION_COMMAND, actionListener);
        }
    }
}