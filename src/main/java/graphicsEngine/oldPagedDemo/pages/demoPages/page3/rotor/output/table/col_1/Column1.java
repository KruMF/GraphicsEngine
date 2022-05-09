package graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.col_1;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.Rotor;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Column;
import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.table.Section;

import static graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.output.Utilities.roundNumber;

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
            super("Actual parameters", prepareData());
        }

        private static String[] prepareData() {
            double
                    radius = Rotor.getRadiusLimit(),
                    omega = Rotor.getAngularVelocity(radius),
                    period = Rotor.getPeriodFromAngularVelocity(omega);

            return new String[] {
                    "radius: " + roundNumber(radius, 3) + " m",
                    "angular velocity: " + roundNumber(omega, 3) + " rad/s",
                    "RPM: " + roundNumber(Rotor.getRPMFromPeriod(period), 2),
                    "rotational period: " + roundNumber(period, 2) + " s",
                    "tangential velocity: " + roundNumber(Rotor.getTangentialVelocity(radius, omega), 1) + " m/s"
            };
        }
    }

    private static class OldInfoSection extends Section.NextSection {
        public OldInfoSection() {
            super("More info", prepareData());
        }

        private static String[] prepareData() {
            return new String[] {
                    "" // add info here
            };
        }
    }
}