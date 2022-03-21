package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.Limits;

// TODO: add javadoc
public class CoriolisLimitSection extends Section.NextSection {
    public CoriolisLimitSection() {
        super("Coriolis effect limits", coriolisData());
    }

    private static String[] coriolisData() {
        double omega = Limits.HumanLimits.CoriolisLimits.getMaxOmega();
        return new String[] {
                "Max Coriolis effect: " + Limits.HumanLimits.CoriolisLimits.getCoriolis(omega) + " m/s^2"
                        + " (" + Limits.HumanLimits.CoriolisLimits.MAX_CORIOLIS + " g)",
                "Reference running speed: " + Limits.HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED + " m/s",
                "Maximum angular velocity: " + omega + " rad/s"
        };
    }
}