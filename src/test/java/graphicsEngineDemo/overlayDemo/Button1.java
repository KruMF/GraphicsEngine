package graphicsEngineDemo.overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Button1 extends SimpleJButton {
    public static final String ACTION_COMMAND = "button1";

    protected Button1(@Nullable ActionListener actionListener) {
        super("Show", ACTION_COMMAND, actionListener);
    }
}