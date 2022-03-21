package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.col_0;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.table.Section;
import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.data.Limits;

// TODO: add javadoc
public class JointLimitSection extends Section.FirstSection {
    public JointLimitSection() {
        super("Inner joint limits", new String[] {
                "max tangential speed: " + Limits.JointLimits.getTangentialVelocity() + " m/s",
                "reference radius: " + Limits.JointLimits.INNER_RADIUS + " m",
                "rotational period: " + Limits.JointLimits.getRotationPeriod() + " s",
                "RPM: " + Limits.JointLimits.MAX_RPM,
                "angular velocity: " + Limits.JointLimits.getOmega() + " rad/s"
        });
    }
}