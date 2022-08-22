package graphicsEngineDemo.twoPageDemo.pages;

import graphicsEngine.panels.PanelColors;
import graphicsEngine.presets.HeaderAndFooterPage;

import graphicsEngineDemo.twoPageDemo.parts.CommonFooter;
import graphicsEngineDemo.twoPageDemo.parts.CommonHeader;

import java.awt.event.ActionListener;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
abstract class AbstractCommonPage extends HeaderAndFooterPage {
    protected AbstractCommonPage(@Nullable PanelColors panelColors,
                                 @Nullable ActionListener actionListener) {
        super(
                new CommonHeader(panelColors, actionListener),
                new CommonFooter(panelColors));
    }
}