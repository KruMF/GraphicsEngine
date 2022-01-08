package graphicsEngine.demo.simple.common;

import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.PartContainer;
import graphicsEngine.utilities.pages.Page;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public abstract class CommonPage extends Page {
    static final Color
            PANEL_BACKGROUND_COLOR = Color.gray,
            PANEL_BORDER_COLOR = Color.darkGray;

    public CommonPage(ArrayList<? extends SimplePart> centralParts,
                      AlignmentType centralAlignment) {
        super(new ArrayList<>());
        this.parts.add(makeHeaderContainer(centralParts, centralAlignment));
    }

    private PartContainer makeHeaderContainer(ArrayList<? extends SimplePart> centralParts,
                                              AlignmentType centralAlignment) {
        return new PartContainer(
                new int[] {0, CommonHeader.HEIGHT},
                new boolean[] {false, true},
                new ArrayList<>() {{
                    add(new CommonHeader());
                    add(makeFooterContainer(centralParts, centralAlignment));
                }}, AlignmentType.TOP);
    }

    private PartContainer makeFooterContainer(ArrayList<? extends SimplePart> centralParts,
                                              AlignmentType centralAlignment) {
        return new PartContainer(
                new int[] {0, CommonFooter.HEIGHT},
                new boolean[] {false, true},
                new ArrayList<>() {{
                    add(new CommonFooter());
                    add(makeCentralContainer(centralParts, centralAlignment));
                }}, AlignmentType.BOTTOM);
    }

    private PartContainer makeCentralContainer(ArrayList<? extends SimplePart> centralParts,
                                               AlignmentType centralAlignment) {
        return new PartContainer(null,null, new ArrayList<>() {{
            addAll(Objects.requireNonNullElse(centralParts, new ArrayList<>()));
        }}, Objects.requireNonNullElse(centralAlignment, AlignmentType.TOP));
    }
}