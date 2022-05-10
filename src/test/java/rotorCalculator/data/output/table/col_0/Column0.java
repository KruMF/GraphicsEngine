package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.output.table.Column;
import rotorCalculator.data.output.table.Section;

import java.util.ArrayList;

// TODO: add javadoc
public class Column0 extends Column {
    public Column0() {
        super(prepareSections(), DEFAULT_WIDTH);
    }

    private static ArrayList<? extends Section> prepareSections() {
        return new ArrayList<>() {{
            // angular velocity limits
            add(new JointLimitSection());
            add(new CoriolisLimitSection());
            add(new TotalOmegaLimitSection());

            // radius limits
            add(new GravityRequirementSection());
            add(new GradientLimitSection());
            add(new TotalRadiusLimitSection());
        }};
    }
}