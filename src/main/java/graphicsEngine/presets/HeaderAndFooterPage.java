package graphicsEngine.presets;

import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.windows.AbstractPage;

import java.awt.BorderLayout;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public abstract class HeaderAndFooterPage extends AbstractPage {
    //TODO: add javadoc
    public HeaderAndFooterPage(@Nullable AbstractHeader header,
                               @Nullable AbstractFooter footer) {
        super();
        setLayout(new BorderLayout(0, 0));
        addHeaderAndFooter(header, footer);
        addParts();
    }

    private void addHeaderAndFooter(@Nullable AbstractHeader header,
                                    @Nullable AbstractFooter footer) {
        if (header != null) {
            add(header, BorderLayout.NORTH);
        }
        if (footer != null) {
            add(footer, BorderLayout.SOUTH);
        }
    }

    //TODO: add javadoc
    public abstract void addParts();
}