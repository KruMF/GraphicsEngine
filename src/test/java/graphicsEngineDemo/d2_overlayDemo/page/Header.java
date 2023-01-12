package graphicsEngineDemo.d2_overlayDemo.page;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.panels.AbstractHeader;

import graphicsEngineDemo.d2_overlayDemo.buttons.*;

//TODO: add javadocs
class Header extends AbstractHeader {
    private static final int HEIGHT = 50;

    //TODO: add javadoc
    protected Header(@Nullable SimpleColorScheme panelColors,
                  @Nullable BorderProperties borderProperties,
                  @Nullable ActionListener actionListener) {
        super(panelColors, HEIGHT, borderProperties);
        addButtons(actionListener);
    }

    private void addButtons(@Nullable ActionListener actionListener) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new Button1(actionListener));
        add(new Button2(actionListener));
        add(new Button3(actionListener));
    }
}