package rotorCalculator.data.rotorModel.limits;

import rotorCalculator.data.Data;

// TODO: add javadoc
public class HumanLimits {
    // TODO: add javadoc
    public static class GradientLimits {
        public static final double
                MAX_FORCE_GRADIENT = 0.05,  // difference of force between top and bottom as a fraction
                HEIGHT = 1.80;              // average human height [m]

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
        public static final double
                REFERENCE_RUNNING_SPEED = 10, // [m/s]
                MAX_CORIOLIS = 0.2; // maximum sideways acceleration [number of g's]

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
