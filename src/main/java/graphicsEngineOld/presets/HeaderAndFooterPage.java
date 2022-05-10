package graphicsEngineOld.presets;

import graphicsEngineOld.engine.data.colors.Palette;
import graphicsEngineOld.engine.data.colors.PanelColors;
import graphicsEngineOld.utilities.input.InputChecker;
import graphicsEngineOld.parts.simpleParts.SimplePart;
import graphicsEngineOld.parts.containers.AlignmentType;
import graphicsEngineOld.parts.containers.PartContainer;
import graphicsEngineOld.parts.pages.Page;

import graphicsEngineOld.presets.panels.CommonHeader;
import graphicsEngineOld.presets.panels.CommonFooter;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public abstract class HeaderAndFooterPage extends Page {

    /**
     * Creates a page with header, footer and center.
     *
     * @param inputChecker     InputChecker to use. (Null - new InputChecker)
     * @param palette          Color palette to use. (Null - default)
     * @param header           Header. (null - default)
     * @param footer           Footer. (Null - default)
     * @param centralParts     ArrayList of central parts. (Null - empty)
     * @param centralAlignment Alignment of the central parts. (Null - aligned to top)
     */
    public HeaderAndFooterPage(@Nullable InputChecker inputChecker,
                               @NotNull Palette palette,
                               @Nullable CommonHeader header, @Nullable CommonFooter footer,
                               @Nullable ArrayList<? extends SimplePart> centralParts,
                               @Nullable AlignmentType centralAlignment) {
        super(inputChecker, palette, new ArrayList<>());
        this.parts.add(makeHeaderContainer(
                palette.panelColors,
                header, footer,
                centralParts, centralAlignment));
    }

    // TODO: add javadoc
    private PartContainer makeHeaderContainer(@NotNull PanelColors panelColors,
                                              @Nullable CommonHeader header, @Nullable CommonFooter footer,
                                              @Nullable ArrayList<? extends SimplePart> centralParts,
                                              @Nullable AlignmentType centralAlignment) {
        return new PartContainer(
                null, null,
                new ArrayList<>() {{
                    add(makeCommonHeader(header, panelColors));
                    add(makeFooterContainer(panelColors, footer, centralParts, centralAlignment));
                }},
                AlignmentType.TOP);
    }

    private static CommonHeader makeCommonHeader(@Nullable CommonHeader header,
                                                 @NotNull PanelColors panelColors) {
        return Objects.requireNonNullElse(
                header,
                new CommonHeader(0, panelColors, null));
    }

    // TODO: add javadoc
    private PartContainer makeFooterContainer(@NotNull PanelColors panelColors,
                                              @Nullable CommonFooter footer,
                                              @Nullable ArrayList<? extends SimplePart> centralParts,
                                              @Nullable AlignmentType centralAlignment) {
        return new PartContainer(null, null,
                new ArrayList<>() {{
                    add(makeCommonFooter(footer, panelColors));
                    add(makeCentralContainer(centralParts, centralAlignment));
                }},
                AlignmentType.BOTTOM);
    }

    private static CommonFooter makeCommonFooter(@Nullable CommonFooter footer,
                                                 @NotNull PanelColors panelColors) {
        return Objects.requireNonNullElse(
                footer,
                new CommonFooter(0, panelColors, null));
    }

    // TODO: add javadoc
    private PartContainer makeCentralContainer(@Nullable ArrayList<? extends SimplePart> centralParts,
                                               @Nullable AlignmentType centralAlignment) {
        return new PartContainer(null,null,
                new ArrayList<>() {{
                    addAll(Objects.requireNonNullElse(centralParts, new ArrayList<>()));
                }},
                Objects.requireNonNullElse(centralAlignment, AlignmentType.TOP));
    }
}