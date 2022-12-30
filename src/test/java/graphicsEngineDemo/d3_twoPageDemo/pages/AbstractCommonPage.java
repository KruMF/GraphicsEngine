package graphicsEngineDemo.d3_twoPageDemo.pages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;
import graphicsEngine.pages.HeaderAndFooterPage;
import graphicsEngine.pages.panels.AbstractFooter;
import graphicsEngine.pages.panels.AbstractHeader;
import graphicsEngineDemo.d3_twoPageDemo.parts.CommonHeader;
import graphicsEngineDemo.d3_twoPageDemo.parts.ButtonListener;
import graphicsEngineDemo.d3_twoPageDemo.parts.CommonFooter;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class AbstractCommonPage extends HeaderAndFooterPage {
    private ButtonListener headerButtonListener;

    private static final @NotNull Color
            DEFAULT_BACKGROUND = ColorUtilities.DEFAULT_COLOR_OPAQUE,
            LABEL_TEXT_COLOR = new Color(30, 30, 150);
    private static final @NotNull String DEFAULT_LABEL = "No label defined for this page";
    private final @NotNull String labelText;

    //TODO: add javadoc
    protected AbstractCommonPage(@Nullable ActionListener buttonListener,
                                 @Nullable String labelText) {
        super(
                new ArrayList<>() {{
                    add(buttonListener);
                }},
                null);
        this.labelText = Objects.requireNonNullElse(labelText, DEFAULT_LABEL);
        initializePanels(null, getBodyColors(), null);
    }

    private static SimpleColorScheme getBodyColors() {
        return new SimpleColorScheme(
                ColorUtilities.DEFAULT_COLOR_TRANSPARENT,
                LABEL_TEXT_COLOR);
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
        return new CommonFooter(footerColors, borderProperties);
    }

    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(new SimpleLabel(labelText, getPanelColors().getSecondaryColor()));
        }};
    }

    //TODO: add javadoc
    @Override
    public void setBackground(@Nullable Color background) {
        super.setBackground(Objects.requireNonNullElse(background, DEFAULT_BACKGROUND));
    }
}