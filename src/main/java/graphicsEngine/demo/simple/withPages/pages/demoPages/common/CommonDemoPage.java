package graphicsEngine.demo.simple.withPages.pages.demoPages.common;

import graphicsEngine.engine.data.colors.Palette;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.simpleParts.SimplePart;

import graphicsEngine.demo.simple.withPages.common.BlankKeyboardActions;
import graphicsEngine.demo.simple.withPages.common.CommonPage;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * An abstract common page for demo pages.
 */
public abstract class CommonDemoPage extends CommonPage {

    /**
     * Constructor for a common demo page
     *
     * @param palette Color palette to use.
     * @param centralParts Central parts. (Null - empty)
     */
    public CommonDemoPage(@Nullable BlankKeyboardActions keyboardActions,
                          @NotNull Palette palette,
                          @Nullable ArrayList<? extends SimplePart> centralParts) {
        super(keyboardActions, palette,
                new DemoPageHeader(palette.panelColors),
                centralParts, AlignmentType.TOP);
    }
}