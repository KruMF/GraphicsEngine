package graphicsEngineDemo.d3_twoPageDemo.pages;

import java.awt.Color;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class Page1 extends AbstractCommonPage {
    //TODO: add javadoc
    public Page1() {
        this(null, null);
    }

    //TODO: add javadoc
    public Page1(@Nullable ActionListener actionListener,
                 @Nullable Color background) {
        super(actionListener, "This is page 1");
        setBackground(background);
    }

    //TODO: add javadoc
    @Override
    public @NotNull String getPageKey() {
        return "page1";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new Page1()).getPageKey();
    }
}