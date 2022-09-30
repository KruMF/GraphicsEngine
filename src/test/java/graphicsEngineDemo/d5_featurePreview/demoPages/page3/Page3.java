package graphicsEngineDemo.d5_featurePreview.demoPages.page3;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.presets.panels.VerticalPanel;
import graphicsEngineDemo.d5_featurePreview.demoPages.PageWithPanel;
import graphicsEngineDemo.d5_featurePreview.demoPages.page3.data.DataUpdater;

import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page3 extends PageWithPanel {
    public final DataUpdater data;

    private Page3() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page3(@Nullable List<ActionListener> actionListenerList,
                 @Nullable SimpleColorScheme colors) {
        super(actionListenerList, colors);
        setBackground(new Color(50, 50, 150));
        data = new DataUpdater();
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page3";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page3()).getPageKey();
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