package graphicsEngineOld.oldPagedDemo.common;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.parts.simpleParts.SimplePart;
import graphicsEngineOld.parts.containers.AlignmentType;
import graphicsEngineOld.presets.HeaderAndFooterPage;
import graphicsEngineOld.presets.panels.CommonFooter;

import graphicsEngineOld.oldPagedDemo.common.header.HeaderWithButtons;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Common abstract page with header and footer.
 */
public abstract class CommonPage extends HeaderAndFooterPage {
    private static final int FOOTER_HEIGHT = 30;

    /**
     * Constructor for common page.
     *
     * @param keyboardActions  Page specific keyboard actions. (Null - no actions)
     * @param palette          Color palette to use.
     * @param header           Header.
     * @param centralParts     ArrayList of central parts. (Null - empty)
     * @param centralAlignment Alignment of the central parts. (Null - aligned to top)
     */
    public CommonPage(@Nullable BlankKeyboardActions keyboardActions,
                      @NotNull Palette palette,
                      @NotNull HeaderWithButtons header,
                      @Nullable ArrayList<? extends SimplePart> centralParts,
                      @Nullable AlignmentType centralAlignment){
        super(
                Objects.requireNonNullElse(keyboardActions, new BlankKeyboardActions()),
                palette,
                header, new CommonFooter(FOOTER_HEIGHT, palette.panelColors, null),
                centralParts, centralAlignment);
    }
}