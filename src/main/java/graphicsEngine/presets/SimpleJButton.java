package graphicsEngine.presets;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: add javadoc
public class SimpleJButton extends JButton {
    private static final String DEFAULT_TEXT = "Button";
    private static final ActionListener
            DEFAULT_ACTION_LISTENER = e -> printLine("A button has been pressed.");

    //TODO: add javadoc
    public SimpleJButton(@Nullable String text,
                         @NotNull String actionCommand,
                         @Nullable ActionListener actionListener) {
        super(Objects.requireNonNullElse(text, DEFAULT_TEXT));
        setActionCommand(actionCommand);
        addActionListener(Objects.requireNonNullElse(actionListener, DEFAULT_ACTION_LISTENER));
    }
}