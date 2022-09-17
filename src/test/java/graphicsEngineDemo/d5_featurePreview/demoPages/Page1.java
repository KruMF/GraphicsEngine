package graphicsEngineDemo.d5_featurePreview.demoPages;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;
import graphicsEngine.parts.SimpleLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page1 extends CommonDemoPage {
    private Page1() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page1(@Nullable List<ActionListener> actionListenerList,
                 @Nullable PanelColors panelColors) {
        super(actionListenerList, panelColors);
        setBackground(new Color(150, 50, 50));
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

    //TODO: add javadoc
    @Override
    public void setBodyParameters() {
        //TODO: set body parameters here
    }

    //TODO: add javadoc
    @Override
    public @Nullable Component getPageBody() {
        return new StaticPanel(
                null,
                new PanelColors(Utilities.EMPTY_COLOR, Color.white, null),
                false) {
            {
                setLayout(new BorderLayout(0, 0));
                add(new SimpleLabel("Demo 1", getPanelColors().text), BorderLayout.NORTH);
                //Add parts to body here
            }
        };
    }
}