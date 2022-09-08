package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class CommonHeaderButtons {
    //TODO: add javadocs
    public static class Button_Start extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_start";

        protected Button_Start(@Nullable ActionListener actionListener) {
            super("Start", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Settings extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_settings";

        protected Button_Settings(@Nullable ActionListener actionListener) {
            super("Settings", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_DemoSelect extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demoSelect";

        protected Button_DemoSelect(@Nullable ActionListener actionListener) {
            super("Select demo", ACTION_COMMAND, actionListener);
        }
    }
}