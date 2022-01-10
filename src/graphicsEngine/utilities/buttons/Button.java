package graphicsEngine.utilities.buttons;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.ButtonColors;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;

import java.awt.Graphics;
import java.util.Objects;

/**
 * A simple abstract button. Must be extended.
 */
public abstract class Button extends MouseDetectablePart {
    Background background;
    Border border;
    String text;
    int[] textOffset;

    /**
     * Creates a simple button.
     *
     * @param size       Size.
     * @param fixedSize  Size fixation in either direction.
     * @param text       Text to display. (Null - empty)
     * @param textOffset Text offset for manual centering. (Null - no offset)
     */
    public Button(int[] size, boolean[] fixedSize, String text, int[] textOffset) {
        super(size, fixedSize);
        background = new Background(null);
        border = new Border(null);
        this.text = Objects.requireNonNullElse(text, "");
        this.textOffset = Objects.requireNonNullElse(textOffset, new int[] {0, 0});
    }

    /**
     * General drawing of a button.
     */
    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        background.draw(g, this.location, this.size);
        border.draw(g, this.location, this.size);
        drawButtonText(g);
    }

    /**
     * Drawing a button when inactive.
     */
    @Override
    public void drawInactive() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor;
        border.color = colors.borderColor;
    }

    /**
     * Drawing a button when hovered.
     */
    @Override
    public void drawHovered() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor;
        border.color = colors.borderColor_active;
    }

    /**
     * Drawing a button when clicked.
     */
    @Override
    public void drawClicked() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor_active;
        border.color = colors.borderColor_active;
    }

    /**
     * Draws the text of a button.
     *
     * TODO: needs improvements
     */
    private void drawButtonText(Graphics g) {
        g.setColor(GraphicsManager.data.palette.buttonColors.textColor);
        g.drawString(text,
                location[0] + size[0] / 2 + textOffset[0],
                location[1] + size[1] / 2 + textOffset[1]);
    }

    /**
     * Check interaction of a button.
     */
    @Override
    public void interactionCheck(InputData input) {
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