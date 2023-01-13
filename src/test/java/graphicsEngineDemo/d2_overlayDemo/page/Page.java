package graphicsEngineDemo.d2_overlayDemo.page;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.pages.HeaderAndFooterPage;
import graphicsEngine.pages.panels.AbstractHeader;
import graphicsEngine.pages.panels.AbstractFooter;

import graphicsEngineDemo.d2_overlayDemo.buttons.*;

//TODO: add javadocs
public class Page extends HeaderAndFooterPage {
    private ButtonListener buttonListener;

    //TODO: add javadoc
    public Page(@Nullable ActionListener actionListener,
                @Nullable SimpleColorScheme panelColors) {
        super(
                new ArrayList<>() {{
                    add(actionListener);
                }},
                null);
        initializePanels(panelColors, null, null);
    }

    //TODO: add javadoc
    @Override
    public @NotNull String getPageKey() {
        return "page";
    }

    /**
     * Adds known listeners to this page.
     * Override this to add custom listeners.
     *
     * @param list List of listeners to add.
     *
     * @return Remaining unknown listeners.
     */
    @Override
    public @NotNull List<@Nullable ActionListener> addListeners(@Nullable List<@Nullable ActionListener> list) {
        @Nullable List<ActionListener> remainder = super.addListeners(list);
        for (int i = 0; i < remainder.size(); i++) {
            @Nullable ActionListener listener = remainder.get(i);
            if (listener instanceof ButtonListener) {
                buttonListener = (ButtonListener) listener;
                remainder.remove(i);
                i--;
            }
        }
        return remainder;
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractHeader getHeader(@Nullable SimpleColorScheme headerColors,
                                             @Nullable BorderProperties borderProperties) {
        return new Header(headerColors, borderProperties, buttonListener);
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractFooter getFooter(@Nullable SimpleColorScheme footerColors,
                                             @Nullable BorderProperties borderProperties) {
        return new Footer(footerColors, borderProperties);
    }

    //TODO: add javadoc
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return null;
    }
}