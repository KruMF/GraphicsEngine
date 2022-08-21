package graphicsEngine.presets;

import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.windows.AbstractPage;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public abstract class HeaderAndFooterPage extends AbstractPage {

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

    public abstract void addParts();
}