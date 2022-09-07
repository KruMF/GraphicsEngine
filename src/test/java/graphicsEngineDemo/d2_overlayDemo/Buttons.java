package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

/**
 * A class for containing buttons.
 */
public class Buttons {
    public static final String ACTION_COMMAND_1 = "show";
    public static final String ACTION_COMMAND_2 = "hide";
    public static final String ACTION_COMMAND_3 = "toggle";
    public static final String ACTION_COMMAND_4 = "color";

    /**
     * A simple button for showing the overlay.
     */
    public static class Button1 extends SimpleJButton {
        protected Button1(@Nullable ActionListener actionListener) {
            super("Show", ACTION_COMMAND_1, actionListener);
        }
    }

    /**
     * A simple button for hiding the overlay.
     */
    public static class Button2 extends SimpleJButton {
        protected Button2(@Nullable ActionListener actionListener) {
            super("Hide", ACTION_COMMAND_2, actionListener);
        }
    }

    /**
     * A simple button for toggling the visibility of the overlay.
     */
    public static class Button3 extends SimpleJButton {
        protected Button3(@Nullable ActionListener actionListener) {
            super("Toggle visibility", ACTION_COMMAND_3, actionListener);
        }
    }

    /**
     * A simple button for toggling the color of the overlay.
     */
    public static class Button4 extends SimpleJButton {
        protected Button4(@Nullable ActionListener actionListener) {
            super("Toggle color", ACTION_COMMAND_4, actionListener);
        }
    }
}