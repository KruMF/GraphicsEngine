package graphicsEngine.demo.simple.withPages.common.header;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.PartContainer;
import graphicsEngine.presets.panels.CommonHeader;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public abstract class HeaderWithButtons extends CommonHeader {
    public static final int
            LOGO_WIDTH = 200,
            BUTTON_WIDTH = 100,
            HEIGHT = 100;

    // TODO: add javadoc
    public HeaderWithButtons(int height,
                             @NotNull PanelColors panelColors,
                             @Nullable ArrayList<DrawablePart> buttons) {
        super(height, panelColors, prepareParts(getHeight(height), buttons));
    }

    private static ArrayList<DrawablePart> prepareParts(int height,
                                                        @Nullable ArrayList<DrawablePart> buttons) {
        return new ArrayList<>() {{
            add(prepareLogo(height));
            add(alignButtonsRight(buttons));
        }};
    }

    private static Logo prepareLogo(int height) {
        int[] logoSize = new int[] {LOGO_WIDTH, height};
        return new Logo(logoSize, new boolean[] {true, false});
    }

    private static PartContainer alignButtonsRight(@Nullable ArrayList<DrawablePart> buttons) {
        return new PartContainer(
                null, null,
                new ArrayList<>() {{
                    addAll(Objects.requireNonNullElse(buttons, new ArrayList<>()));
                }},
                AlignmentType.RIGHT);
    }
}