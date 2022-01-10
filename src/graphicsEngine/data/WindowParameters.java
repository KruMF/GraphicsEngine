package graphicsEngine.data;

import graphicsEngine.GraphicsClass;
import graphicsEngine.GraphicsManager;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Window parameters class.
 */
public class WindowParameters {
    public static final int defaultCloseAction = JFrame.DO_NOTHING_ON_CLOSE;//DISPOSE_ON_CLOSE;//
    public boolean minimized, windowActive;

    public String windowTitle;
    public int[]
            windowSize,
            windowLocation,
            drawSize;

    private static final String
            WINDOW_SIZE_KEY = "windowSize",
            WINDOW_LOCATION_KEY = "windowLocation";

    /**
     * Creates window parameters.
     *
     * @param outsideDataLines ArrayList of outside data lines separated as arrays of strings.
     *                         (Leave null for default values)
     */
    protected WindowParameters(ArrayList<String[]> outsideDataLines) {
        defaultValues();
        loadOutsideData(outsideDataLines);
    }

    /**
     * Prepares default window parameters.
     */
    private void defaultValues() {
        System.out.println("Applying default window parameters.");

        String versionNumber = "versionNumberPlaceholder";
        windowTitle = "windowTitlePlaceholder (version: " + versionNumber + ")";

        windowSize = new int[] {1300, 700};
        windowLocation = new int[] {30, 30};

        minimized = false;
        windowActive = true;
    }

    /**
     * Overwrites window parameters with imported values.
     *
     * @param readLines ArrayList of outside data lines separated as arrays of strings.
     */
    private void loadOutsideData(ArrayList<String[]> readLines) {
        if (readLines != null && readLines.size() > 0) {
            System.out.println("Trying to load passed window parameters.");
            for (String[] row : readLines) {
                 if (row != null && row.length >= 2) {
                     outsideDataSwitch(row);
                 }
            }
        }
        System.out.println("Parameters not loaded - null or empty lines.");
    }

    /**
     * Overwrites single window parameter with a row of imported data.
     *
     * @param row Single row of imported data.
     */
    private void outsideDataSwitch(String[] row) {
        switch (row[0]) {
            case WINDOW_SIZE_KEY -> {
                if (row.length == 3) {
                    windowSize = new int[] {
                            Integer.parseInt(row[1]),
                            Integer.parseInt(row[2])};
                }
            }
            case WINDOW_LOCATION_KEY -> {
                if (row.length == 3) {
                    windowLocation = new int[] {
                            Integer.parseInt(row[1]),
                            Integer.parseInt(row[2])};
                }
            }
            default -> {}
        }
    }

    /**
     * Prepares window parameters for exporting.
     *
     * @return An arraylist of arrays of strings containing keys and values .
     */
    public ArrayList<String[]> getValuesForExport() {
        System.out.println("Exporting window parameters.");

        return new ArrayList<>() {{
            add(new String[] {
                    WINDOW_SIZE_KEY,
                    String.valueOf(windowSize[0]),
                    String.valueOf(windowSize[1])
            });
            add(new String[] {
                    WINDOW_LOCATION_KEY,
                    String.valueOf(windowLocation[0]),
                    String.valueOf(windowLocation[1])
            });
        }};
    }

    /**
     * Updates screen size and location.
     */
    public void updateWindowValues() {
        JFrame window = GraphicsManager.graphics.window;

        windowSize = new int[] {window.getWidth(), window.getHeight()};
        windowLocation = new int[] {window.getX(), window.getY()};
    }

    /**
     * Recalculates maximum sizes for total drawable area.
     */
    public void setDrawableSize() {
        GraphicsClass graphics = GraphicsManager.graphics.graphics;
        drawSize = new int[] {graphics.getWidth(), graphics.getHeight()};
    }
}