package rotorCalculator.data.rotorData;

import graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Environment;

import java.util.Objects;

import com.google.inject.internal.Nullable;

// TODO: add javadoc
public class Preferences {
    public double gForce; // acceleration [g's]

    public Preferences(@Nullable graphicsEngine.oldPagedDemo.pages.demoPages.page3.rotor.data.Environment environment) {
        switch (Objects.requireNonNullElse(environment, Environment.ROUGH)) {
            case MOON : {
                gForce = 0.1654;
                break;
            }
            case SI_STANDARD, ROUGH :
            default : {
                gForce = 1.00;
            }
        }
    }
}