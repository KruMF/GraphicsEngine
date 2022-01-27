package graphicsEngine.utilities.buttons;

import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple mouse detectable part.
 */
public abstract class MouseDetectablePart extends SimplePart {
    public boolean hovered;
    public boolean clicked;
    public boolean activated;

    /**
     * Constructor for mouse detectable part.
     * @param size      Size of the part.
     * @param fixedSize Size fixation by axis.
     */
    public MouseDetectablePart(@Nullable int[] size, @Nullable boolean[] fixedSize) {
        super(size, fixedSize);
        prepareActivityBooleans();
    }

    /**
     * Prepares default activity booleans.
     */
    private void prepareActivityBooleans() {
        hovered = false;
        clicked = false;
        activated = false;
    }

    /**
     * Draws the part.
     *
     * @param g        Graphics to use.
     * @param location Location of the part.
     * @param size     Size of the part.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        super.draw(g, location, size);
        if (clicked) {
            drawClicked();
        } else if (hovered) {
            drawHovered();
        } else {
            drawInactive();
        }
    }

    /**
     * Draws the part when clicked.
     */
    public void drawClicked() {}

    /**
     * Draws the part when hovered.
     */
    public void drawHovered() {}

    /**
     * Draws the part when inactive.
     */
    public void drawInactive() {}

    /**
     * Checks interaction of this part.
     *
     * @param input Input data to use for checking interaction.
     */
    public void interactionCheck(@NotNull InputData input) {
        mouseLocationCheck(input.mouse);
        if (input.mouseClick) {
            mouseClickCheck();
        } else {
            mouseReleaseCheck();
        }
    }

    /**
     * Check if mouse coordinates are within this part.
     *
     * @param mouse Coordinates of the mouse.
     *
     * @return True if within, false if outside.
     */
    private boolean checkXY(int[] mouse) {
        return mouse[0] > location[0]
                && mouse[1] > location[1]
                && mouse[0] < location[0] + size[0]
                && mouse[1] < location[1] + size[1];
    }

    /**
     * Checks if mouse is hovering above this part and sets status accordingly.
     *
     * @param mouse Coordinates of the mouse.
     */
    private void mouseLocationCheck(int[] mouse) {
        hovered = checkXY(mouse);
    }

    /**
     * Checks if mouse is being clicked inside ths part and sets status accordingly.
     */
    private void mouseClickCheck() {
        if (hovered) {
            clicked = true;
        }
    }

    /**
     * Checks if mouse click is released inside this part.
     * Sets activity status accordingly.
     */
    private void mouseReleaseCheck() {
        if (clicked && hovered) {
            activated = true;
        }
        clicked = false;
    }
}