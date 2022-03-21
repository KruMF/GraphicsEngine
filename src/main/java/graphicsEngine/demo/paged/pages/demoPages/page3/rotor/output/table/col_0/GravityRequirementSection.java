package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Data;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Rotor;

// TODO: add javadoc
public class GravityRequirementSection extends Section.NextSection {
    public GravityRequirementSection() {
        super("Standard gravity requirements", new String[] {
                "G-force: " + Data.preferences.gForce + " G",
                "Acceleration: " + Data.getGravity() + " m/s^2",
                "minimum rotor radius: " + Rotor.getRadiusFromGravity() + " m"
        });
    }
}