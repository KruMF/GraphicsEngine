package graphicsEngineDemo.overlayDemo;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.presets.panels.AbstractFooter;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
class Page extends HeaderAndFooterPage {
    protected Page(@Nullable PanelColors panelColors,
                   @Nullable ActionListener actionListener) {
        super(
                new CommonHeader(panelColors, actionListener),
                new Footer(panelColors));
    }

    @Override
    public final void addParts() {}

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
            add(new Button1(actionListener));
            add(new Button2(actionListener));
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