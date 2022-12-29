package graphicsEngineDemo.d5_featurePreview.menuPages.settingsPage;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;

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
        super(actionListenerList);
        prepareFixedPanels(
                colors,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null);
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

    //
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BorderLayout(0, 0));
            add(new SimpleLabel("Settings page", Color.white), BorderLayout.NORTH);
        }};
    }
}