package graphicsEngineDemo.d3_twoPageDemo.pages;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.parts.SimpleLabel;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngineDemo.d3_twoPageDemo.parts.CommonHeader;
import graphicsEngineDemo.d3_twoPageDemo.parts.ButtonListener;
import graphicsEngineDemo.d3_twoPageDemo.parts.CommonFooter;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class AbstractCommonPage extends HeaderAndFooterPage {
    private ButtonListener headerButtonListener;

    private static final Color
            DEFAULT_BACKGROUND = ColorUtilities.DEFAULT_COLOR_OPAQUE,
            LABEL_TEXT_COLOR = new Color(30, 30, 150);
    private static final String DEFAULT_LABEL = "No label defined for this page";
    private final String labelText;

    //TODO: add javadoc
    protected AbstractCommonPage(@Nullable ActionListener buttonListener,
                                 @Nullable String labelText) {
        super(new ArrayList<>() {
                    {
                        add(buttonListener);
                    }
                },
                null, null, null);
        this.labelText = Objects.requireNonNullElse(labelText, DEFAULT_LABEL);
        addCenterAndLabel();
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

    private void addCenterAndLabel() {
        add(new JPanel() {{
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBackground(ColorUtilities.DEFAULT_COLOR_TRANSPARENT);
            add(new SimpleLabel(labelText, LABEL_TEXT_COLOR));
        }});
    }

    //TODO: add javadoc
    @Override
    public void setBackground(Color background) {
        super.setBackground(Objects.requireNonNullElse(background, DEFAULT_BACKGROUND));
    }
}