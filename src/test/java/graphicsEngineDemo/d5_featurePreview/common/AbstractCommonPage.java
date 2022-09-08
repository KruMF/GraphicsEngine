package graphicsEngineDemo.d5_featurePreview.common;

import graphicsEngine.presets.HeaderAndFooterPage;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public abstract class AbstractCommonPage extends HeaderAndFooterPage {
    //TODO: add javadoc
    public AbstractCommonPage(@Nullable ActionListener actionListener) {
        super(
                new CommonHeader(null, actionListener),
                new CommonFooter(null));
    }
}