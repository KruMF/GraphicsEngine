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

    public static Rotor rotor;

    public static ResultContainer results;

    static {
        environment = Environment.ROUGH;
        timeConstants = new TimeConstants(environment);
        generalConstants = new GeneralConstants(environment);
        preferences = new Preferences(environment);
    }

    public static void setRotor() {
        rotor = new Rotor();
    }

    public static void setResultContainer() {
        results = new ResultContainer();
    }

    // TODO: add javadoc
    public static double getGravity() {
        return generalConstants.standardGravity * preferences.gForce;
    }
}