package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

/**
 * Helper class for handling output data for rotor.
 */
public class Output {
    private static String lineSeparator() {
        return "----------";
    }

    /**
     * Prepare output info for first column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] firstColumnStringArray() {
        return new String[] {
                "Inner rotor limits:",
                "radius, tangential v, period, max omega",
                "",
                "Coriolis limits (for a human):",
                "",
                "",
                "total max omega: " + " rad / s",
                "",
                lineSeparator(),
                "Standard gravity requirements:",
                "G-force: " + " G",
                "minimum rotor radius: " + " m",
                "",
                "Force gradient limits (for a human):",
                "gradient: " + " % at height: " + " m",
                "minimum rotor radius: " + " m",
                "",
                "total minimum rotor radius: " + " m",
                "",
        };
    }

    /**
     * Prepare output info for second column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] secondColumnStringArray() {
        return new String[]{
                lineSeparator(),
                "actual parameters",
                "",
                lineSeparator(),
                "old info:",
                "",
                //"Standard gravity component: ~" + Math.round(Rotor.getRadius_fromStandardGravity()) + " m",
                //"Gradient component: ~" + Math.round(Rotor.getRadius_fromForceGradient()) + " m",
                //"Total rotor radius: ~" + Math.round(Rotor.getRadius()) + " m",
                "",
                //"Period: " + Limits.rotationPeriod() + " s",
                //"Tangential velocity: ~" + Rotor.tangentialVelocity() + " m/s",
                //"Coriolis effect: " + Limits.HumanLimits.CoriolisLimits.getCoriolis(Rotor.angularVelocity()) + " m/s^2"
                //        + ", when moving at: " + Limits.HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED + " m/s"
        };
    }

    /**
     * Prepare output info for third column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] thirdColumnStringArray() {
        return new String[]{
                ""
        };
    }
}