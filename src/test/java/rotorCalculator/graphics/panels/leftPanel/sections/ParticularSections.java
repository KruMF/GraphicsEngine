package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;

import javax.swing.*;
import java.awt.*;

import com.google.inject.internal.Nullable;

public interface ParticularSections {

    // TODO: finish this and add javadoc
    class JointLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        // TODO: add title: "Inner joint limits"

        public JointLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new MaxTangentialSpeedLabel(colors.text, colors.border));
            p.add(new ReferenceRadiusLabel(colors.text, colors.border));
            p.add(new RotationalPeriodLabel(colors.text, colors.border));
            p.add(new RPMLabel(colors.text, colors.border));
            p.add(new AngularVelocityLabel(colors.text, colors.border));
        }

        private static class MaxTangentialSpeedLabel extends SectionLabel {
            protected MaxTangentialSpeedLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Max tangential speed: ";
                int value = 0; //roundNumber(JointLimits.getTangentialVelocity(), 2)
                String units = " m/s";
                return label + value + units;
            }
        }

        private static class ReferenceRadiusLabel extends SectionLabel {
            protected ReferenceRadiusLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Reference radius: ";
                int value = 0; //roundNumber(JointLimits.INNER_RADIUS, 3)
                String units = " m";
                return label + value + units;
            }
        }

        private static class RotationalPeriodLabel extends SectionLabel {
            protected RotationalPeriodLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Rotational period: ";
                int value = 0; //roundNumber(JointLimits.getRotationPeriod(), 2)
                String units = " s";
                return label + value + units;
            }
        }

        private static class RPMLabel extends SectionLabel {
            protected RPMLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "RPM: ";
                int value = 0; //roundNumber(JointLimits.MAX_RPM, 2)
                String units = "";
                return label + value + units;
            }
        }

        private static class AngularVelocityLabel extends SectionLabel {
            protected AngularVelocityLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Angular velocity: ";
                int value = 0; //roundNumber(JointLimits.getOmega(), 3)
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    class CoriolisLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public CoriolisLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO:
        // title: "Coriolis effect limits"
        // show values:
        //  * Max Coriolis effect:
        //      - roundNumber(RotationalLimits.CoriolisLimits.getCoriolis(omega), 3) + " m/s^2"
        //      - " (" + roundNumber(RotationalLimits.CoriolisLimits.MAX_CORIOLIS * 100, 2) + " %g)"
        //  * Reference running speed:
        //      - roundNumber(RotationalLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED, 1) + " m/s"
        //  * Maximum angular velocity:
        //      - roundNumber(omega, 3) + " rad/s"

        /*
        // TODO: finish this
        String label = ": ";
        int value = 0; //
        String units = " ";
                return label + value + units;
        */
    }

    class TotalOmegaLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public TotalOmegaLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO:
        // title: null
        // show values:
        //  * Final maximum angular velocity:
        //      - roundNumber(Rotor.getAngularVelocityLimit(), 3) + " rad/s"
    }

    class GravityRequirementSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public GravityRequirementSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO:
        // title: "Standard gravity requirements"
        // show values:
        //  * G-force:
        //      - roundNumber(Data.preferences.gForce, 2) + " G"
        //  * Acceleration:
        //      - roundNumber(Data.getGravity(), 3) + " m/s^2"
        //  * minimum rotor radius:
        //      - roundNumber(Rotor.getRadiusFromGravity(), 3) + " m"
    }

    class GradientLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public GradientLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO:
        // title: "Force gradient limits"
        // show values:
        //  * Gradient:
        //      - roundNumber(RotationalLimits.GradientLimits.MAX_FORCE_GRADIENT * 100,2) + " %"
        //  * Reference height:
        //      - roundNumber(RotationalLimits.GradientLimits.HEIGHT, 2) + " m"
        //  * Minimum rotor radius:
        //      - roundNumber(RotationalLimits.GradientLimits.getRadius(), 3) + " m"
    }

    class TotalRadiusLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public TotalRadiusLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO:
        // title: null
        // show values:
        //  * Final minimum rotor radius:
        //      - roundNumber(Rotor.getRadiusLimit(), 3) + " m"
    }

    class ActualParameterSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public ActualParameterSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
        }

        //TODO: show actual values for selected rotor:
        //  * radius
        //      - roundNumber(radius, 3) + " m"
        //  * angular velocity
        //      - roundNumber(omega, 3) + " rad/s"
        //  * RPM
        //      - roundNumber(Rotor.getRPMFromPeriod(period), 2)
        //  * rotational period
        //      - roundNumber(period, 2) + " s"
        //  * tangential velocity
        //      - roundNumber(Rotor.getTangentialVelocity(radius, omega), 1) + " m/s"
    }
}