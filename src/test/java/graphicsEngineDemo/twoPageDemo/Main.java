package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.SimpleJButton;
import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.windows.AbstractWindow;
import graphicsEngine.windows.WindowConfig;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

import static graphicsEngine.Utilities.printLine;

/**
 * TODO: finish this
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            graphics.newWindow(new Window());
        }};
    }

    private static class Window extends AbstractWindow implements ActionListener {

        public Window() {
            super(config());
        }

        /**
         * Hardcoded configuration of a new Window object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Two page demo";
            int[]
                    size = new int[] {600, 400},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {
            add(new Page1(null, this));
            //TODO: add pages here; maybe use MultiPageWindow instead of AbstractWindow
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonName;
            switch (e.getActionCommand()) {
                case Button1.ACTION_COMMAND -> {
                    buttonName = Button1.ACTION_COMMAND;
                }
                case Button2.ACTION_COMMAND -> {
                    buttonName = Button2.ACTION_COMMAND;
                }
                default -> buttonName = "A button";
            }
            printLine(buttonName + " has been pressed");
        }
    }

    private static class CommonHeader extends AbstractHeader {
        private static final int HEIGHT = 50;

        protected CommonHeader(@Nullable PanelColors panelColors,
                               @Nullable ActionListener actionListener) {
            super(panelColors, HEIGHT);
            addButtons(actionListener);
        }

        @Override
        public void addParts() {}

        private void addButtons(@Nullable ActionListener actionListener) {
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(new Button1(actionListener));
            add(new Button2(actionListener));
        }
    }

    private static class Button1 extends SimpleJButton {
        protected static final String ACTION_COMMAND = "button1";
        protected Button1(@Nullable ActionListener actionListener) {
            super("Page 1", ACTION_COMMAND, actionListener);
        }
    }

    private static class Button2 extends SimpleJButton {
        protected static final String ACTION_COMMAND = "button2";
        protected Button2(@Nullable ActionListener actionListener) {
            super("Page 2", ACTION_COMMAND, actionListener);
        }
    }

    private static class CommonFooter extends AbstractFooter {
        private static final int HEIGHT = 100;

        protected CommonFooter(@Nullable PanelColors panelColors) {
            super(panelColors, HEIGHT);
        }

        @Override
        public void addParts() {}
    }

    private static abstract class AbstractCommonPage extends HeaderAndFooterPage {
        protected AbstractCommonPage(@Nullable PanelColors panelColors,
                                     @Nullable ActionListener actionListener) {
            super(
                    new CommonHeader(panelColors, actionListener),
                    new CommonFooter(panelColors));
        }
    }

    private static class Page1 extends AbstractCommonPage {
        protected Page1(@Nullable PanelColors panelColors,
                        @Nullable ActionListener actionListener) {
            super(panelColors, actionListener);
        }

        @Override
        public void addParts() {}

        @Override
        public String getPageKey() {
            return "page1";
        }
    }
}