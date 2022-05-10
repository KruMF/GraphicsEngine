package rotorCalculator.humanModel;

import rotorCalculator.data.Data;

// TODO: add javadoc
public class RotationalLimits {
    // TODO: add javadoc
    public static class GradientLimits {
        // difference of force between top and bottom as a fraction
        // arbitrary number, corresponding to 5%
        public static final double MAX_FORCE_GRADIENT = 0.05;

        // average human height [m]
        public static final double HEIGHT = 1.80;

        /**
         * Gets minimum radius for reference force gradient and average height.
         *
         * @return Minimum radius in [m].
         */
        public static double getRadius() {
            return HEIGHT / MAX_FORCE_GRADIENT;
        }
    }

    // TODO: add javadoc
    public static class CoriolisLimits {
        // maximum running speed for coriolis calculation [m/s]
        // somewhat arbitrary number
        public static final double REFERENCE_RUNNING_SPEED = 10;

        // maximum permissible sideways acceleration due to Coriolis effect [number of g's]
        // arbitrary number, corresponding to 20%
        public static final double MAX_CORIOLIS = 0.2;

        /**
         * Gets maximum coriolis effect for reference running speed and provided angular velocity.
         *
         * @param omega Angular velocity in [rad / s]
         * @return Coriolis effect (acceleration in [m / s^2]).
         */
        public static double getCoriolis(double omega) {
            return 2 * REFERENCE_RUNNING_SPEED * omega;
        }

        /**
         * Gets maximum angular velocity (omega) for defined conditions.
         *
         * @return Angular velocity in [rad / s].
         */
        public static double getMaxOmega() {
            return (MAX_CORIOLIS * Data.generalConstants.standardGravity) / (2 * REFERENCE_RUNNING_SPEED);
        }
    }
}