package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.pages.AbstractPage;
import graphicsEngine.presets.SimpleOverlay;

import java.util.Objects;
import java.util.List;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    //TODO: add javadoc
    public SinglePageWindow(@NotNull WindowManager windowManager,
                            @NotNull WindowConfig config,
                            @Nullable List<ActionListener> actionListenerList,
                            @Nullable SimpleOverlay overlay) {
        super(windowManager, config, actionListenerList, overlay);
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {
        add(getPage());
    }

    //TODO: add javadoc
    public abstract AbstractPage getPage();

    @Override
    public void repaint() {
        try {
            Objects.requireNonNull(getContentPane()).repaint();
        } catch (NullPointerException ignored) {}
        super.repaint();
    }
}