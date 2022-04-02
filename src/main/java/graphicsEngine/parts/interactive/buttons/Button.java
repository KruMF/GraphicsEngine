package graphicsEngine.parts.interactive.buttons;

import graphicsEngine.engine.GraphicsManager;
import graphicsEngine.engine.data.colors.ButtonColors;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.parts.simpleParts.SimpleLabel;
import graphicsEngine.parts.containers.ContentsBox;

import java.awt.*;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

/**
 * A simple abstract button. Must be extended.
 */
public abstract class Button extends MouseDetectablePart {
    SimpleLabel label;      // for displaying text
    ContentsBox boxing;     // for background and border

    /**
     * Creates a simple button.
     *
     * @param size       Size.
     * @param fixedSize  Size fixation in either direction.
     * @param text       Text to display. (Null - empty)
     * @param textOffset Text offset for manual centering. (Null - no offset)
     */
    public Button(@Nullable int[] size, @Nullable boolean[] fixedSize,
                  @Nullable String text, @Nullable int[] textOffset) {
        super(size, fixedSize);
        Color textColor = GraphicsManager.data.palette.buttonColors.textColor;
        label = new SimpleLabel(text, textOffset, textColor);
        boxing = new ContentsBox(
                size, fixedSize,
                null, null,
                label);
    }

    /**
     * General drawing of a button.
     */
    @Override
    public void draw(@NotNull Graphics g,
                     @Nullable int[] location, @Nullable int[] size) {
        super.draw(g, location, size);
        boxing.draw(g, this.location, this.size);
        label.draw(g, this.location, this.size);
    }

    /**
     * Drawing a button when inactive.
     */
    @Override
    public void drawInactive() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        boxing.setBackgroundColor(colors.bodyColor);
        boxing.setBorderColor(colors.borderColor);
    }

    /**
     * Drawing a button when hovered.
     */
    @Override
    public void drawHovered() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        boxing.setBackgroundColor(colors.bodyColor);
        boxing.setBorderColor(colors.borderColor_active);
    }

    /**
     * Drawing a button when clicked.
     */
    @Override
    public void drawClicked() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        boxing.setBackgroundColor(colors.bodyColor_active);
        boxing.setBorderColor(colors.borderColor_active);
    }

    /**
     * Check interaction of a button.
     */
    @Override
    public void interactionCheck(@NotNull InputData input) {
        super.interactionCheck(input);
    }

    /**
     * Check if button is activated and perform its action, if it is.
     */
    public void actionCheck() {
        if (activated) {
            action();
        }
        activated = false; //debounce
    }

    /**
     * Action to perform upon button activation.
     */
    public void action() {
        System.out.println("Button action placeholder");
    }
}