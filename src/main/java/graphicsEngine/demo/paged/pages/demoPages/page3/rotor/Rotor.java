package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.Limits;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 *
 * TODO: finish this and add javadoc
 */
public class Rotor {
    // gets maximum angular velocity (omega) from inner joint limits and maximum coriolis effect
    public static double getAngularVelocityLimit() {
        double maxOmega_fromInnerJoint = Limits.JointLimits.getOmega();
        double maxOmega_fromCoriolis = Limits.HumanLimits.CoriolisLimits.getMaxOmega();

        return Math.max(
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