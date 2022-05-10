package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.output.table.Section;
import rotorCalculator.data.rotorModel.limits.JointLimits;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class JointLimitSection extends Section.FirstSection {
    public JointLimitSection() {
        super("Inner joint limits", prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "max tangential speed: "
                        + roundNumber(JointLimits.getTangentialVelocity(), 2)
                        + " m/s",
                "reference radius: "
                        + roundNumber(JointLimits.INNER_RADIUS, 3)
                        + " m",
                "rotational period: "
                        + roundNumber(JointLimits.getRotationPeriod(), 2)
                        + " s",
                "RPM: "
                        + roundNumber(JointLimits.MAX_RPM, 2),
                "angular velocity: "
                        + roundNumber(JointLimits.getOmega(), 3)
                        + " rad/s"
        };
    }
}