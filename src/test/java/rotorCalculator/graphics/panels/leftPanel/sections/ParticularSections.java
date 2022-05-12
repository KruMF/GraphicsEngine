package rotorCalculator.graphics.panels.leftPanel.sections;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;

import javax.swing.*;
import java.awt.*;

import com.google.inject.internal.Nullable;

public interface ParticularSections {
    class Section2 extends AbstractSection {
        public static final int HEIGHT = 150;

        public Section2(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);

            Utilities.BorderInterface.setBorderState(
                    this,
                    true,
                    Color.black);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            p.add(new SectionLabel(colors.text, colors.border));
        }
    }

    class JointLimitSection extends AbstractSection {
        public static final int HEIGHT = 150;

        public JointLimitSection(@Nullable PanelColors panelColors) {
            super(new int[] {Integer.MAX_VALUE, HEIGHT}, panelColors, true);
        }

        @Override
        public void addParts(JPanel p) {
            PanelColors colors = getPanelColors();
            //p.add(new SectionLabel(colors.text, colors.border));
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

        //TODO: print:
        /*
        * return new String[] {
                    "radius: " + roundNumber(radius, 3) + " m",
                    "angular velocity: " + roundNumber(omega, 3) + " rad/s",
                    "RPM: " + roundNumber(Rotor.getRPMFromPeriod(period), 2),
                    "rotational period: " + roundNumber(period, 2) + " s",
                    "tangential velocity: " + roundNumber(Rotor.getTangentialVelocity(radius, omega), 1) + " m/s"
            };
        *
        *
        *
        */
    }

    //TODO:
    //  add sections:
    //      Angular velocity limits:
    //      * joint limits
    //      * coriolis limits
    //      * total omega limits
    //      Radius limits:
    //      * gravity requirements
    //      * gradient limits
    //      * total radius limits
    //      End results:
    //      * summary of actual parameters
}