package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngine.presets.SimpleJButton;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class DemoSelectButtons {
    //TODO: add javadocs
    public static class Button_Page1 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo1";

        protected Button_Page1(@Nullable ActionListener actionListener) {
            super("Page 1", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Page2 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo2";

        protected Button_Page2(@Nullable ActionListener actionListener) {
            super("Page 2", ACTION_COMMAND, actionListener);
        }
    }

    //TODO: add javadocs
    public static class Button_Page3 extends SimpleJButton {
        public static final String ACTION_COMMAND = "page_demo3";

        protected Button_Page3(@Nullable ActionListener actionListener) {
            super("Page 3", ACTION_COMMAND, actionListener);
        }
    }
}