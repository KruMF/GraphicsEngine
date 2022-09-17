package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.panels.StaticPanel;

import java.util.List;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class AbstractMenuPage extends AbstractCommonPage {
    //TODO: add javadoc
    public AbstractMenuPage(@Nullable List<ActionListener> actionListenerList,
                            @Nullable PanelColors panelColors) {
        super(actionListenerList, panelColors);
    }

    //TODO: add javadoc
    @Override
    public void setBodyParameters() {
        //TODO: set body parameters here
    }

    //TODO: add javadoc
    @Override
    public @NotNull Component getPageBody() {
        return new StaticPanel(
                null,
                new PanelColors(Utilities.EMPTY_COLOR, null, null),
                false) {
            {
                setLayout(new BorderLayout(0, 0));
            }
        };
    }
}