package graphicsEngineDemo.d2_overlayDemo.buttons;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.parts.SimpleJButton;

/**
 * A simple button for hiding the overlay.
 */
public class Button2 extends SimpleJButton {
    public static final String ACTION_COMMAND = "hide";

    public Button2(@Nullable ActionListener actionListener) {
        super("Hide", ACTION_COMMAND, actionListener);
    }
}