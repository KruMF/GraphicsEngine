package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 *
 * TODO: finish this and add javadoc
 */
public class Rotor {
    // gets maximum angular velocity (omega) from inner joint limits and maximum coriolis effect
    static double getAngularVelocityLimit() {
        double maxOmega_fromInnerJoint = Limits.JointLimits.getOmega();
        double maxOmega_fromCoriolis = Limits.HumanLimits.CoriolisLimits.getMaxOmega();

        return Math.max(
                maxOmega_fromInnerJoint,
                maxOmega_fromCoriolis);
    }

    // gets minimum radius for maximum gradient and maximum angular velocity (omega) at reference gravity
    static double getRadius() {
        double minRadius_fromGradient = Limits.HumanLimits.GradientLimits.getRadius();

        double omegaLimit = getAngularVelocityLimit();
        double minRadius_fromStandardGravity = Constants.getGravity() / Math.pow(omegaLimit, 2);

        return Math.max(
                minRadius_fromGradient,
                minRadius_fromStandardGravity);
    }

    // gets actual omega for given radius and constant reference acceleration
    static double getAngularVelocity(double radius) {
        return Math.sqrt(Constants.getGravity() / radius);
    }

    // gets the tangential velocity in [m/s] for given radius and angular velocity
    static double getTangentialVelocity(double radius, double angularVelocity) {
        return radius * angularVelocity;
    }
}