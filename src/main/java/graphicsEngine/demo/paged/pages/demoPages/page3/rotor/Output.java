package graphicsEngine.demo.paged.pages.demoPages.page3.rotor;

import graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output.Utilities;

import java.util.ArrayList;

/**
 * Helper class for handling output data for rotor.
 */
public class Output extends Utilities {

    /**
     * Prepare output info for first column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] firstColumnStringArray() {
        ArrayList<String[]> columnParts = new ArrayList<>() {{

            // angular velocity limits

            add(sectionTitle("Inner joint limits"));
            add(innerJointStringArray());

            add(sectionSeparator("Coriolis effect limits"));
            add(coriolisLimitStringArray());

            add(LINE_SEPARATOR);
            add(omegaLimitTotalStringArray());

            // radius limits

            add(sectionSeparator("Standard gravity requirements"));
            add(gravityRequirementsStringArray());

            add(sectionSeparator(""));
            add(forceGradientStringArray());

            add(LINE_SEPARATOR);
            add(radiusLimitTotalStringArray());
        }};
        return joinArrays(columnParts);
    }

    private static String[] innerJointStringArray() {
        return new String[] {
                "Inner rotor limits:",
                "radius, tangential v, period, max omega"
        };
    }

    private static String[] coriolisLimitStringArray() {
        return new String[] {
                "Coriolis limits (for a human):",
                ""
        };
    }

    private static String[] omegaLimitTotalStringArray() {
        return new String[] {
                "total max omega: " + " rad / s"
        };
    }

    private static String[] gravityRequirementsStringArray() {
        return new String[] {
                "G-force: " + " G",
                "minimum rotor radius: " + " m"
        };
    }

    private static String[] forceGradientStringArray() {
        return new String[] {
                "Force gradient limits (for a human):",
                "gradient: " + " % at height: " + " m",
                "minimum rotor radius: " + " m"
        };
    }

    private static String[] radiusLimitTotalStringArray() {
        return new String[] {
                "total minimum rotor radius: " + " m"
        };
    }

    /**
     * Prepare output info for second column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] secondColumnStringArray() {
        ArrayList<String[]> columnParts = new ArrayList<>() {{
            add(sectionTitle("actual parameters"));
            add(secondColumnSection1StringArray());

            add(sectionSeparator("old info"));
            add(secondColumnSection2StringArray());

            add(sectionSeparator("Column 2, section 3"));
            add(secondColumnSection3StringArray());
        }};
        return joinArrays(columnParts);
    }

    private static String[] secondColumnSection1StringArray() {
        return new String[] {
                ""
        };
    }

    private static String[] secondColumnSection2StringArray() {
        return new String[] {
                //"Standard gravity component: ~" + Math.round(Rotor.getRadius_fromStandardGravity()) + " m",
                //"Gradient component: ~" + Math.round(Rotor.getRadius_fromForceGradient()) + " m",
                //"Total rotor radius: ~" + Math.round(Rotor.getRadius()) + " m",
                "",
                //"Period: " + Limits.rotationPeriod() + " s",
                //"Tangential velocity: ~" + Rotor.tangentialVelocity() + " m/s",
                //"Coriolis effect: " + Limits.HumanLimits.CoriolisLimits.getCoriolis(Rotor.angularVelocity()) + " m/s^2"
                //        + ", when moving at: " + Limits.HumanLimits.CoriolisLimits.REFERENCE_RUNNING_SPEED + " m/s"
        };
    }

    private static String[] secondColumnSection3StringArray() {
        return new String[] {
                "info: " + " units"
        };
    }

    /**
     * Prepare output info for third column as array of strings.
     *
     * @return Output info as an array of strings.
     */
    public static String[] thirdColumnStringArray() {
        ArrayList<String[]> columnParts = new ArrayList<>() {{
            add(sectionTitle("Column 3, section 1"));
            add(thirdColumnSection1StringArray());

            add(sectionSeparator("Column 3, section 2"));
            add(thirdColumnSection2StringArray());

            add(sectionSeparator("Column 3, section 3"));
            add(thirdColumnSection3StringArray());
        }};
        return joinArrays(columnParts);
    }

    private static String[] thirdColumnSection1StringArray() {
        return new String[] {
                "info: " + " units"
        };
    }

    private static String[] thirdColumnSection2StringArray() {
        return new String[] {
                "info: " + " units"
        };
    }

    private static String[] thirdColumnSection3StringArray() {
        return new String[] {
                "info: " + " units"
        };
    }
}