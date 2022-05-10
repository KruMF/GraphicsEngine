package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.rotorModel.Rotor;
import rotorCalculator.data.output.table.Section;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class TotalRadiusLimitSection extends Section.NextSection {
    public TotalRadiusLimitSection() {
        super(null, prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "Final minimum rotor radius: "
                        + roundNumber(Rotor.getRadiusLimit(), 3)
                        + " m"
        };
    }
}