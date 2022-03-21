package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.Limits;

// TODO: add javadoc
public class GradientLimitSection extends Section.NextSection {
    public GradientLimitSection() {
        super("Force gradient limits", prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "Gradient: " + (Limits.HumanLimits.GradientLimits.MAX_FORCE_GRADIENT * 100) + " %",
                "Reference height: " + Limits.HumanLimits.GradientLimits.HEIGHT + " m",
                "Minimum rotor radius: " + Limits.HumanLimits.GradientLimits.getRadius() + " m"
        };
    }
}