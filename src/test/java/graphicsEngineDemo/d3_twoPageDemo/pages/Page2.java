package graphicsEngineDemo.d3_twoPageDemo.pages;

import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Page2 extends AbstractCommonPage {
    //TODO: add javadoc
    public Page2() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page2(@Nullable ActionListener actionListener,
                 @Nullable Color background) {
        super(actionListener, "This is page 2");
        setBackground(background);
    }

    //TODO: add javadoc
    @Override
    public @NotNull String getPageKey() {
        return "page2";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page2()).getPageKey();
    }
}