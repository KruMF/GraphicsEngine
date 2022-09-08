package graphicsEngineDemo.d5_featurePreview.demoPages;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class Page2 extends CommonDemoPage {
    //TODO: add javadoc
    public Page2() {
        this(null);
    }

    //TODO: add javadoc
    public Page2(@Nullable ActionListener actionListener) {
        super(actionListener);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "page2";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page2()).getPageKey();
    }
}