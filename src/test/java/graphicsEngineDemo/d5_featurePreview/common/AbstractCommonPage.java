package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.Utilities;
import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;
import graphicsEngine.presets.panels.AbstractHeader;
import graphicsEngine.presets.panels.AbstractFooter;
import graphicsEngineDemo.d5_featurePreview.common.header.CommonHeader;
import graphicsEngineDemo.d5_featurePreview.common.header.HeaderButtonListener;

import java.util.List;
import java.util.Objects;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.ConsoleUtils.printLine;

//TODO: finish this and add javadoc
public abstract class AbstractCommonPage extends HeaderAndFooterPage {
    private HeaderButtonListener headerButtonListener;

    //TODO: add javadoc
    public AbstractCommonPage(@Nullable List<ActionListener> actionListenerList,
                              @Nullable PanelColors panelColors) {
        super(actionListenerList, null, panelColors);
        setBodyParameters();
        addBody(getPageBody());
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
            if (listener instanceof HeaderButtonListener) {
                headerButtonListener = (HeaderButtonListener) listener;
                remainder.remove(i);
                i--;
            }
        }
        return remainder;
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractHeader getHeader(@Nullable PanelColors headerColors) {
        return new CommonHeader(headerColors, headerButtonListener);
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractFooter getFooter(@Nullable PanelColors footerColors) {
        return new CommonFooter(footerColors);
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {}

    //TODO: add javadoc
    public abstract void setBodyParameters();

    private void addBody(@Nullable Component center) {
        add(new JPanel() {
            {
                setLayout(new BorderLayout(0, 0));
                setBackground(Utilities.EMPTY_COLOR);
                add(Objects.requireNonNullElse(center, new JPanel()), BorderLayout.CENTER);
            }

            @Override
            public void repaint() {
                printLine("commonAbstractPage body being repainted");
                Component[] components = getComponents();
                for (Component component : components) {
                    component.repaint();
                }
                super.repaint();
            }
        });
    }

    //TODO: add javadoc
    public abstract @Nullable Component getPageBody();
}