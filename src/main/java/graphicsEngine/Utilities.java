package graphicsEngine;

import javax.swing.ImageIcon;

import org.jetbrains.annotations.NotNull;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {
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