package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

/**
 * A class for containing general constants.
 */
public class Constants {

    // time unit conversion constants

    public static final int
            SECONDS_IN_MINUTE = 60,
            MINUTES_IN_HOUR = 60,
            HOURS_IN_DAY = 24;


    // physical constants

    public static final double STANDARD_GRAVITY = 9.80665; // acceleration [m / s^2]


    // preferences

    static final double G_FORCE = 1.00; // acceleration [g's]

    // TODO: add javadoc
    static double getGravity() {
        return G_FORCE * Constants.STANDARD_GRAVITY;
    }


    // add more constants here
}