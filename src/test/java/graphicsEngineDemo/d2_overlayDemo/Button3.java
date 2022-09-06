package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Button3 extends SimpleJButton {
    public static final String ACTION_COMMAND = "button3";

    protected Button3(@Nullable ActionListener actionListener) {
        super("Toggle", ACTION_COMMAND, actionListener);
    }
}