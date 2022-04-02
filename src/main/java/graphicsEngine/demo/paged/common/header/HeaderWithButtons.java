package graphicsEngine.demo.paged.common.header;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.parts.simpleParts.DrawablePart;
import graphicsEngine.parts.containers.AlignmentType;
import graphicsEngine.parts.containers.PartContainer;
import graphicsEngine.presets.panels.CommonHeader;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Common abstract header with:
 *      * logo,
 *      * button for returning to starting page,
 *      * button alignment to right.
 */
public abstract class HeaderWithButtons extends CommonHeader {
    public static final int
            HEIGHT = 60,
            BUTTON_WIDTH = 150;

    /**
     * Constructor for the header.
     *
     * @param height      Height.
     * @param panelColors Panel colors.
     * @param buttons     Extra buttons. (Null - no extra buttons)
     */
    public HeaderWithButtons(int height,
                             @NotNull PanelColors panelColors,
                             @Nullable ArrayList<DrawablePart> buttons) {
        super(height, panelColors, prepareParts(getHeight(height), buttons));
    }

    private static ArrayList<DrawablePart> prepareParts(int height,
                                                        @Nullable ArrayList<DrawablePart> buttons) {
        return new ArrayList<>() {{
            add(prepareLogo(height));
            add(alignButtonsRight(height, buttons));
        }};
    }

    private static Logo prepareLogo(int height) {
        return new Logo(getLogoSize(height), new boolean[] {true, false});
    }

    private static int[] getLogoSize(int height) {
        return new int[] {
                (int) (height * Logo.PROPORTIONS),
                height};
    }

    private static PartContainer alignButtonsRight(int height,
                                                   @Nullable ArrayList<DrawablePart> buttons) {
        return new PartContainer(
                null, null,
                addStartButton(height, buttons),
                AlignmentType.RIGHT);
    }

    private static ArrayList<DrawablePart> addStartButton(int height,
                                                          @Nullable ArrayList<DrawablePart> buttons) {
        return new ArrayList<>() {{
            add(new StartButton(getButtonSize(height)));
            addAll(Objects.requireNonNullElse(buttons, new ArrayList<>()));
        }};
    }

    //TODO: add javadoc
    public static int[] getButtonSize(int height) {
        return new int[] {BUTTON_WIDTH, height};
    }
}