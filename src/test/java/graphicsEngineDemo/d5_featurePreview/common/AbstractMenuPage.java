package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//TODO: add javadoc
public abstract class AbstractMenuPage extends AbstractCommonPage {
    //TODO: add javadoc
    public AbstractMenuPage(@Nullable PanelColors panelColors,
                            @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }

    //TODO: add javadoc
    @Override
    public @NotNull Component getPageBody(@Nullable ActionListener actionListener) {
        return new JPanel() {{
            setLayout(new BorderLayout(0, 0));
            setBackground(Utilities.EMPTY_COLOR);
        }};
    }
}