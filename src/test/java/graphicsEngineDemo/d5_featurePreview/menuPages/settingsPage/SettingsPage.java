package graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage;

import graphicsEngine.parts.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class SettingsPage extends AbstractMenuPage {
    private SettingsPage() {
        this(null);
    }

    //TODO: add javadoc
    public SettingsPage(@Nullable ActionListener actionListener) {
        super(actionListener);
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
    public @Nullable List<Component> initialCentralComponents(@Nullable ActionListener actionListener) {
        return new ArrayList<>() {{
            add(new SimpleLabel("Settings page", Color.white));
        }};
    }
}