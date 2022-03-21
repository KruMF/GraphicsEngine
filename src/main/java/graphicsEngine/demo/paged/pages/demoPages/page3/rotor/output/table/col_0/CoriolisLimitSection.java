package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;

// TODO: add javadoc
public class CoriolisLimitSection extends Section.NextSection {
    public CoriolisLimitSection() {
        super("Coriolis effect limits", new String[] {
                "Max Coriolis effect: " + " m/s^2 (" + " g)",
                "Reference running speed: " + " m/s",
                "Maximum angular velocity: " + " rad/s"
        });
    }
}