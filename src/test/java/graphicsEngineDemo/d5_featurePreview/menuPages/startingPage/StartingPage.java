package graphicsEngineDemo.d5_featurePreview.menuPages.startingPage;

import java.util.List;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;

import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

//TODO: finish this and add javadoc
public class StartingPage extends AbstractMenuPage {
    private StartingPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public StartingPage(@Nullable List<ActionListener> actionListenerList,
                        @Nullable SimpleColorScheme colors) {
        super(actionListenerList);
        initializePanels(
                colors,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null);
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

    //
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BorderLayout(0, 0));
            add(new SimpleLabel("Starting page", Color.white), BorderLayout.NORTH);
        }};
    }
}