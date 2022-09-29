package graphicsEngine;

import graphicsEngine.colors.ColorUtilities;

import java.awt.Color;
import javax.swing.ImageIcon;

import org.jetbrains.annotations.NotNull;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {
    /**
     * Transparent, non-null color.
     * TODO: remove from here
     */
    public static final Color EMPTY_COLOR = ColorUtilities.DEFAULT_COLOR_TRANSPARENT;

    private static final String
            RESOURCES_PATH = "src/main/resources/graphicsEngine/",
            SAMPLE_ICON_RELATIVE_PATH = "images/sample_icon.png";

    //TODO: add javadoc
    public static @NotNull ImageIcon getSampleIcon() {
        return new ImageIcon(getFulResourcePath(SAMPLE_ICON_RELATIVE_PATH));
    }

    @SuppressWarnings("SameParameterValue")
    private static @NotNull String getFulResourcePath(@NotNull String relative) {
        return RESOURCES_PATH + relative;
    }
}