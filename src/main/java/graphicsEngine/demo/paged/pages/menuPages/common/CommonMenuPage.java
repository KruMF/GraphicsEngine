package graphicsEngine.demo.paged.pages.menuPages.common;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.parts.simpleParts.SimplePart;
import graphicsEngine.parts.containers.AlignmentType;

import graphicsEngine.demo.paged.common.BlankKeyboardActions;
import graphicsEngine.demo.paged.common.CommonPage;

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
     * @param keyboardActions Keyboard actions. (Null - blank)
     * @param palette         Color palette to use.
     * @param centralParts    Central parts. (Null - empty)
     */
    public CommonMenuPage(@Nullable BlankKeyboardActions keyboardActions,
                          @NotNull Palette palette,
                          @Nullable ArrayList<? extends SimplePart> centralParts) {
        super(keyboardActions, palette,
                new MenuPageHeader(palette.panelColors),
                centralParts, AlignmentType.TOP);
    }
}