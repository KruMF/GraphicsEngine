package rotorCalculator.data;

import rotorCalculator.data.constants.Environment;
import rotorCalculator.data.constants.GeneralConstants;
import rotorCalculator.data.constants.TimeConstants;
import rotorCalculator.data.rotorModel.*;
import rotorCalculator.data.rotorModel.results.ResultContainer;

/**
 * A class for containing data for calculations.
 */
public class Data {
    public static Environment environment;
    public static TimeConstants timeConstants;
    public static GeneralConstants generalConstants;
    public static Preferences preferences;

    public static ResultContainer results;

    public static void setResultContainer() {
        results = new ResultContainer();
    }

    static {
        environment = Environment.ROUGH;
        timeConstants = new TimeConstants(environment);
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