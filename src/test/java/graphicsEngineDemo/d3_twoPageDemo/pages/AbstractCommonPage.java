package graphicsEngineDemo.d3_twoPageDemo.pages;

import graphicsEngine.parts.SimpleLabel;
import graphicsEngine.presets.HeaderAndFooterPage;

import graphicsEngineDemo.d3_twoPageDemo.parts.CommonFooter;
import graphicsEngineDemo.d3_twoPageDemo.parts.CommonHeader;

import java.util.Objects;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class AbstractCommonPage extends HeaderAndFooterPage {
    private static final Color
            DEFAULT_BACKGROUND = Color.black,
            LABEL_TEXT_COLOR = new Color(30, 30, 150);
    private static final String DEFAULT_LABEL = "No label defined for this page";
    private final String labelText;

    //TODO: add javadoc
    protected AbstractCommonPage(@Nullable ActionListener actionListener,
                                 @Nullable String labelText) {
        super(
                new CommonHeader(null, actionListener),
                new CommonFooter(null));
        this.labelText = Objects.requireNonNullElse(labelText, DEFAULT_LABEL);
        addCenterAndLabel();
    }

    //TODO: add javadoc
    @Override
    public void addParts() {}

    private void addCenterAndLabel() {
        add(new JPanel() {{
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBackground(new Color(0,0,0,0));
            add(new SimpleLabel(labelText, LABEL_TEXT_COLOR));
        }});
    }

    //TODO: add javadoc
    @Override
    public void setBackground(Color background) {
        super.setBackground(Objects.requireNonNullElse(background, DEFAULT_BACKGROUND));
    }
}