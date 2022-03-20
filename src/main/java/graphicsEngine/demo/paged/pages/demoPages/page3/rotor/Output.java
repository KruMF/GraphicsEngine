package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

/**
 * Helper class for handling output data for rotor.
 */
public class Output {

    /**
     * Prepare output info as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] outputStringArray() {
        return new String[] {
                "Standard gravity component: ~" + Math.round(Rotor.getRadius_fromStandardGravity()) + " m",
                "Gradient component: ~" + Math.round(Rotor.getRadius_fromForceGradient()) + " m",
                "Total rotor radius: ~" + Math.round(Rotor.getRadius()) + " m",
                "",
                "Period: " + Limits.rotationPeriod() + " s",
                "Tangential velocity: ~" + Rotor.tangentialVelocity() + " m/s",
                "Coriolis effect: " + Rotor.getCoriolis() + " m/s^2"
                        + ", when moving at: " + Limits.HumanLimits.RUNNING_SPEED + " m/s"
        };
    }
}