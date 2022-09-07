package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.presets.SimpleOverlay;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    //TODO: add javadoc
    public SinglePageWindow(@NotNull WindowConfig config,
                            @Nullable SimpleOverlay overlay) {
        super(config, overlay);
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {
        add(getPage());
    }

    //TODO: add javadoc
    public abstract AbstractPage getPage();
}