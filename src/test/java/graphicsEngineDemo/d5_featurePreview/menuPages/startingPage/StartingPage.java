package graphicsEngineDemo.d5_featurePreview.menuPages.startingPage;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.awt.*;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//TODO: finish this and add javadoc
public class StartingPage extends AbstractMenuPage {
    private StartingPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public StartingPage(@Nullable PanelColors panelColors,
                        @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "start";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new StartingPage()).getPageKey();
    }

    //TODO: add javadoc
    @Override
    public @NotNull Component getPageBody(@Nullable ActionListener actionListener) {
        JPanel body = (JPanel) super.getPageBody(actionListener);
        body.add(new SimpleLabel("Starting page", Color.white), BorderLayout.NORTH);
        //Add parts here
        return body;
    }
}