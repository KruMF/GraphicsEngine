package graphicsEngineDemo.d2_overlayDemo.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;

import static consoleUtils.ConsoleUtils.printLine;

import graphicsEngineDemo.d2_overlayDemo.Window;

/**
 * A class for containing buttons.
 */
public class ButtonListener implements ActionListener {
    private final Window window;

    //TODO: add javadocs
    public ButtonListener(@NotNull Window window) {
        this.window = window;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionCheck(e)) return;
        printLine("A button has been pressed but no action set up");
    }

    private boolean actionCheck(@NotNull ActionEvent e) {
        switch (e.getActionCommand()) {
            case Button1.ACTION_COMMAND ->
                    window.showOverlay();
            case Button2.ACTION_COMMAND ->
                    window.hideOverlay();
            case Button3.ACTION_COMMAND ->
                    window.toggleOverlay();
            case Button4.ACTION_COMMAND ->
                    window.toggleOverlayColor();
            default -> {
                return false;
            }
        }
        return true;
    }
}