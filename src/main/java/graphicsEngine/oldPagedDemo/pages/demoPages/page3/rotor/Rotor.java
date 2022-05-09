package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Limits;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.StandardConstants;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 *
 * TODO: finish this and add javadoc
 */
public class Rotor {
    //converts period to omega
    public static double getAngularVelocityFromPeriod(double period) {
        return 2 * Math.PI / period;
    }

    //converts omega to period
    public static double getPeriodFromAngularVelocity(double angularVelocity) {
        return 2 * Math.PI / angularVelocity;
    }

    //converts period to RPM
    public static double getRPMFromPeriod(double period) {
        return StandardConstants.SECONDS_IN_MINUTE / period;
    }

    // gets maximum angular velocity (omega) from inner joint limits and maximum coriolis effect
    public static double getAngularVelocityLimit() {
        double maxOmega_fromInnerJoint = Limits.JointLimits.getOmega();
        double maxOmega_fromCoriolis = Limits.HumanLimits.CoriolisLimits.getMaxOmega();

        return Math.min(
                maxOmega_fromInnerJoint,
                maxOmega_fromCoriolis);
    }

    public static double getRadiusFromGravity() {
        double omegaLimit = getAngularVelocityLimit();
        return Data.getGravity() / Math.pow(omegaLimit, 2);
    }

    // gets minimum radius for maximum gradient and maximum angular velocity (omega) at reference gravity
    public static double getRadiusLimit() {
        double minRadius_fromGradient = Limits.HumanLimits.GradientLimits.getRadius();
        double minRadius_fromStandardGravity = getRadiusFromGravity();

        return Math.max(
                minRadius_fromGradient,
                minRadius_fromStandardGravity);
    }

    // gets actual omega for given radius and constant reference acceleration
    public static double getAngularVelocity(double radius) {
        return Math.sqrt(Data.getGravity() / radius);
    }

    // gets the tangential velocity in [m/s] for given radius and angular velocity
    public static double getTangentialVelocity(double radius, double angularVelocity) {
        return radius * angularVelocity;
    }
}