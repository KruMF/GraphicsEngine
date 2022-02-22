package graphicsEngine.demo.simple.pages.menuPages;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.simpleParts.SimplePart;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.demo.simple.common.CommonPage;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * An abstract common page for menu.
 */
public abstract class CommonMenuPage extends CommonPage {

    /**
     * Constructor for a common menu page
     *
     * @param palette Color palette to use.
     */
    public CommonMenuPage(@NotNull Palette palette,
                          @Nullable ArrayList<? extends SimplePart> centralParts) {
        super(palette, centralParts, AlignmentType.TOP);
    }
}