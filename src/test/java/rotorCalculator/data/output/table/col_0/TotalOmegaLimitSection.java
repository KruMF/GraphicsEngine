package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.Rotor;
import rotorCalculator.data.output.table.Section;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class TotalOmegaLimitSection extends Section.NextSection {
    public TotalOmegaLimitSection() {
        super(null, prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "Final maximum angular velocity: "
                        + roundNumber(Rotor.getAngularVelocityLimit(), 3)
                        + " rad / s"
        };
    }
}