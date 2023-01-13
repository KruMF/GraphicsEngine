package graphicsEngine.pages;

import java.util.List;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.SimplePanel;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.pages.panels.AbstractFooter;
import graphicsEngine.pages.panels.AbstractHeader;
import graphicsEngine.pages.panels.PanelLocation;

//TODO: add javadoc
public abstract class HeaderAndFooterPage extends AbstractPage implements VerticalDivisionInterface {
    private @Nullable AbstractHeader header;
    private @Nullable AbstractFooter footer;
    private @Nullable DynamicPanel body;

    //TODO: add javadoc
    public HeaderAndFooterPage(@Nullable List<ActionListener> actionListenerList,
                               @Nullable Color backgroundColor) {
        super(actionListenerList, backgroundColor);
    }

    //this has to be called manually in constructor in order to support custom parameters
    //TODO: add javadoc
    public final void initializePanels(@Nullable SimpleColorScheme headerAndFooterColors,
                                       @Nullable SimpleColorScheme bodyColors,
                                       @Nullable BorderProperties borderProperties) {
        setLayout(new BorderLayout(0, 0));
        setHeaderAndFooter(headerAndFooterColors, borderProperties);
        addHeaderAndFooter();
        setBody(bodyColors, borderProperties);
        addBody();
    }

    private void setHeaderAndFooter(@Nullable SimpleColorScheme colors,
                                    @Nullable BorderProperties borderProperties) {
        header = getHeader(colors, borderProperties);
        footer = getFooter(colors, borderProperties);
    }

    private void addHeaderAndFooter() {
        if (header != null) {
            add(header, BorderLayout.NORTH);
        }
        if (footer != null) {
            add(footer, BorderLayout.SOUTH);
        }
    }

    private void setBody(@Nullable SimpleColorScheme colors,
                         @Nullable BorderProperties borderProperties) {
        body = getBody(colors, borderProperties);
    }

    private void addBody() {
        if (body != null) {
            add(body, BorderLayout.CENTER);
        }
    }

    //TODO: add javadoc
    public @Nullable SimplePanel getPanelByLocation(@NotNull PanelLocation location) {
        try {
            return switch (location) {
                case NORTH -> header;
                case SOUTH -> footer;
                case CENTER -> body;
                default -> throw new UndefinedPanelLocationException();
            };
        } catch (UndefinedPanelLocationException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class UndefinedPanelLocationException extends Exception {
        protected UndefinedPanelLocationException() {
            super("Panel in such location not defined!");
        }
    }
}