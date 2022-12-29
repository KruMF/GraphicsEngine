package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page1 extends CommonDemoPage {
    private static final @NotNull Color BACKGROUND_COLOR = new Color(150, 50, 50);

    private Page1() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page1(@Nullable List<ActionListener> actionListenerList,
                 @Nullable SimpleColorScheme colors) {
        super(actionListenerList);
        setBackground(BACKGROUND_COLOR);
        prepareFixedPanels(
                colors,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, Color.white),
                null);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page1";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page1()).getPageKey();
    }

    //
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BorderLayout(0, 0));
            add(new SimpleLabel("Demo 1", getPanelColors().getSecondaryColor()), BorderLayout.NORTH);
        }};
    }
}