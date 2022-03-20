package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 */
public class Rotor {

    static double getRadius() {
        return Math.max(
                getRadius_fromStandardGravity(),
                getRadius_fromForceGradient());
    }

    static double getRadius_fromStandardGravity() {
        return Constants.STANDARD_GRAVITY / Math.pow(angularVelocity(), 2);
    }

    private static double angularVelocity() {
        return 2 * Math.PI / Limits.rotationPeriod();
    }

    static double getRadius_fromForceGradient() {
        return Limits.HumanLimits.HEIGHT / Limits.HumanLimits.MAX_FORCE_GRADIENT;
    }

    static double tangentialVelocity() {
        return angularVelocity() * getRadius();
    }

    static double getCoriolis() {
        return 2 * Limits.HumanLimits.RUNNING_SPEED * angularVelocity();
    }
}