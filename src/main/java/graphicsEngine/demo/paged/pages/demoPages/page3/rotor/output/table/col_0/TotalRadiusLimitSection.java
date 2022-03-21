package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.Rotor;

// TODO: add javadoc
public class TotalRadiusLimitSection extends Section.NextSection {
    public TotalRadiusLimitSection() {
        super(null, new String[] {
                "Final minimum rotor radius: " + Rotor.getRadiusLimit() + " m"
        });
    }
}