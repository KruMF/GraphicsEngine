package graphicsEngineDemo.d3_twoPageDemo.parts;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Buttons {
    //TODO: add javadocs
    public static class Button1 extends SimpleJButton {
        public static final String ACTION_COMMAND = "button1";

        protected Button1(@Nullable ActionListener actionListener) {
            super("Page 1", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button2 extends SimpleJButton {
        public static final String ACTION_COMMAND = "button2";

        protected Button2(@Nullable ActionListener actionListener) {
            super("Page 2", ACTION_COMMAND, actionListener);
        }
    }
}