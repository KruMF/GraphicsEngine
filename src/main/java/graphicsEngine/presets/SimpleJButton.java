package graphicsEngine.presets;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class SimpleJButton extends JButton {
    private static final String DEFAULT_TEXT = "Button";
    private static final ActionListener DEFAULT_ACTION_LISTENER = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("A button has been pressed.");
            //TODO: what's up with utils?
            //printLine("A menu button has been pressed.");
        }
    };

    public SimpleJButton(@Nullable String text,
                            @NotNull String actionCommand,
                            @Nullable ActionListener actionListener) {
        super(Objects.requireNonNullElse(text, DEFAULT_TEXT));
        setActionCommand(actionCommand);
        addActionListener(Objects.requireNonNullElse(actionListener, DEFAULT_ACTION_LISTENER));
    }
}