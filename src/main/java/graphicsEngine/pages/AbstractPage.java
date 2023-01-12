package graphicsEngine.pages;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.DynamicPanel;

//TODO: add javadoc
public abstract class AbstractPage extends DynamicPanel {

    //completely blank
    //TODO: add javadoc
    public AbstractPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public AbstractPage(@Nullable List<@Nullable ActionListener> actionListenerList,
                        @Nullable Color backgroundColor) {
        super(
                null,
                new SimpleColorScheme(backgroundColor, null),
                null);
        addListeners(actionListenerList);
    }

    //TODO: add javadoc
    public abstract @NotNull String getPageKey();

    /**
     * Adds known listeners to this page.
     * Override this to add custom listeners.
     *
     * @param list List of listeners to add.
     *
     * @return Remaining unknown listeners.
     */
    public @NotNull List<@Nullable ActionListener> addListeners(@Nullable List<@Nullable ActionListener> list) {
        return Objects.requireNonNullElse(list, new ArrayList<>());
    }
}