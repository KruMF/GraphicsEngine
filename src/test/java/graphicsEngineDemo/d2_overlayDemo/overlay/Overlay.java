package graphicsEngineDemo.d2_overlayDemo.overlay;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.presets.SimpleOverlay;

import graphicsEngineDemo.d2_overlayDemo.buttons.Button4;

/**
 * TODO: finish this javadoc
 */
public class Overlay extends SimpleOverlay {
    private static final boolean INITIAL_COLOR_STATE = false;
    private boolean colorState;

    //TODO: add javadoc
    public Overlay(@Nullable ActionListener actionListener) {
        super(getColorByState(INITIAL_COLOR_STATE));
        colorState = INITIAL_COLOR_STATE;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Button4(actionListener));
    }

    private static @NotNull Color getColorByState(boolean state) {
        if (state) {
            return OverlayColors.GREEN;
        } else {
            return OverlayColors.RED;
        }
    }

    //TODO: add javadoc
    public void toggleColor() {
        colorState = !colorState;
        setColor(getColorByState(colorState));
    }
}