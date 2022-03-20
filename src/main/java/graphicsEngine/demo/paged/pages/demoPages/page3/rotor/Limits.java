package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

public class Limits {
    public static final double
            MAX_RPM = 2; // max revolutions per minute for inner rotating joint

    /**
     * Get rotation period in seconds at maximum RPM.
     *
     * @return rotation period in seconds at maximum RPM.
     */
    public static double rotationPeriod() {
        return Constants.SECONDS_IN_MINUTE / MAX_RPM;
    }

    public static class HumanLimits {
        public static final double
                MAX_FORCE_GRADIENT = 0.05,  // difference of force between top and bottom as a fraction
                HEIGHT = 1.80,              // ceiling height [m]
                RUNNING_SPEED = 10;         // maximum running speed [m/s]
    }
}