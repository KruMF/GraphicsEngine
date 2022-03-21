package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Rotor;

// TODO: add javadoc
public class TotalOmegaLimitSection extends Section.NextSection {
    public TotalOmegaLimitSection() {
        super(null, new String[] {
                "Final maximum angular velocity: " + Rotor.getAngularVelocityLimit() + " rad / s"
        });
    }
}