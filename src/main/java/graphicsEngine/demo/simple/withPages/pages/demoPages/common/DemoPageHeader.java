package graphicsEngine.demo.simple.withPages.pages.demoPages.common;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import graphicsEngine.demo.simple.withPages.common.header.HeaderWithButtons;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class DemoPageHeader extends HeaderWithButtons {

    public DemoPageHeader(@NotNull PanelColors panelColors) {
        super(HEIGHT, panelColors, prepareButtons(getHeight(HEIGHT)));
    }

    static ArrayList<DrawablePart> prepareButtons(int height) {
        int[] buttonSize = getButtonSize(height);
        return new ArrayList<>();
    }
}