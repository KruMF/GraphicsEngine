package graphicsEngineDemo.d5_featurePreview.menuPages.startingPage;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class StartingPage extends AbstractMenuPage {
    private StartingPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public StartingPage(@Nullable List<ActionListener> actionListenerList,
                        @Nullable SimpleColorScheme colors) {
        super(actionListenerList, colors);
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
    public @NotNull Component getPageBody() {
        JPanel body = (JPanel) super.getPageBody();
        body.add(new SimpleLabel("Starting page", Color.white), BorderLayout.NORTH);
        //Add parts here
        return body;
    }
}