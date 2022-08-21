package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
class Button2 extends SimpleJButton {
    protected static final String ACTION_COMMAND = "button2";

    protected Button2(@Nullable ActionListener actionListener) {
        super("Page 2", ACTION_COMMAND, actionListener);
    }
}