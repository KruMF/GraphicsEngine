package graphicsEngine.data;

import graphicsEngine.GraphicsClass;
import graphicsEngine.GraphicsManager;

import javax.swing.*;

public class WindowParameters {
    private static final String saveFilePath = "userData/windowPreferences";

    public static final int defaultCloseAction = JFrame.DO_NOTHING_ON_CLOSE;//DISPOSE_ON_CLOSE;//
    public boolean minimized, windowActive;

    public String windowTitle;
    public int[]
            windowSize,
            windowLocation,
            drawSize;

    protected WindowParameters(boolean load) {
        String versionNumber = "versionNumberPlaceholder";
        windowTitle = "windowTitlePlaceholder (version: " + versionNumber + ")";

        minimized = false;
        windowActive = true;

        if (!load || !loadSavedValues()) {
            defaultValues();
        }
    }

    private boolean loadSavedValues() {
        // ArrayList<String[]> readLines = FileHandler.readText(saveFilePath);
        // if (readLines != null) {
        //     System.out.println("Trying to load saved window parameters.");
        //     for (String[] row : readLines){
        //         switch (row[0]){
        //             case "windowSize" -> windowSize = new int[]{
        //                     Integer.parseInt(row[1]),
        //                     Integer.parseInt(row[2])};
        //             case "windowLocation" -> windowLocation = new int[]{
        //                     Integer.parseInt(row[1]),
        //                     Integer.parseInt(row[2])};
        //             default -> {}
        //         }
        //     }
        //     return true;
        // }
        System.out.println("Parameters not saved - nothing to load.");
        return false;
    }

    private void defaultValues() {
        System.out.println("Using default window parameters.");
        windowSize = new int[] {1300, 700};
        windowLocation = new int[] {30, 30};
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
        drawSize = new int[]{graphics.getWidth(), graphics.getHeight()};
    }

    /**
     * Saves window size and location to a file.
     */
    public void saveValues() {
        System.out.println("Saving window parameters.");
        // FileHandler.writeText(saveFilePath, new ArrayList<>(){{
        //     add(new String[]{
        //             "windowSize",
        //             Integer.toString(windowSize[0]),
        //             Integer.toString(windowSize[1])});
        //     add(new String[]{
        //             "windowLocation",
        //             Integer.toString(windowLocation[0]),
        //             Integer.toString(windowLocation[1])});
        // }});
    }
}