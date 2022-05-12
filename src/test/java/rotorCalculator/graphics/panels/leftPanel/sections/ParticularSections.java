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

    class Section3 {
        //
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