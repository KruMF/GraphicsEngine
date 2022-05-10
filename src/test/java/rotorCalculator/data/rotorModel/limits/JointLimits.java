package rotorCalculator.data.rotorModel.limits;

import rotorCalculator.data.rotorModel.Rotor;
import rotorCalculator.data.constants.TimeConstants;

/**
 * A class containing rotational limits for inner joint.
 */
public class JointLimits {
    public static final double
            INNER_RADIUS = 5.00,    // radius of the joint, [m]
            MAX_RPM = 2.00;         // max revolutions per minute for inner rotating joint

    /**
     * Gets rotation period in seconds at maximum RPM.
     *
     * @return rotation period in seconds at maximum RPM.
     */
    public static double getRotationPeriod() {
        return TimeConstants.SECONDS_IN_MINUTE / MAX_RPM;
    }

    /**
     * Gets angular velocity at max RPM.
     *
     * @return Angular velocity in [rad / s].
     */
    public static double getOmega() {
        return Rotor.getAngularVelocityFromPeriod(getRotationPeriod());
    }

    /**
     * Gets the tangential velocity for the joint at maximum angular velocity.
     *
     * @return Velocity in [m / s].
     */
    public static double getTangentialVelocity() {
        return getOmega() * INNER_RADIUS;
    }
}
