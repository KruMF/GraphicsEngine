package graphicsEngine;

import java.util.Objects;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {
    /**
     * Transparent, non-null color.
     */
    public static final Color EMPTY_COLOR = new Color(0, 0, 0, 0);

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

    // TODO: add javadoc
    public interface BorderInterface {
        Color DEFAULT_BORDER_COLOR = Color.red;

        static void setBorderState(@NotNull JComponent component, boolean state, @Nullable Color color) {
            if (state) {
                component.setBorder(new LineBorder(Objects.requireNonNullElse(color, DEFAULT_BORDER_COLOR)));
            } else {
                component.setBorder(null);
            }
        }
    }
}