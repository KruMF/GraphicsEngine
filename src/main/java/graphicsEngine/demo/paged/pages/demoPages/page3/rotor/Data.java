package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.*;

// TODO: finish this and add javadoc
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
}