package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.Limits;

import static graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.Utilities.roundNumber;

// TODO: add javadoc
public class CoriolisLimitSection extends Section.NextSection {
    public CoriolisLimitSection() {
        super("Coriolis effect limits", prepareData());
    }

    private static String[] prepareData() {
        double omega = Limits.HumanLimits.CoriolisLimits.getMaxOmega();
        return new String[] {
                "Max Coriolis effect: "
                        + roundNumber(Limits.HumanLimits.CoriolisLimits.getCoriolis(omega), 3)
                        + " m/s^2"
                        + " ("
                        + roundNumber(Limits.HumanLimits.CoriolisLimits.MAX_CORIOLIS * 100, 2)
                        + " %g)",
                "Reference running speed: "
                        + roundNumber(Limits.HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED, 1)
                        + " m/s",
                "Maximum angular velocity: "
                        + roundNumber(omega, 3)
                        + " rad/s"
        };
    }
}