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

        // TODO: add title: "Coriolis effect limits"

        public CoriolisLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new MaxCoriolisEffectLabel(colors.text, colors.border));
            p.add(new ReferenceRunningSpeedLabel(colors.text, colors.border));
            p.add(new MaxAngularVelocityLabel(colors.text, colors.border));
        }

        private static class MaxCoriolisEffectLabel extends SectionLabel {
            protected MaxCoriolisEffectLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Max Coriolis effect: ";
                int value = 0; //roundNumber(RotationalLimits.CoriolisLimits.getCoriolis(omega), 3)
                String units = " m/s^2";
                //TODO:
                // also add:
                //      " (" + roundNumber(RotationalLimits.CoriolisLimits.MAX_CORIOLIS * 100, 2) + " %g)"
                return label + value + units;
            }
        }

        private static class ReferenceRunningSpeedLabel extends SectionLabel {
            protected ReferenceRunningSpeedLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Reference running speed: ";
                int value = 0; //roundNumber(RotationalLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED, 1)
                String units = " m/s";
                return label + value + units;
            }
        }

        private static class MaxAngularVelocityLabel extends SectionLabel {
            protected MaxAngularVelocityLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Maximum angular velocity: ";
                int value = 0; //roundNumber(omega, 3)
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    class TotalOmegaLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        //TODO: set no title

        public TotalOmegaLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new FinalMaxAngularVelocityLabel(colors.text, colors.border));
        }

        private static class FinalMaxAngularVelocityLabel extends SectionLabel {
            protected FinalMaxAngularVelocityLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Final maximum angular velocity: ";
                int value = 0; //roundNumber(Rotor.getAngularVelocityLimit(), 3)
                String units = " rad/s";
                return label + value + units;
            }
        }
    }

    class GravityRequirementSection extends AbstractSection {
        public static final int HEIGHT = 150;

        // TODO: add title: "Standard gravity requirements"

        public GravityRequirementSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new GForceLabel(colors.text, colors.border));
            p.add(new AccelerationLabel(colors.text, colors.border));
            p.add(new MinimumRadiusLabel(colors.text, colors.border));
        }

        private static class GForceLabel extends SectionLabel {
            protected GForceLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "G-force: ";
                int value = 0; //roundNumber(Data.preferences.gForce, 2)
                String units = " G";
                return label + value + units;
            }
        }

        private static class AccelerationLabel extends SectionLabel {
            protected AccelerationLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Acceleration: ";
                int value = 0; //roundNumber(Data.getGravity(), 3)
                String units = " m/s^2";
                return label + value + units;
            }
        }

        private static class MinimumRadiusLabel extends SectionLabel {
            protected MinimumRadiusLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Minimum rotor radius: ";
                int value = 0; //roundNumber(Rotor.getRadiusFromGravity(), 3)
                String units = " m";
                return label + value + units;
            }
        }
    }

    class GradientLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        // TODO: add title: "Force gradient limits"

        public GradientLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new GradientLabel(colors.text, colors.border));
            p.add(new ReferenceHeightLabel(colors.text, colors.border));
            p.add(new MinimumRadiusLabel(colors.text, colors.border));
        }

        private static class GradientLabel extends SectionLabel {
            protected GradientLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Gradient: ";
                int value = 0; //roundNumber(RotationalLimits.GradientLimits.MAX_FORCE_GRADIENT * 100,2)
                String units = " %";
                return label + value + units;
            }
        }

        private static class ReferenceHeightLabel extends SectionLabel {
            protected ReferenceHeightLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Reference height: ";
                int value = 0; //roundNumber(RotationalLimits.GradientLimits.HEIGHT, 2)
                String units = " m";
                return label + value + units;
            }
        }

        private static class MinimumRadiusLabel extends SectionLabel {
            protected MinimumRadiusLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Minimum rotor radius: ";
                int value = 0; //roundNumber(RotationalLimits.GradientLimits.getRadius(), 3)
                String units = " m";
                return label + value + units;
            }
        }
    }

    class TotalRadiusLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        // TODO: set no title

        public TotalRadiusLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new FinalMinimumRadiusLabel(colors.text, colors.border));
        }

        private static class FinalMinimumRadiusLabel extends SectionLabel {
            protected FinalMinimumRadiusLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Final minimum rotor radius: ";
                int value = 0; //roundNumber(Rotor.getRadiusLimit(), 3)
                String units = " m";
                return label + value + units;
            }
        }
    }

    class ActualParameterSection extends AbstractSection {
        public static final int HEIGHT = 150;

        // TODO: add title: "Actual values for selected rotor"

        public ActualParameterSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new RadiusLabel(colors.text, colors.border));
            p.add(new AngularVelocityLabel(colors.text, colors.border));
            p.add(new RPMLabel(colors.text, colors.border));
            p.add(new RotationalPeriodLabel(colors.text, colors.border));
            p.add(new TangentialVelocityLabel(colors.text, colors.border));
        }

        private static class RadiusLabel extends SectionLabel {
            protected RadiusLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Radius: ";
                int value = 0; //roundNumber(radius, 3)
                String units = " m";
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
                int value = 0; //roundNumber(omega, 3)
                String units = " rad/s";
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
                int value = 0; //roundNumber(Rotor.getRPMFromPeriod(period), 2)
                String units = "";
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
                int value = 0; //roundNumber(period, 2)
                String units = " s";
                return label + value + units;
            }
        }

        private static class TangentialVelocityLabel extends SectionLabel {
            protected TangentialVelocityLabel(Color textColor, Color borderColor) {
                super(textColor, true, borderColor);
            }

            @Override
            public final String getText() {
                // TODO: finish this
                String label = "Tangential velocity: ";
                int value = 0; //roundNumber(Rotor.getTangentialVelocity(radius, omega), 1)
                String units = " m/s";
                return label + value + units;
            }
        }
    }
}