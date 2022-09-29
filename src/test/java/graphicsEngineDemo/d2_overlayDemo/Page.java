package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.presets.panels.AbstractFooter;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
class Page extends HeaderAndFooterPage {
    private ButtonListener headerButtonListener;

    protected Page(@Nullable SimpleColorScheme panelColors,
                   @Nullable ActionListener actionListener) {
        super(new ArrayList<>() {
                    {
                        add(actionListener);
                    }
                }, null,
                panelColors, null);
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

    @Override
    public String getPageKey() {
        return "page";
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
            add(new ButtonListener.Button1(actionListener));
            add(new ButtonListener.Button2(actionListener));
            add(new ButtonListener.Button3(actionListener));
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