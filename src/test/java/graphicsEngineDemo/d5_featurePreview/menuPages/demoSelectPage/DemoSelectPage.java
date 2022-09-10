package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.awt.*;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//TODO: finish this and add javadoc
public class DemoSelectPage extends AbstractMenuPage {
    private DemoSelectPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public DemoSelectPage(@Nullable PanelColors panelColors, @Nullable ActionListener actionListener) {
        super(panelColors, actionListener);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "demoSelect";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new DemoSelectPage()).getPageKey();
    }

    //TODO: add javadoc
    @Override
    public @NotNull Component getPageBody(@Nullable ActionListener actionListener) {
        JPanel body = (JPanel) super.getPageBody(actionListener);
        body.add(new SimpleLabel("Select demo:", Color.white), BorderLayout.NORTH);
        body.add(new JPanel() {{
            setBackground(Utilities.EMPTY_COLOR);
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(new DemoSelectButtons.Button_Page1(actionListener));
            add(new DemoSelectButtons.Button_Page2(actionListener));
            //Add more buttons here
        }}, BorderLayout.CENTER);
        return body;
    }
}