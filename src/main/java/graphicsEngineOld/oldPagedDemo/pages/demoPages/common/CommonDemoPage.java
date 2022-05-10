package graphicsEngineOld.oldPagedDemo.pages.demoPages.common;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.simpleParts.SimplePart;
import graphicsEngineOld.parts.containers.AlignmentType;

import graphicsEngineOld.oldPagedDemo.common.CommonPage;
import graphicsEngineOld.oldPagedDemo.common.BlankKeyboardActions;

import java.util.ArrayList;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * An abstract common page for oldPagedDemo pages.
 */
public abstract class CommonDemoPage extends CommonPage {

    /**
     * Constructor for a common oldPagedDemo page
     *
     * @param keyboardActions Keyboard actions. (Null - blank)
     * @param palette         Color palette to use.
     * @param centralParts    Central parts. (Null - empty)
     */
    public CommonDemoPage(@Nullable BlankKeyboardActions keyboardActions,
                          @NotNull Palette palette,
                          @Nullable ArrayList<? extends SimplePart> centralParts) {
        super(keyboardActions, palette,
                new DemoPageHeader(palette.panelColors),
                centralParts, AlignmentType.LEFT);
    }
}