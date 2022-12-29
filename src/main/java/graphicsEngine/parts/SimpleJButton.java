package graphicsEngine.parts;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

/**
 * A simple JButton with text and ActionListener.
 */
public class SimpleJButton extends JButton {
    private static final String DEFAULT_TEXT = "Button";
    private static final ActionListener
            DEFAULT_ACTION_LISTENER = e -> printLine("A button has been pressed. ActionListener not defined.");

    /**
     * Creates a simple JButton with text and ActionListener.
     *
     * @param text           Text to display
     * @param actionCommand  Action command
     * @param actionListener ActionListener object
     */
    public SimpleJButton(@Nullable String text,
                         @NotNull String actionCommand,
                         @Nullable ActionListener actionListener) {
        super(Objects.requireNonNullElse(text, DEFAULT_TEXT));
        setActionCommand(actionCommand);
        addActionListener(Objects.requireNonNullElse(actionListener, DEFAULT_ACTION_LISTENER));
    }

    /**
     * Returns the button's text.
     *
     * @return The button's text.
     */
    @Override
    public final @NotNull String getText() {
        return super.getText();
    }
}