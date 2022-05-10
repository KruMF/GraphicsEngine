package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.Data;
import rotorCalculator.data.Rotor;
import rotorCalculator.data.output.table.Section;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class GravityRequirementSection extends Section.NextSection {
    public GravityRequirementSection() {
        super("Standard gravity requirements", prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "G-force: "
                        + roundNumber(Data.preferences.gForce, 2)
                        + " G",
                "Acceleration: "
                        + roundNumber(Data.getGravity(), 3)
                        + " m/s^2",
                "minimum rotor radius: "
                        + roundNumber(Rotor.getRadiusFromGravity(), 3)
                        + " m"
        };
    }
}