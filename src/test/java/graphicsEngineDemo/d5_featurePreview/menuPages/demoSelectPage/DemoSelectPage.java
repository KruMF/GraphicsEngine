package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.util.List;
import java.util.ArrayList;
import java.awt.Component;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class DemoSelectPage extends AbstractMenuPage {
    //TODO: add javadoc
    public DemoSelectPage() {
        this(null);
    }

    //TODO: add javadoc
    public DemoSelectPage(@Nullable ActionListener actionListener) {
        super(actionListener);
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
    public @Nullable List<Component> initialCentralComponents(@Nullable ActionListener actionListener) {
        return new ArrayList<>() {{
            add(new DemoSelectButtons.Button_Page1(actionListener));
            add(new DemoSelectButtons.Button_Page2(actionListener));
        }};
    }
}