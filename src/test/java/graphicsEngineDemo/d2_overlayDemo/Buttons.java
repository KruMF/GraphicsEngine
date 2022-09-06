package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.presets.SimpleJButton;
import org.jetbrains.annotations.Nullable;

import java.awt.event.ActionListener;

public class Buttons {
    public static final String ACTION_COMMAND_1 = "show";
    public static final String ACTION_COMMAND_2 = "hide";
    public static final String ACTION_COMMAND_3 = "toggle";

    /**
     * A simple button for turning on the overlay.
     */
    public static class Button1 extends SimpleJButton {
        protected Button1(@Nullable ActionListener actionListener) {
            super("Show", ACTION_COMMAND_1, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button2 extends SimpleJButton {
        protected Button2(@Nullable ActionListener actionListener) {
            super("Hide", ACTION_COMMAND_2, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button3 extends SimpleJButton {
        protected Button3(@Nullable ActionListener actionListener) {
            super("Toggle", ACTION_COMMAND_3, actionListener);
        }
    }
}