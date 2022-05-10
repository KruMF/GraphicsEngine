package rotorCalculator.data.rotorData;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Environment;

import java.util.Objects;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class GeneralConstants {

    // physical constants

    public double standardGravity; // acceleration [m / s^2]

    public GeneralConstants(@Nullable graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Environment environment) {
        switch (Objects.requireNonNullElse(environment, Environment.ROUGH)) {
            case SI_STANDARD, MOON : {
                standardGravity = 9.80665;
                break;
            }
            case ROUGH :
            default : {
                standardGravity = 9.8;
            }
        }
    }
}