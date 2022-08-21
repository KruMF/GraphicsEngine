package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
class Button1 extends SimpleJButton {
    protected static final String ACTION_COMMAND = "button1";

    protected Button1(@Nullable ActionListener actionListener) {
        super("Page 1", ACTION_COMMAND, actionListener);
    }
}