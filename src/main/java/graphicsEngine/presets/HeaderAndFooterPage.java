package graphicsEngine.presets;

import graphicsEngine.data.colors.Palette;
import graphicsEngine.data.colors.PanelColors;
import graphicsEngine.presets.panels.CommonFooter;
import graphicsEngine.presets.panels.CommonHeader;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.PartContainer;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.util.ArrayList;
import java.util.Objects;

// TODO: add javadoc
public abstract class HeaderAndFooterPage extends Page {

    // TODO: add javadoc
    public HeaderAndFooterPage(InputChecker inputChecker,
                               Palette palette,
                               CommonHeader header, CommonFooter footer,
                               ArrayList<? extends SimplePart> centralParts,
                               AlignmentType centralAlignment) {
        super(inputChecker, palette, new ArrayList<>());
        this.parts.add(makeHeaderContainer(palette.panelColors, header, footer, centralParts, centralAlignment));
    }

    // TODO: add javadoc
    private PartContainer makeHeaderContainer(PanelColors panelColors,
                                              CommonHeader header, CommonFooter footer,
                                              ArrayList<? extends SimplePart> centralParts,
                                              AlignmentType centralAlignment) {
        return new PartContainer(null, null, new ArrayList<>() {{
            add(makeCommonHeader(header, panelColors));
            add(makeFooterContainer(panelColors, footer, centralParts, centralAlignment));
        }}, AlignmentType.TOP);
    }

    private static CommonHeader makeCommonHeader(CommonHeader header, PanelColors panelColors) {
        return Objects.requireNonNullElse(header, new CommonHeader(0, panelColors, null));
    }

    // TODO: add javadoc
    private PartContainer makeFooterContainer(PanelColors panelColors,
                                              CommonFooter footer,
                                              ArrayList<? extends SimplePart> centralParts,
                                              AlignmentType centralAlignment) {
        return new PartContainer(null, null,new ArrayList<>() {{
            add(makeCommonFooter(footer, panelColors));
            add(makeCentralContainer(centralParts, centralAlignment));
        }}, AlignmentType.BOTTOM);
    }

    private static CommonFooter makeCommonFooter(CommonFooter footer, PanelColors panelColors) {
        return Objects.requireNonNullElse(footer, new CommonFooter(0, panelColors, null));
    }

    // TODO: add javadoc
    private PartContainer makeCentralContainer(ArrayList<? extends SimplePart> centralParts,
                                               AlignmentType centralAlignment) {
        return new PartContainer(null,null, new ArrayList<>() {{
            addAll(Objects.requireNonNullElse(centralParts, new ArrayList<>()));
        }}, Objects.requireNonNullElse(centralAlignment, AlignmentType.TOP));
    }
}