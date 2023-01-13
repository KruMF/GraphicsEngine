package graphicsEngineDemo.d2_overlayDemo.buttons;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.parts.SimpleJButton;

/**
 * A simple button for toggling the visibility of the overlay.
 */
public class Button3 extends SimpleJButton {
    public static final String ACTION_COMMAND = "toggle";

    public Button3(@Nullable ActionListener actionListener) {
        super("Toggle visibility", ACTION_COMMAND, actionListener);
    }
}