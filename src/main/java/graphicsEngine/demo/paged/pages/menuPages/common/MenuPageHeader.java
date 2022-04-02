package graphicsEngine.demo.paged.pages.menuPages.common;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.parts.simpleParts.DrawablePart;

import graphicsEngine.demo.paged.common.header.HeaderWithButtons;
import graphicsEngine.demo.paged.pages.menuPages.common.headerButtons.*;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

//TODO: Add javadoc
public class MenuPageHeader extends HeaderWithButtons {

    //TODO: Add javadoc
    public MenuPageHeader(@NotNull PanelColors panelColors) {
        super(HEIGHT, panelColors, prepareButtons(getHeight(HEIGHT)));
    }

    private static ArrayList<DrawablePart> prepareButtons(int height) {
        int[] buttonSize = getButtonSize(height);
        return new ArrayList<>() {{
            add(new HB_settings(buttonSize));
            add(new HB_demoSelect(buttonSize));
        }};
    }
}