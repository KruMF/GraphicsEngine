package graphicsEngineDemo.overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Button2 extends SimpleJButton {
    public static final String ACTION_COMMAND = "button2";

    protected Button2(@Nullable ActionListener actionListener) {
        super("Hide", ACTION_COMMAND, actionListener);
    }
}