package graphicsEngine.utilities.buttons;

import java.awt.*;
import java.util.ArrayList;

public class ButtonRow {
    int[] location; //relative to panel

    ArrayList<Button> buttons;
    int separation;
    int buttonHeight;
    int buttonWidth;

    public ButtonRow(
            int[] _location, int _separation,
            int _buttonHeight, int _buttonWidth,
            ArrayList<Button> _buttons) {
        location = _location;

        separation = _separation;
        buttonHeight = _buttonHeight;
        buttonWidth = _buttonWidth;

        buttons = _buttons;
    }

    public void draw(Graphics g, int[] panelLocation) {
        if (buttons != null) {
            int offsetX = separation;
            int offsetY = separation;

            for (Button button : buttons) {
                button.draw(
                        g,
                        new int[]{
                                panelLocation[0] + location[0] + offsetX,
                                panelLocation[1] + location[1] + offsetY});
                offsetX += (separation + button.size[0]);
            }
        }
    }

    public void interactionCheck() {
        if (buttons != null) {
            for (Button button : buttons) {
                button.interactionCheck();
            }
        }
    }

    public void actionCheck() {
        if (buttons != null) {
            for (Button button : buttons) {
                button.actionCheck();
            }
        }
    }
}