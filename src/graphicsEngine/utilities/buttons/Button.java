package graphicsEngine.utilities.buttons;

import graphicsEngine.GraphicsManager;
import graphicsEngine.data.colors.ButtonColors;
import graphicsEngine.utilities.input.InputData;
import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.Border;

import java.awt.Graphics;
import java.util.Objects;

public abstract class Button extends MouseDetectablePart {
    Background background;
    Border border;
    String text;
    int[] textOffset;

    public Button(int[] size, boolean[] fixedSize, String text, int[] textOffset) {
        super(size, fixedSize);
        background = new Background(this.size, this.fixedSize, null);
        border = new Border(this.size, this.fixedSize, null);
        this.text = Objects.requireNonNullElse(text, "");
        this.textOffset = Objects.requireNonNullElse(textOffset, new int[] {0, 0});
    }

    @Override
    public void draw(Graphics g, int[] location, int[] size) {
        super.draw(g, location, size);
        background.draw(g, this.location, this.size);
        border.draw(g, this.location, this.size);
        drawButtonText(g);
    }

    @Override
    public void drawInactive() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor;
        border.color = colors.borderColor;
    }

    @Override
    public void drawHovered() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor;
        border.color = colors.borderColor_active;
    }

    @Override
    public void drawClicked() {
        ButtonColors colors = GraphicsManager.data.palette.buttonColors;
        background.color = colors.bodyColor_active;
        border.color = colors.borderColor_active;
    }

    private void drawButtonText(Graphics g) {
        g.setColor(GraphicsManager.data.palette.buttonColors.textColor);
        g.drawString(text,
                location[0] + size[0] / 2 + textOffset[0],
                location[1] + size[1] / 2 + textOffset[1]);
    }

    @Override
    public void interactionCheck(InputData input) {
        super.interactionCheck(input);
    }

    public void actionCheck() {
        if (activated) {
            action();
        }
        activated = false; //debounce
    }

    public void action() {
        System.out.println("Button action placeholder");
    }
}