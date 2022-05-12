package graphicsEngine;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * A utility class for containing generic methods.
 */
public class Utilities {

    /**
     * Prints a message in console as new line.
     *
     * @param message Message to print.
     */
    public static void printLine(String message) {
        System.out.println(message);
    }

    // TODO: add javadoc
    public interface BorderInterface {
        static void setBorderState(JComponent component, boolean state, Color color) {
            if (state) {
                component.setBorder(new LineBorder(color));
            } else {
                component.setBorder(null);
            }
        }
    }
}