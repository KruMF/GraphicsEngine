package graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage;

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
public class SettingsPage extends AbstractMenuPage {
    private SettingsPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public SettingsPage(@Nullable List<ActionListener> actionListenerList,
                        @Nullable SimpleColorScheme colors) {
        super(actionListenerList, colors);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "settings";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new SettingsPage()).getPageKey();
    }

    //TODO: add javadoc
    @Override
    public @NotNull Component getPageBody() {
        JPanel body = (JPanel) super.getPageBody();
        body.add(new SimpleLabel("Settings page", Color.white), BorderLayout.NORTH);
        //Add parts here
        return body;
    }
}