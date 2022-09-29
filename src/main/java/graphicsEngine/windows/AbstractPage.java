package graphicsEngine.windows;

import graphicsEngine.panels.StaticPanel;
import graphicsEngine.colors.SimpleColorScheme;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractPage extends StaticPanel {

    //completely blank
    //TODO: add javadoc
    public AbstractPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public AbstractPage(@Nullable List<ActionListener> actionListenerList,
                        @Nullable Color backgroundColor) {
        super(
                null,
                new SimpleColorScheme(backgroundColor, null),
                null);
        addListeners(actionListenerList);
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