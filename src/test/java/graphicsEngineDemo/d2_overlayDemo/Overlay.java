package graphicsEngineDemo.d2_overlayDemo;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.presets.SimpleOverlay;

import graphicsEngineDemo.d2_overlayDemo.buttons.Button4;

/**
 * TODO: finish this javadoc
 */
class Overlay extends SimpleOverlay {
    //TODO: add javadoc
    protected Overlay(@Nullable ActionListener actionListener) {
        super(OverlayColors.RED);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Button4(actionListener));
    }
}