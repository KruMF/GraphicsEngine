package graphicsEngine.presets;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.windows.AbstractPage;
import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;

import java.util.List;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class HeaderAndFooterPage extends AbstractPage {
    //TODO: add javadoc
    public HeaderAndFooterPage(@Nullable List<ActionListener> actionListenerList,
                               @Nullable Color backgroundColor,
                               @Nullable SimpleColorScheme headerAndFooterColors,
                               @Nullable BorderProperties borderProperties) {
        super(actionListenerList, backgroundColor);
        setLayout(new BorderLayout(0, 0));
        addHeaderAndFooter(headerAndFooterColors, borderProperties);
    }

    private void addHeaderAndFooter(@Nullable SimpleColorScheme headerAndFooterColors,
                                    @Nullable BorderProperties borderProperties) {
        AbstractHeader header = getHeader(headerAndFooterColors, borderProperties);
        if (header != null) {
            add(header, BorderLayout.NORTH);
        }
        AbstractFooter footer = getFooter(headerAndFooterColors, borderProperties);
        if (footer != null) {
            add(footer, BorderLayout.SOUTH);
        }
    }

    //TODO: add javadoc
    public abstract @Nullable AbstractHeader getHeader(
            @Nullable SimpleColorScheme headerColors,
            @Nullable BorderProperties borderProperties);

    //TODO: add javadoc
    public abstract @Nullable AbstractFooter getFooter(
            @Nullable SimpleColorScheme footerColors,
            @Nullable BorderProperties borderProperties);
}