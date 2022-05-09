package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.*;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Environment;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.GeneralConstants;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Preferences;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.StandardConstants;

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