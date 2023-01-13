package graphicsEngineDemo.d2_overlayDemo.buttons;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.parts.SimpleJButton;

/**
 * A simple button for showing the overlay.
 */
public class Button1 extends SimpleJButton {
    public static final String ACTION_COMMAND = "show";

    public Button1(@Nullable ActionListener actionListener) {
        super("Show", ACTION_COMMAND, actionListener);
    }
}