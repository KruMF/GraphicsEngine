package graphicsEngine.demo.simple.withPages.pages.demoPages.common;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import graphicsEngine.demo.simple.withPages.common.header.HeaderWithButtons;
import graphicsEngine.demo.simple.withPages.pages.demoPages.common.headerButtons.*;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class DemoPageHeader extends HeaderWithButtons {

    public DemoPageHeader(@NotNull PanelColors panelColors) {
        super(HEIGHT, panelColors, prepareButtons(getHeight(HEIGHT)));
    }

    static ArrayList<DrawablePart> prepareButtons(int height) {
        int[] buttonSize = new int[] {BUTTON_WIDTH, height};
        return new ArrayList<>() {{
            add(new HB_start(buttonSize));
        }};
    }
}