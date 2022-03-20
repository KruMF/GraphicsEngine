package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Column;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;

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