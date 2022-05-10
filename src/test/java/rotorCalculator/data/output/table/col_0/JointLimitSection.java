package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.rotorData.Limits;
import rotorCalculator.data.output.table.Section;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class JointLimitSection extends Section.FirstSection {
    public JointLimitSection() {
        super("Inner joint limits", prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "max tangential speed: "
                        + roundNumber(Limits.JointLimits.getTangentialVelocity(), 2)
                        + " m/s",
                "reference radius: "
                        + roundNumber(Limits.JointLimits.INNER_RADIUS, 3)
                        + " m",
                "rotational period: "
                        + roundNumber(Limits.JointLimits.getRotationPeriod(), 2)
                        + " s",
                "RPM: "
                        + roundNumber(Limits.JointLimits.MAX_RPM, 2),
                "angular velocity: "
                        + roundNumber(Limits.JointLimits.getOmega(), 3)
                        + " rad/s"
        };
    }
}