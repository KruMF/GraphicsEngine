package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.output.table.Section;
import rotorCalculator.data.rotorModel.limits.HumanLimits;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class CoriolisLimitSection extends Section.NextSection {
    public CoriolisLimitSection() {
        super("Coriolis effect limits", prepareData());
    }

    private static String[] prepareData() {
        double omega = HumanLimits.CoriolisLimits.getMaxOmega();
        return new String[] {
                "Max Coriolis effect: "
                        + roundNumber(HumanLimits.CoriolisLimits.getCoriolis(omega), 3)
                        + " m/s^2"
                        + " ("
                        + roundNumber(HumanLimits.CoriolisLimits.MAX_CORIOLIS * 100, 2)
                        + " %g)",
                "Reference running speed: "
                        + roundNumber(HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED, 1)
                        + " m/s",
                "Maximum angular velocity: "
                        + roundNumber(omega, 3)
                        + " rad/s"
        };
    }
}