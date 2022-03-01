package graphicsEngine.demo.simple.withPages.pages.menuPages.common;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import graphicsEngine.demo.simple.withPages.common.header.HeaderWithButtons;
import graphicsEngine.demo.simple.withPages.pages.menuPages.common.headerButtons.*;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

//TODO: Add javadoc
public class MenuPageHeader extends HeaderWithButtons {

    public MenuPageHeader(@NotNull PanelColors panelColors) {
        super(HEIGHT, panelColors, prepareButtons(getHeight(HEIGHT)));
    }

    static ArrayList<DrawablePart> prepareButtons(int height) {
        int[] buttonSize = new int[] {BUTTON_WIDTH, height};
        return new ArrayList<>() {{
            add(new HB_start(buttonSize));
            add(new HB_settings(buttonSize));
            add(new HB_demoSelect(buttonSize));
        }};
    }
}