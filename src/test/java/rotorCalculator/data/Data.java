package rotorCalculator.data;

import rotorCalculator.data.rotorData.*;

/**
 * A class for containing data for calculations.
 */
public class Data {
    public static Environment environment;
    public static StandardConstants standardConstants;
    public static GeneralConstants generalConstants;
    public static Preferences preferences;

    static {
        environment = Environment.ROUGH;
        standardConstants = new StandardConstants(environment);
        generalConstants = new GeneralConstants(environment);
        preferences = new Preferences(environment);
    }

    // TODO: add javadoc
    public static double getGravity() {
        return generalConstants.standardGravity * preferences.gForce;
    }

    public static final int MAX_X = 200;
    private static int x;

    //add more parameters here

    public static void resetValues() {
        resetX();
    }

    public static void resetX() {
        x = 0;
    }

    public static int getX() {
        return x;
    }

    public static void incrementX() {
        x++;
    }
}