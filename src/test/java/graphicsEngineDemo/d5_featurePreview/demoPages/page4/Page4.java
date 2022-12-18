package graphicsEngineDemo.d5_featurePreview.demoPages.page4;

import java.util.List;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.presets.panels.VerticalPanel;
import graphicsEngineDemo.d5_featurePreview.demoPages.PageWithPanel;

public class Page4 extends PageWithPanel {
    private Page4() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page4(@Nullable List<ActionListener> actionListenerList,
                 @Nullable SimpleColorScheme colors) {
        super(actionListenerList, colors);
        //setBackground(new Color(50, 50, 150));
        //data = new DataUpdater();
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page4";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page4()).getPageKey();
    }

    /**
     * TODO: finish this javadoc
     *
     * @param colors
     * @return
     */
    @Override
    public final @NotNull VerticalPanel getLeftSidePanel(@Nullable SimpleColorScheme colors) {
        return new SidePanel(colors, null);
    }

    /**
     * TODO: finish this javadoc
     *
     * @return
     */
    @Override
    public @Nullable JPanel getPageCenter() {
        return new Center(this);
    }
}
