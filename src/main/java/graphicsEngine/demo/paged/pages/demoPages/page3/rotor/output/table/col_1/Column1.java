package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_1;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Column;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;

import java.util.ArrayList;

// TODO: add javadoc
public class Column1 extends Column {
    public Column1() {
        super(prepareSections(), DEFAULT_WIDTH);
    }

    private static ArrayList<? extends Section> prepareSections() {
        return new ArrayList<>() {{
            add(new ActualParametersSection());
            add(new OldInfoSection());
            // add more sections here
        }};
    }

    private static class ActualParametersSection extends Section.FirstSection {
        public ActualParametersSection() {
            super("Actual parameters", new String[] {
                    "actual parameters"
            });
        }
    }

    private static class OldInfoSection extends Section.NextSection {
        public OldInfoSection() {
            super("Old info", new String[] {
                    //"Standard gravity component: ~" + Math.round(Rotor.getRadius_fromStandardGravity()) + " m",
                    //"Gradient component: ~" + Math.round(Rotor.getRadius_fromForceGradient()) + " m",
                    //"Total rotor radius: ~" + Math.round(Rotor.getRadius()) + " m",
                    "",
                    //"Period: " + Limits.rotationPeriod() + " s",
                    //"Tangential velocity: ~" + Rotor.tangentialVelocity() + " m/s",
                    //"Coriolis effect: " + Limits.HumanLimits.CoriolisLimits.getCoriolis(Rotor.angularVelocity()) + " m/s^2"
                    //        + ", when moving at: " + Limits.HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED + " m/s"
            });
        }
    }
}