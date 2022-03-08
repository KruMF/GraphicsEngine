package graphicsEngine.demo.paged.pages.demoPages.page3;

/**
 * Calculates the size of a rotating living habitat for living in a weightless environment.
 */
class Calculator {
    static final double
            MAX_RPM = 2,                // revolutions per minute
            STANDARD_GRAVITY = 9.80665, // acceleration [m / s^2]
            MAX_FORCE_GRADIENT = 0.05,  // fraction of difference between bottom to top
            ROTOR_THICKNESS = 2,        // [m]
            MAX_HUMAN_VELOCITY = 10;    // [m/s]

    static double getRadius() {
        return Math.max(
                getRadius_fromStandardGravity(),
                getRadius_fromForceGradient());
    }

    static double getRadius_fromStandardGravity() {
        return STANDARD_GRAVITY / Math.pow(angularVelocity(), 2);
    }

    private static double angularVelocity() {
        return 2 * Math.PI / rotationPeriod();
    }

    static double rotationPeriod() {
        int secondsInMinute = 60;
        return secondsInMinute / MAX_RPM;
    }

    static double getRadius_fromForceGradient() {
        return ROTOR_THICKNESS / MAX_FORCE_GRADIENT;
    }

    static double tangentialVelocity() {
        return angularVelocity() * getRadius();
    }

    static double getCoriolis() {
        return 2 * MAX_HUMAN_VELOCITY * angularVelocity();
    }
}