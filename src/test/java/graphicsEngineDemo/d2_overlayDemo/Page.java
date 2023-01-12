package graphicsEngineDemo.d2_overlayDemo;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

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
class Page extends HeaderAndFooterPage {
    private ButtonListener headerButtonListener;

    protected Page(@Nullable ActionListener actionListener,
                   @Nullable SimpleColorScheme panelColors) {
        super(
                new ArrayList<>() {{
                    add(actionListener);
                }},
                null);
        initializePanels(panelColors, null, null);
    }

    @Override
    public String getPageKey() {
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
    public @NotNull List<ActionListener> addListeners(@Nullable List<ActionListener> list) {
        List<ActionListener> remainder = super.addListeners(list);
        for (int i = 0; i < remainder.size(); i++) {
            ActionListener listener = remainder.get(i);
            if (listener instanceof ButtonListener) {
                headerButtonListener = (ButtonListener) listener;
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
        return new CommonHeader(headerColors, borderProperties, headerButtonListener);
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

    private static class CommonHeader extends AbstractHeader {
        private static final int HEIGHT = 50;

        public CommonHeader(@Nullable SimpleColorScheme panelColors,
                            @Nullable BorderProperties borderProperties,
                            @Nullable ActionListener actionListener) {
            super(panelColors, HEIGHT, borderProperties);
            addButtons(actionListener);
        }

        private void addButtons(@Nullable ActionListener actionListener) {
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(new Button1(actionListener));
            add(new Button2(actionListener));
            add(new Button3(actionListener));
        }
    }

    private static class Footer extends AbstractFooter {
        private static final int HEIGHT = 100;

        public Footer(@Nullable SimpleColorScheme panelColors,
                      @Nullable BorderProperties borderProperties) {
            super(panelColors, HEIGHT, borderProperties);
        }
    }
}