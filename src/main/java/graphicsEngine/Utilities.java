package graphicsEngine;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {
    private static final Color DEFAULT_BORDER_COLOR = Color.red;

    /**
     * Prints a message in console as new line.
     *
     * @param message Message to print.
     */
    public static void printLine(String message) {
        System.out.println(message);
    }

    //rounds a number to a specified number of decimal places
    // TODO: add javadoc
    public static String roundNumber(double value, int decimalPlaces) {
        double conversionCoefficient = Math.pow(10, decimalPlaces);
        return String.valueOf(((int) (value * conversionCoefficient))/conversionCoefficient);
    }

    // TODO: add javadoc
    public interface BorderInterface {
        static void setBorderState(@NotNull JComponent component, boolean state, @Nullable Color color) {
            if (state) {
                component.setBorder(new LineBorder(Objects.requireNonNullElse(color, DEFAULT_BORDER_COLOR)));
            } else {
                component.setBorder(null);
            }
        }
    }
}