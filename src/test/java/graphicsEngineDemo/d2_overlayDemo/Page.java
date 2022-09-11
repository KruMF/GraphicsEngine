package graphicsEngineDemo.d2_overlayDemo;

import graphicsEngine.panels.PanelColors;
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

    protected Page(@Nullable PanelColors panelColors,
                   @Nullable ActionListener actionListener) {
        super(new ArrayList<>() {
                    {
                        add(actionListener);
                    }
                }, null,
                panelColors);
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

    @Override
    public final void addParts() {}

    //TODO: add javadoc
    @Override
    public @NotNull AbstractHeader getHeader(@Nullable PanelColors headerColors) {
        return new CommonHeader(headerColors, headerButtonListener);
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractFooter getFooter(@Nullable PanelColors footerColors) {
        return new Footer(footerColors);
    }

    @Override
    public String getPageKey() {
        return "page";
    }

    private static class CommonHeader extends AbstractHeader {
        private static final int HEIGHT = 50;

        public CommonHeader(@Nullable PanelColors panelColors,
                            @Nullable ActionListener actionListener) {
            super(panelColors, HEIGHT);
            addButtons(actionListener);
        }

        @Override
        public final void addParts() {}

        private void addButtons(@Nullable ActionListener actionListener) {
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(new ButtonListener.Button1(actionListener));
            add(new ButtonListener.Button2(actionListener));
            add(new ButtonListener.Button3(actionListener));
        }
    }

    private static class Footer extends AbstractFooter {
        private static final int HEIGHT = 100;

        public Footer(@Nullable PanelColors panelColors) {
            super(panelColors, HEIGHT);
        }

        @Override
        public final void addParts() {}
    }
}