package graphicsEngineOld.oldPagedDemo.pages.demoPages.common;

import graphicsEngineOld.engine.data.colors.PanelColors;
import graphicsEngineOld.parts.simpleParts.DrawablePart;

import graphicsEngineOld.oldPagedDemo.common.header.HeaderWithButtons;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
public class DemoPageHeader extends HeaderWithButtons {

    //TODO: add javadoc
    public DemoPageHeader(@NotNull PanelColors panelColors) {
        super(HEIGHT, panelColors, prepareButtons(getHeight(HEIGHT)));
    }

    private static ArrayList<DrawablePart> prepareButtons(int height) {
        @SuppressWarnings("unused")
        int[] buttonSize = getButtonSize(height);
        return new ArrayList<>();
    }
}