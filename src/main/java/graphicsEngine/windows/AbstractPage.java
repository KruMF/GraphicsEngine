package graphicsEngine.windows;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractPage extends JPanel {
    private static final Color DEFAULT_BACKGROUND = Color.black;

    //completely blank
    //TODO: add javadoc
    public AbstractPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public AbstractPage(@Nullable List<ActionListener> actionListenerList,
                        @Nullable Color backgroundColor) {
        addListeners(actionListenerList);
        setBackground(Objects.requireNonNullElse(backgroundColor, DEFAULT_BACKGROUND));
    }

    /**
     * Adds known listeners to this page.
     * Override this to add custom listeners.
     *
     * @param list List of listeners to add.
     *
     * @return Remaining unknown listeners.
     */
    public @NotNull List<ActionListener> addListeners(@Nullable List<ActionListener> list) {
        return Objects.requireNonNullElse(list, new ArrayList<>());
    }

    //TODO: add javadoc
    public abstract String getPageKey();
}