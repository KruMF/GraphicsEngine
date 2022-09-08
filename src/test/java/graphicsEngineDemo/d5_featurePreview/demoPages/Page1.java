package graphicsEngineDemo.d5_featurePreview.demoPages;

import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page1 extends CommonDemoPage {
    private Page1() {
        this(null);
    }

    //TODO: add javadoc
    public Page1(@Nullable ActionListener actionListener) {
        super(actionListener);
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
}