package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.Rotor;

import static graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.Utilities.roundNumber;

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