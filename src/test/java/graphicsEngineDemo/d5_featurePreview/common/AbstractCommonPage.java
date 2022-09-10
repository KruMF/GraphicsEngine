package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//TODO: finish this and add javadoc
public abstract class AbstractCommonPage extends HeaderAndFooterPage {
    //TODO: add javadoc
    public AbstractCommonPage(@Nullable PanelColors panelColors, @Nullable ActionListener actionListener) {
        super(
                new CommonHeader(panelColors, actionListener),
                new CommonFooter(panelColors));
        addBody(getPageBody(actionListener));
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {}

    private void addBody(@Nullable Component center) {
        add(new JPanel() {{
            setLayout(new BorderLayout(0, 0));
            setBackground(Utilities.EMPTY_COLOR);
            add(Objects.requireNonNullElse(center, new JPanel()), BorderLayout.CENTER);
        }});
    }

    //TODO: add javadoc
    public abstract @Nullable Component getPageBody(@Nullable ActionListener actionListener);
}