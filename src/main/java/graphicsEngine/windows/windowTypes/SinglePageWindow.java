package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.presets.SimpleOverlay;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    //TODO: add javadoc
    public SinglePageWindow(@NotNull WindowManager windowManager,
                            @NotNull WindowConfig config,
                            @Nullable SimpleOverlay overlay) {
        super(windowManager, config, overlay);
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {
        add(getPage());
    }

    //TODO: add javadoc
    public abstract AbstractPage getPage();
}