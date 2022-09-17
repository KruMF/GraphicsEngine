package graphicsEngine.presets;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.panels.PanelColors;
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
                               @Nullable PanelColors headerAndFooterColors) {
        super(actionListenerList, backgroundColor);
        setLayout(new BorderLayout(0, 0));
        addHeaderAndFooter(headerAndFooterColors);
        addParts();
    }

    private void addHeaderAndFooter(@Nullable PanelColors headerAndFooterColors) {
        AbstractHeader header = getHeader(headerAndFooterColors);
        if (header != null) {
            add(header, BorderLayout.NORTH);
        }
        AbstractFooter footer = getFooter(headerAndFooterColors);
        if (footer != null) {
            add(footer, BorderLayout.SOUTH);
        }
    }

    //TODO: add javadoc
    public abstract @Nullable AbstractHeader getHeader(@Nullable PanelColors headerColors);

    //TODO: add javadoc
    public abstract @Nullable AbstractFooter getFooter(@Nullable PanelColors footerColors);

    //TODO: add javadoc
    public abstract void addParts();
}