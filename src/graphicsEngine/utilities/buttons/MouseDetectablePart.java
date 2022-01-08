package graphicsEngine.utilities.buttons;

import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.SimplePart;

import java.awt.*;

// TODO: add javadoc
public abstract class MouseDetectablePart extends SimplePart {
    public boolean hovered;
    public boolean clicked;
    public boolean activated;

    /**
     * Constructor for mouse detectable part.
     * @param size      Size of the part.
     * @param fixedSize Size fixation by axis.
     */
    public MouseDetectablePart(int[] size, boolean[] fixedSize) {
        super(size, fixedSize);
        prepareActivityBooleans();
    }

    // TODO: add javadoc
    private void prepareActivityBooleans() {
        hovered = false;
        clicked = false;
        activated = false;
    }

    // TODO: add javadoc
    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        if (clicked) {
            drawClicked();
        } else if (hovered) {
            drawHovered();
        } else {
            drawInactive();
        }
    }

    // TODO: add javadoc
    public void drawClicked() {}
    // TODO: add javadoc
    public void drawHovered() {}
    // TODO: add javadoc
    public void drawInactive() {}

    // TODO: add javadoc
    public void interactionCheck(InputData input) {
        mouseLocationCheck(input.mouse);
        if (input.mouseClick) {
            mouseClickCheck();
        } else {
            mouseReleaseCheck();
        }
    }

    // TODO: add javadoc
    private boolean checkXY(int[] mouse) {
        return mouse[0] > location[0]
                && mouse[1] > location[1]
                && mouse[0] < location[0] + size[0]
                && mouse[1] < location[1] + size[1];
    }

    // TODO: add javadoc
    private void mouseLocationCheck(int[] mouse) {
        hovered = checkXY(mouse);
    }

    // TODO: add javadoc
    private void mouseClickCheck() {
        if (hovered) {
            clicked = true;
        }
    }

    // TODO: add javadoc
    private void mouseReleaseCheck() {
        if (clicked && hovered) {
            activated = true;
        }
        clicked = false;
    }
}