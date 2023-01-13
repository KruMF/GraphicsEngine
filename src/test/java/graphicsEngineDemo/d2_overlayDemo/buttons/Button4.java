package graphicsEngineDemo.d2_overlayDemo.buttons;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.parts.SimpleJButton;

/**
 * A simple button for toggling the color of the overlay.
 */
public class Button4 extends SimpleJButton {
    public static final String ACTION_COMMAND = "color";

    public Button4(@Nullable ActionListener actionListener) {
        super("Toggle color", ACTION_COMMAND, actionListener);
    }
}