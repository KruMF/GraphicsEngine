package graphicsEngineDemo.d5_featurePreview.common;

import java.util.List;
import java.awt.event.ActionListener;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.pages.HeaderAndFooterPage;
import graphicsEngine.pages.panels.AbstractHeader;
import graphicsEngine.pages.panels.AbstractFooter;

import graphicsEngineDemo.d5_featurePreview.common.header.CommonHeader;
import graphicsEngineDemo.d5_featurePreview.common.header.HeaderButtonListener;

//TODO: finish this and add javadoc
public abstract class AbstractCommonPage extends HeaderAndFooterPage {
    private HeaderButtonListener headerButtonListener;

    //TODO: add javadoc
    public AbstractCommonPage(@Nullable List<ActionListener> actionListenerList) {
        super(actionListenerList, null);
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
    public @NotNull AbstractHeader getHeader(@Nullable SimpleColorScheme colors,
                                             @Nullable BorderProperties borderProperties) {
        return new CommonHeader(colors, borderProperties, headerButtonListener);
    }

    //TODO: add javadoc
    @Override
    public @NotNull AbstractFooter getFooter(@Nullable SimpleColorScheme colors,
                                             @Nullable BorderProperties borderProperties) {
        return new CommonFooter(colors, borderProperties);
    }

    //TODO: add javadoc
    @Override
    public final void addParts() {}
}