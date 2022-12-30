package graphicsEngineDemo.d5_featurePreview.menuPages.demoSelectPage;

import graphicsEngine.colors.ColorUtilities;
import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.DynamicPanel;
import graphicsEngine.parts.labels.SimpleLabel;
import graphicsEngineDemo.d5_featurePreview.common.AbstractMenuPage;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class DemoSelectPage extends AbstractMenuPage {
    DemoSelectButtonListener demoSelectButtonListener;
    private DemoSelectPage() {
        this(null, null);
    }

    //TODO: add javadoc
    public DemoSelectPage(@Nullable List<ActionListener> actionListenerList,
                          @Nullable SimpleColorScheme colors) {
        super(actionListenerList);
        initializePanels(
                colors,
                new SimpleColorScheme(ColorUtilities.DEFAULT_COLOR_TRANSPARENT, null),
                null);
    }

    //TODO: add javadoc
    @Override
    public final @NotNull String getPageKey() {
        return "demoSelect";
    }

    //TODO: add javadoc
    public static @NotNull String getStaticPageKey() {
        return (new DemoSelectPage()).getPageKey();
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
            if (listener instanceof DemoSelectButtonListener) {
                demoSelectButtonListener = (DemoSelectButtonListener) listener;
                remainder.remove(i);
                i--;
            }
        }
        return remainder;
    }

    //
    @Override
    public @Nullable DynamicPanel getBody(@Nullable SimpleColorScheme colors,
                                          @Nullable BorderProperties borderProperties) {
        return new DynamicPanel(colors) {{
            setLayout(new BorderLayout(0, 0));
            add(new SimpleLabel("Select demo:", Color.white), BorderLayout.NORTH);
            add(getButtonPanel(), BorderLayout.CENTER);
        }};
    }

    private @NotNull JPanel getButtonPanel() {
        return new JPanel() {{
            setBackground(ColorUtilities.DEFAULT_COLOR_TRANSPARENT);
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(new DemoSelectButtonListener.Button_Page1(demoSelectButtonListener));
            add(new DemoSelectButtonListener.Button_Page2(demoSelectButtonListener));
            add(new DemoSelectButtonListener.Button_Page3(demoSelectButtonListener));
            add(new DemoSelectButtonListener.Button_Page4(demoSelectButtonListener));
            //Add more buttons here
        }};
    }
}