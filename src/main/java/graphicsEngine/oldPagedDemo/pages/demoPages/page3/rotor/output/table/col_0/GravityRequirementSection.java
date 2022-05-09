package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.Data;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.Rotor;

import static graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.Utilities.roundNumber;

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