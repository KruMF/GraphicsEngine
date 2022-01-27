package graphicsEngine.data.windowParameters;

import graphicsEngine.GraphicsClass;
import graphicsEngine.GraphicsManager;

import javax.swing.*;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * Window parameters class.
 */
public class WindowParameters {
    public static final int DEFAULT_CLOSE_ACTION = JFrame.DO_NOTHING_ON_CLOSE;//DISPOSE_ON_CLOSE;//

    private static final int[]
            WINDOW_SIZE_DEFAULT = new int[] {1300, 700},
            WINDOW_LOCATION_DEFAULT = new int[] {30, 30};

    private static final String WINDOW_TITLE_DEFAULT = "windowTitlePlaceholder";

    public String windowTitle;
    public int[]
            windowSize,
            windowLocation,
            drawSize;

    public boolean minimized, windowActive;

    public WindowParameters(@Nullable String windowTitle, @Nullable String version,
                            @Nullable int[] windowSize, @Nullable int[] windowLocation) {
        setWindowTitle(windowTitle, version);

        setWindowSize(windowSize);
        setWindowLocation(windowLocation);

        minimized = false;
        windowActive = true;
    }

    public void setWindowTitle(@Nullable String windowTitle, @Nullable String version) {
        String windowTitleString = Objects.requireNonNullElse(windowTitle, WINDOW_TITLE_DEFAULT);
        String versionString = Objects.requireNonNullElse(version, "versionNumberPlaceholder");

        this.windowTitle = windowTitleString + versionNumberAppendix(versionString);
    }

    private String versionNumberAppendix(@NotNull String versionNumber) {
        return " (version: " + versionNumber + ")";
    }

    public void setWindowSize(int[] windowSize) {
        this.windowSize = Objects.requireNonNullElse(windowSize, WINDOW_SIZE_DEFAULT);
    }

    public void setWindowLocation(int[] windowLocation) {
        this.windowLocation = Objects.requireNonNullElse(windowLocation, WINDOW_LOCATION_DEFAULT);
    }

    /**
     * Updates screen size and location.
     */
    public void updateWindowValues() {
        JFrame window = GraphicsManager.graphics.window;

        setWindowSize(new int[] {
                window.getWidth(),
                window.getHeight()});
        setWindowLocation(new int[] {
                window.getX(),
                window.getY()});
    }

    /**
     * Recalculates maximum sizes for total drawable area.
     */
    public void setDrawableSize() {
        GraphicsClass graphics = GraphicsManager.graphics.graphics;
        drawSize = new int[] {
                graphics.getWidth(),
                graphics.getHeight()};
    }
}