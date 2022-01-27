package graphicsEngine.data.windowParameters;

import java.util.ArrayList;

public class IOextension {
    private static final String
            WINDOW_SIZE_KEY = "windowSize",
            WINDOW_LOCATION_KEY = "windowLocation";

    /**
     * Creates window parameters.
     *
     * @param outsideDataLines ArrayList of outside data lines separated as arrays of strings.
     *                         (Leave null for default values)
     */
    public IOextension(ArrayList<String[]> outsideDataLines) {
        //defaultValues();
        loadOutsideData(outsideDataLines);
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
                    /*windowSize = new int[] {
                            Integer.parseInt(row[1]),
                            Integer.parseInt(row[2])};*/
                }
            }
            case WINDOW_LOCATION_KEY -> {
                if (row.length == 3) {
                    /*windowLocation = new int[] {
                            Integer.parseInt(row[1]),
                            Integer.parseInt(row[2])};*/
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
            /*add(new String[] {
                    WINDOW_SIZE_KEY,
                    String.valueOf(windowSize[0]),
                    String.valueOf(windowSize[1])
            });
            add(new String[] {
                    WINDOW_LOCATION_KEY,
                    String.valueOf(windowLocation[0]),
                    String.valueOf(windowLocation[1])
            });*/
        }};
    }
}